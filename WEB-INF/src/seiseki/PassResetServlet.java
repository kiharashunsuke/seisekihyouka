package seiseki;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PassResetServlet extends HttpServlet {
	private static final String SENDER_EMAIL = "p2406.s-kihara@uknet.co.jp"; // 送信者のメールアドレス
	private static final String SENDER_PASSWORD = "6vmDP-tGP2"; // 送信者のメールパスワード
	private static final String MAIL_SUBJECT = "パスワード変更"; // メールの件名

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("Windows-31J");
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String userEmail = request.getParameter("email");
		// SMTPサーバーの設定
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "www3345.sakura.ne.jp"); // SMTPサーバーホスト
		props.put("mail.smtp.port", "25"); // SMTPポート

		// セッションの生成
		Session session = Session.getDefaultInstance(props, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(SENDER_EMAIL, SENDER_PASSWORD);
			}
		});
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/logindb",
					//"jdbc:postgresql://52.195.46.205:5432/seiseki_database",
					"postgres", "postgres");
			ps = conn.prepareStatement("SELECT * FROM LOGIN WHERE EMAIL = ?");
			ps.setString(1, userEmail);
			rs = ps.executeQuery();
			boolean bo = rs.next();
			if (bo) {
				// メッセージの構築
				Message message = new MimeMessage(session);
				message.setFrom(new InternetAddress(SENDER_EMAIL));
				message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(userEmail));
				message.setSubject(MAIL_SUBJECT);
				message.setText("パスワード変更のリンク:http://localhost:8080/seisekihyouka/seiseki/passResetMail.jsp");
				// メッセージの送信
				Transport.send(message);
				System.out.println("Password reset email sent successfully.");
			} else {
				request.getRequestDispatcher("/seiseki/passReset.jsp").forward(request, response);
			}
		} catch (MessagingException e) {
			e.printStackTrace();
			System.out.println("Failed to send password reset email.");
			request.getRequestDispatcher("/seiseki/passReset.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Failed to send password reset email.");
			request.getRequestDispatcher("/seiseki/passReset.jsp").forward(request, response);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Failed to send password reset email.");
			request.getRequestDispatcher("/seiseki/passReset.jsp").forward(request, response);
		}
	}
}
