package seisekikanri;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewLoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("Windows-31J");
        String id = request.getParameter("id");
        String password = request.getParameter("password");
        String mail = request.getParameter("mail");

        String forwardURL = null;
        try {
        	LogBean lbean = new LogBean(id, password,mail);
            int updateCount = LogDAO.insert(lbean);
        	if(updateCount < 1) {
        		forwardURL = "/seisekikanri/newLoginError.jsp";
        	} else {
        		forwardURL = "/seisekikanri/log.jsp";
        	}
        }catch(NumberFormatException e) {
        		e.printStackTrace();
        		forwardURL = "/seisekikanri/newLoginError.jsp";
        }catch(SQLException e) {
        	e.printStackTrace();
        	forwardURL = "/seisekikanri/newLoginError.jsp";
        }
        	request.getRequestDispatcher(forwardURL).forward(request, response);

	}
}