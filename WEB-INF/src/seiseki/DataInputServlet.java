package seiseki;
import java.io.IOException;

import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DataInputServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("Windows-31J");
        //String name = request.getParameter("name");
        String stu_no = request.getParameter("stu_no");
        String japanese = request.getParameter("japanese");
        String math = request.getParameter("math");
        String science = request.getParameter("science");
        String social = request.getParameter("social");
        String english = request.getParameter("english");
        String goukei = request.getParameter("goukei");

        String forwardURL = null;
        try {
        	DataInputBean dibean = new DataInputBean(Integer.parseInt(stu_no), Integer.parseInt(japanese), Integer.parseInt(math), Integer.parseInt(science), Integer.parseInt(social), Integer.parseInt(english), Integer.parseInt(goukei));
            int updateCount = DataInputDAO.update(dibean);
        	if(updateCount < 1) {
        		forwardURL = "/seseki/testAddError.jsp";
        	} else {
        		forwardURL = "/seiseki/testAdd.jsp";
        	}
        }catch(NumberFormatException e) {
        		e.printStackTrace();
        		forwardURL = "/seiseki/testAddError.jsp";
        }catch(SQLException e) {
        	e.printStackTrace();
        	forwardURL = "/seiseki/testAddError.jsp";
        }
        	request.getRequestDispatcher(forwardURL).forward(request, response);

	}
}
