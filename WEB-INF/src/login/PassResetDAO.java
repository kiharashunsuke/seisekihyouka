package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import newLogin.LogBean;

public class PassResetDAO {
	public static Connection getConnection() throws SQLException {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(
					//"jdbc:postgresql://localhost:5432/logindb",
					"jdbc:postgresql://52.195.46.205:5432/seiseki",
					"postgres", "postgres");
			return con;
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		}
	}

	public int update(LogBean lbean) {
		Connection con = null;
		Statement smt = null;

		int count = 0;

		String sql = "UPDATE LOGIN SET "
				+ "PASSWORD = '" + lbean.getPassword() + "' "
				+ "WHERE ID = '" + lbean.getId() +"'" ;

		try {
			con = getConnection();
			smt = con.createStatement();

			count = smt.executeUpdate(sql);
		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			//リソースの開放
			if (smt != null) {
				try {
					smt.close();
				} catch (SQLException e) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
				}
			}
		}
		return count;

	}
}
