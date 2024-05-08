package newLogin;
import java.sql.SQLException;

public class LogDAO {
	public static int insert(LogBean lbean) throws SQLException{
		String sql = "INSERT INTO LOGIN" +
	    "(ID, PASSWORD) VALUES(" +
	    "'" + lbean.getId() + "', " +
	    "'" + lbean.getPassword() + "'"  + ")";
		return DBManager.simpleUpdate(sql);
	}
}