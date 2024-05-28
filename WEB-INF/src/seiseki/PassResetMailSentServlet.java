package seiseki;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PassResetMailSentServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("Windows-31J");
		String id = request.getParameter("id");
		String password = request.getParameter("password");

		String forwardURL = null;
		try {
			PassResetMailBean pp = new PassResetMailBean(id, password);
			int updateCount = PassResetDAO.update(pp);
			if(updateCount < 1) {
				forwardURL = "/seiseki/passReset.jsp";
			}else {
				forwardURL = "/seiseki/log.jsp";
			}
		}catch(NumberFormatException e) {
        		e.printStackTrace();
        		forwardURL = "/seiseki/passReset.jsp";
        }
        	request.getRequestDispatcher(forwardURL).forward(request, response);

	}
}
