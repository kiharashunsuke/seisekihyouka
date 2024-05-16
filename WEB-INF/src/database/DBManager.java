package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBManager {
	public static Connection getConnection() throws SQLException{
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:postgresql://52.195.46.205/seiseki_database",
					"postgres", "postgres");
			return con;

		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		}
	}

	public static int simpleUpdate(String sql) throws SQLException{

		Connection con = null;
		Statement smt = null;
		try {
			con = getConnection();
			smt = con.createStatement();
			return smt.executeUpdate(sql);
		} finally {
			if(smt != null) {
				try {
					smt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static <T> List<T> findAll(String sql, ResultSetBeanMapping<T> mapping)
		throws SQLException{

		Connection con = null;
		Statement smt = null;
		try {
			con = getConnection();
			smt = con.createStatement();
			//データベースから呼び出し
			ResultSet rs = smt.executeQuery(sql);

			//studentListを作成してDBのデータ（名前）をリストに登録
			List<T> studentList = new ArrayList<T>();
			while (rs.next()) {
				T bean = mapping.createFromResultSet(rs);
				studentList.add(bean);
			}
			return studentList;
		} finally {
			if (smt != null) {
				try {
					smt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
	}
}