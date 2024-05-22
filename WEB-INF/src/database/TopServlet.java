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
			int number = 0;
			int studentNumber = 0;
			//セレクトボックスで選択した生徒をint型のnumber（出席番号）で受け取り
			number = Integer.parseInt(request.getParameter("number"));
			//リストに格納する際、0番から始まるので－1する
			studentNumber = number - 1;
			//もう一つのセレクトボックスでテストの名前をString型のtableNameで受け取り
			String tableName = request.getParameter("tableName");
			//TableBeanのメソッドを試用するため呼び出し
			TableBean tbean = new TableBean();
			tbean.setTableName(tableName);
			//scoreListを呼び出し
			List<StudentBean> scoreList = TestScoreDAO.getScoreList(tbean);
			//request.setAttributeでjspに送信する準備
			request.setAttribute("tableName", tableName);
			request.setAttribute("scoreList", scoreList);
			request.setAttribute("studentNumber" ,studentNumber);
			//一連の流れが問題ない場合の送信先URL
			forwardURL = "/database/selectresult.jsp";
			//Exception検出時の対応と画面遷移先URL
		} catch (SQLException e) {
			e.printStackTrace();
			forwardURL = "/database/selecterror.jsp";
		}
		//データの送信と画面遷移
		request.getRequestDispatcher(forwardURL).forward(request, response);
	}
}
