package seiseki;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PassResetMailSentServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("Windows-31J");
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String id = request.getParameter("id");
		String password = request.getParameter("password");

		String forwardURL = null;
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/logindb",
					//"jdbc:postgresql://52.195.46.205:5432/seiseki_database",
					"postgres", "postgres");
			ps = conn.prepareStatement("SELECT * FROM LOGIN WHERE PASSWORD = ?");
			ps.setString(1, password);
			rs = ps.executeQuery();
			boolean bo = rs.next();
			PassResetMailBean pp = new PassResetMailBean(id, password);
			int updateCount = PassResetDAO.update(pp);
			if(updateCount < 1 || bo ) {
				forwardURL = "/seseki/passResetMailError.jsp";
			}else {
				forwardURL = "/seiseki/log.jsp";
			}
		}catch(NumberFormatException e) {
        		e.printStackTrace();
        		forwardURL = "/seiseki/passResetMailError.jsp";
        } catch (ClassNotFoundException e) {
			e.printStackTrace();
			forwardURL = "/seiseki/passResetMailError.jsp";
		} catch (SQLException e) {
			e.printStackTrace();
			forwardURL = "/seiseki/passResetMailError.jsp";
		}
        	request.getRequestDispatcher(forwardURL).forward(request, response);

	}
}
