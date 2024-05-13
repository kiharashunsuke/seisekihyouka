package database;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SelectServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{

		String forwardURL = null;
		try {
			List<StudentBean> studentList = CustomerDAO.getStudentList();
			request.setAttribute("studentList", studentList);
			forwardURL = "/database/selectresult.jsp";
		} catch (SQLException e) {
			e.printStackTrace();
			forwardURL = "/database/selecterror.jsp";
		}

		//selectresultにデータを送信
		request.getRequestDispatcher(forwardURL).forward(request, response);
	}
}