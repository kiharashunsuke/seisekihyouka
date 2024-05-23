package seiseki;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PassResetServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String error = "";
		try {
			request.setCharacterEncoding("Windows-31J");
			String id = request.getParameter("id");
			String password = request.getParameter("password");
			LoginBean lbean = new LoginBean(id, password);

			PassResetDAO pRe = new PassResetDAO();

			int count = pRe.update(lbean);

			request.setAttribute("count", count);

		} catch (IllegalStateException e) {
			error = "DB接続エラーの為、更新できませんでした。";
			request.getRequestDispatcher("/seiseki/passReset.jsp").forward(request, response);
		} catch (Exception e) {
			error = "予期せぬエラーが発生しました。<br>" + e;
			request.getRequestDispatcher("/seiseki/passReset.jsp").forward(request, response);
		} finally {
			request.setAttribute("error", error);
			request.getRequestDispatcher("/seiseki/passReset.jsp").forward(request, response);
		}
	}
}

