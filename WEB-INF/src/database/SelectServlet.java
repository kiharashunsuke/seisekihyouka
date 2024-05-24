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
			//生徒の名前と、テスト名を選択するセレクトボックスの要素に使用するリストの呼び出し
			List<StudentBean> studentList = TestScoreDAO.getStudentList();
			List<TableBean> tableList = TestScoreDAO.getTableList();
			//データ送信の準備
			request.setAttribute("studentList", studentList);
<<<<<<< HEAD
			forwardURL = "/database/selectresult.jsp";
=======
			request.setAttribute("tableList", tableList);
			//成功時の送信先URL
			forwardURL = "/database/selecttop.jsp";
			//Exceptionの対応
>>>>>>> da37c1e86a35666e66fd59337022580ccfc2171b
		} catch (SQLException e) {
			e.printStackTrace();
			forwardURL = "/database/selecterror.jsp";
		}

		//selectresultにデータを送信
		request.getRequestDispatcher(forwardURL).forward(request, response);
	}
<<<<<<< HEAD
=======

>>>>>>> da37c1e86a35666e66fd59337022580ccfc2171b
}