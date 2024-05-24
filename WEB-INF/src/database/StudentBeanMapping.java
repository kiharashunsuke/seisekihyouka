package database;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentBeanMapping implements ResultSetBeanMapping<StudentBean> {
	//StudentBeanのメソッドの紐づけ
	public StudentBean createFromResultSet(ResultSet rs) throws SQLException{
		StudentBean sbean = new StudentBean();
		/*
		 * nameのみ使いたい時に他のデータがあると
		 * エラーが出たためコメントとして保存している。
		 */
		sbean.setName(rs.getString("name"));

		/*sbean.setJapanese(rs.getInt("japanese"));

		sbean.setStudent_no(rs.getInt("student_no"));
		sbean.setJapanese(rs.getInt("japanese"));

		sbean.setMath(rs.getInt("math"));
		sbean.setScience(rs.getInt("science"));
		sbean.setSocial(rs.getInt("social"));
		sbean.setEnglish(rs.getInt("english"));
		sbean.setGoukei(rs.getInt("goukei"));*/

		sbean.setGoukei(rs.getInt("goukei"));

		return sbean;
	}

}