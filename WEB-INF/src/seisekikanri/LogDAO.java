package seisekikanri;

import java.sql.SQLException;

public class LogDAO {
	public static int insert(LogBean lbean) throws SQLException{
		String sql = "INSERT INTO LOGIN" +
			    "(ID, PASSWORD, MAIL) VALUES(" +
			    "'" + lbean.getId() + "', " +
			    "'" + lbean.getPassword() + "', " +
			    "'" + lbean.getMail() + "'" + ")";
		return DBManager.simpleUpdate(sql);
	}
}
