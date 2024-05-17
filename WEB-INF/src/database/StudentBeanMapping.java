package database;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentBeanMapping implements ResultSetBeanMapping<StudentBean> {

	public StudentBean createFromResultSet(ResultSet rs) throws SQLException{
		StudentBean sbean = new StudentBean();

		sbean.setName(rs.getString("name"));
		sbean.setStudent_no(rs.getInt("student_no"));
		sbean.setGakuryokutest_1_japanese(rs.getInt("gakuryokutest_1_japanese"));
		sbean.setGakuryokutest_math(rs.getInt("gakuryokutest_math"));
		sbean.setGakuryokutest_science(rs.getInt("gakuryokutest_science"));
		sbean.setGakuryokutest_social(rs.getInt("gakuryokutest_social"));
		sbean.setGakuryokutest_english(rs.getInt("gakuryokutest_english"));
		sbean.setGakuryokutest_goukei(rs.getInt("gakuryokutest_goukei"));
		sbean.setGakuryokutest_2_japanese(rs.getInt("gakuryokutest_2_japanese"));
		sbean.setGakuryokutest_2_math(rs.getInt("gakuryokutest_2_math"));
		sbean.setGakuryokutest_2_science(rs.getInt("gakuryokutest_2_science"));
		sbean.setGakuryokutest_2_social(rs.getInt("gakuryokutest_2_social"));
		sbean.setGakuryokutest_2_english(rs.getInt("gakuryokutest_2_english"));
		sbean.setGakuryokutest_2_goukei(rs.getInt("gakuryokutest_2_goukei"));
		return sbean;
	}

}