package seisekikanri;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LogServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// ログイン画面へ遷移
    	RequestDispatcher rd = request.getRequestDispatcher("/seisekikanri/log.jsp");
    	rd.forward(request, response);
	}

    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		// Jspのフォーム画面からログイン対象ユーザIDとパスワードを取得
    		request.setCharacterEncoding("UTF-8");
    		String id = request.getParameter("id");
    		String password = request.getParameter("password");

    		try{
    			// Beanクラスのインスタンス
    			LoginBean input_user = new LoginBean();

    			// Beanクラスに入力したユーザIDとパスワードをセットする
    			input_user.setId(id);
    			input_user.setPassword(password);

    			// リスト＜Beanクラス＞に検索結果を格納する
    			ArrayList<LoginBean> user_list = LoginDAO.getInstance().SelectLoginUser(input_user);

    			// ユーザ情報なしもしくは複数件の場合はログイン画面に戻る
    			if (user_list == null || user_list.size() != 1){
    				// ログインフラグを立てる（0：OK、1：NG）
    				LoginBean result = new LoginBean();
    				result.setLogin_user_flg(1);
    				// ログイン画面に返す
    				request.setAttribute("result", result);
    				request.getRequestDispatcher("/seisekikanri/log.jsp").forward(request, response);
    			} else {
    				// ログインユーザ用にBeanクラスをインスタンス
    				LoginBean result_user = new LoginBean();

    				// ユーザIDとユーザ名のみ新たにBeanクラスに格納する
    				result_user.setId(user_list.get(0).getId());
    				result_user.setPassword(user_list.get(0).getPassword());

    				// ログインOK画面に返す
    				HttpSession session = request.getSession();
    				session.setAttribute("result_user", result_user);
    				request.getRequestDispatcher("/seisekikanri/Main.jsp").forward(request, response);

    			}
    		}catch(Exception e){
    			//何らかの理由で失敗したらエラーページにエラー文を渡して表示。
                request.setAttribute("error", e.getMessage());
                request.getRequestDispatcher("/seisekikanri/logError.jsp").forward(request, response);
    		}
    	}

    }


