package database;

import java.sql.SQLException;
import java.util.List;

public class CustomerDAO {

//String型で、SELECT文をDBManagerに返す
	public static List<CustomerBean> getCustomerList() throws SQLException {
		/*public static List<StudentBean> getStudentList() throws SQLException {*/
		//String sql = "SELECT name FROM seisekihyou_03";
		String sql = "SELECT name, student_no, kesseki_1, kesseki_2, tyukan_1_1_japanese, tyukan_1_1_math, tyukan_1_1_english, tyukan_1_1_science, tyukan_1_1_social, tyukan_1_1_goukei, kimatu_1_1_japanese,  kimatu_1_1_math, kimatu_1_1_english, kimatu_1_1_science, kimatu_1_1_social, kimatu_1_1_goukei, tyukan_1_2_japanese, tyukan_1_2_math, tyukan_1_2_english, tyukan_1_2_science, tyukan_1_2_social, tyukan_1_2_goukei, kimatu_1_2_japanese,  kimatu_1_2_math, kimatu_1_2_english, kimatu_1_2_scoience, kimatu_1_2_social,  kimatu_1_2_goukei, gakuryokutest_1_japanese, gakuryokutest_math, gakuryokutest_english, gakuryokutest_science, gakuryokutest_social, gakuryokutest_goukei, tyukan_2_1_japanese, tyukan_2_1_math, tyukan_2_1_english, tyukan_2_1_science, tyukan_2_1_social, tyukan_2_1_goukei, kimatu_2_1_japanese, kimatu_2_1_math, kimatu_2_1_english, kimatu_2_1_science, kimatu_2_1_social, kimatu_2_1_goukei, tyukan_2_2_japanese, tyukan_2_2_math, tyukan_2_2_english, tyukan_2_2_science, tyukan_2_2_social, tyukan_2_2_goukei, kimatu_2_2_japanese, kimatu_2_2_math, kimatu_2_2_english, kimatu_2_2_science, kimatu_2_2_social, kimatu_2_2_goukei, gakuryokutest_2_japanese, gakuryokutest_2_math, gakuryokutest_2_english, gakuryokutest_2_science, gakuryokutest_2_social, gakuryokutest_2_goukei,tairyokutest_1, tairyokutest_2, tyukan_3_1_japanese, tyukan_3_1_math, tyukan_3_1_english, tyukan_3_1_science, tyukan_3_1_social, tyukan_3_1_goukei,kimatu_3_1_japanese, kimatu_3_1_math, kimatu_3_1_english, kimatu_3_1_science, kimatu_3_1_social,  kimatu_3_1_goukei,tyukan_3_2_japanese, tyukan_3_2_math, tyukan_3_2_english, tyukan_3_2_science, tyukan_3_2_social, tyukan_3_2_goukei, kimatu_3_2_japanese, kimatu_3_2_math, kimatu_3_2_english, kimatu_3_2_science, kimatu_3_2_social, kimatu_3_2_goukei,gakuryokutest_3_japanese, gakuryokutest_3_math, gakuryokutest_3_english, gakuryokutest_3_science, gakuryokutest_3_social, gakuryokutest_3_goukei FROM student";
		return DBManager.findAll(sql, new CustomerBeanMapping());
		/*return DBManager.findAll(sql, new StudentBeanMapping());*/
	}
}
