package database;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TopServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
		String forwardURL = null;
		try {
			List<StudentBean> studentList = CustomerDAO.getStudentList();

			int number = 0;
			int studentNumber = 0;
			number = Integer.parseInt(request.getParameter("number"));
			studentNumber = number - 1;

			request.setAttribute("studentList", studentList);
			request.setAttribute("studentNumber" ,studentNumber);

			forwardURL = "/database/selectresult.jsp";

			//request.getRequestDispatcher(forwardURL).forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
			forwardURL = "/database/selecterror.jsp";
		}
		request.getRequestDispatcher(forwardURL).forward(request, response);
	}
}
