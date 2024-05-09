package newLogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class DBManager {
	public static Connection getConnection() throws SQLException{
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(
					//"jdbc:postgresql://localhost:5432/logindb",
					"jdbc:postgresql://43.207.27.181:5432/seiseki",
					"postgres", "postgres");
			        return con;
		} catch(ClassNotFoundException e) {
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
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}