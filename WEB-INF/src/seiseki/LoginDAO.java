package seiseki;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LoginDAO {
	public static LoginDAO getInstance() {
		return new LoginDAO();
	}

	// 検索処理
	// 引数		：Beanクラス
	// 戻り値		：ArrayList<Beanクラス>
	public ArrayList<LoginBean> SelectLoginUser(LoginBean input_user) throws SQLException {
		// 初期値をセット
		Connection db_con = null;
		String id = input_user.getId();
		String password = input_user.getPassword();

		// 複数のユーザ情報を格納するため、Beanを格納する配列を作成
		ArrayList<LoginBean> 	array_userinfo = new ArrayList<LoginBean>();

		try {
			Class.forName("org.postgresql.Driver");
			db_con = DriverManager.getConnection(
					//"jdbc:postgresql://localhost:5432/logindb",
					"jdbc:postgresql://52.195.46.205:5432/logindb_seisekihyouka",
					"postgres", "postgres");

			String sql = "select * from login where id = ? and  password = ?";

			PreparedStatement ps = db_con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			LoginBean resultUserInfo = new LoginBean();

			while(rs.next()) {
				// ユーザIDと名前をBeanクラスへセット
				resultUserInfo.setId(rs.getString("id"));
				resultUserInfo.setPassword(rs.getString("password"));

				// リストにBeanクラスごと格納
				array_userinfo.add(resultUserInfo);

				//Beanクラスを初期化
				resultUserInfo = new LoginBean();
				}


		} catch(SQLException sql_e) {
			// エラーハンドリング
			System.out.println("sql実行失敗");
			sql_e.printStackTrace();

		} catch(ClassNotFoundException e) {
			// エラーハンドリング
			System.out.println("JDBCドライバ関連エラー");
			e.printStackTrace();

		} finally {
			// DB接続を解除
			if (db_con != null) {
					db_con.close();
			}
		}
		// リストを返す
		return array_userinfo;
	}
}


