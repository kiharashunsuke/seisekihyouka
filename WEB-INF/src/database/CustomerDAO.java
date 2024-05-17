package database;

import java.sql.SQLException;
import java.util.List;

public class CustomerDAO {
	/*	public static int insert(StudentBean sbean) throws SQLException{
		String sql = "INSERT INTO seisekihyou_03" +
		"(japanese, math, science, social, english, goukei) VALUES(" +
		"'" + sbean.getName() + "'," +
		"'" + sbean.getJapanese() + "'," +
		"'" + sbean.getMath() + "'," +
		"'" + sbean.getScience() + "'," +
		"'" + sbean.getSocial() + "'," +
		"'" + sbean.getEnglish() + "'," +
		sbean.getGoukei() + ")";
		return DBManager.simpleUpdate(sql);
	}
	*/
//String型で、SELECT文をDBManagerに返す
	public static List<StudentBean> getStudentList() throws SQLException{
		//String sql = "SELECT name FROM seisekihyou_03";
		String sql = "SELECT name, student_no, gakuryokutest_1_japanese, gakuryokutest_math, gakuryokutest_english,gakuryokutest_science,gakuryokutest_social, gakuryokutest_goukei,gakuryokutest_2_japanese,gakuryokutest_2_math, gakuryokutest_2_english,gakuryokutest_2_science,gakuryokutest_2_social, gakuryokutest_2_goukei FROM student";
		return DBManager.findAll(sql, new StudentBeanMapping());
	}

}

