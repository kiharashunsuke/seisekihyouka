package database;


import java.sql.ResultSet;
import java.sql.SQLException;

public class  CustomerBeanMapping implements ResultSetBeanMapping<CustomerBean> {


	public CustomerBean createFromResultSet(ResultSet rs) throws SQLException{
		CustomerBean cbean = new CustomerBean();

		cbean.setName(rs.getString("name"));
		cbean.setStudent_no(rs.getInt("student_no"));
		cbean.setKesseki_1(rs.getInt("kesseki_1"));
		cbean.setKesseki_1(rs.getInt("kesseki_2"));
		cbean.setTyukan_1_1_japanese(rs.getInt("tyukan_1_1_japanese"));
		cbean.setTyukan_1_1_math(rs.getInt("tyukan_1_1_math"));
		cbean.setTyukan_1_1_english(rs.getInt("tyukan_1_1_english"));
		cbean.setTyukan_1_1_science(rs.getInt("tyukan_1_1_science"));
		cbean.setTyukan_1_1_social(rs.getInt("tyukan_1_1_social"));
		cbean.setTyukan_1_1_goukei(rs.getInt("tyukan_1_1_goukei"));
		cbean.setKimatu_1_1_japanese(rs.getInt("kimatu_1_1_japanese"));
		cbean.setKimatu_1_1_math(rs.getInt("kimatu_1_1_math"));
		cbean.setKimatu_1_1_english(rs.getInt("kimatu_1_1_english"));
		cbean.setKimatu_1_1_science(rs.getInt("kimatu_1_1_science"));
		cbean.setKimatu_1_1_social(rs.getInt("kimatu_1_1_social"));
		cbean.setKimatu_1_1_goukei(rs.getInt("kimatu_1_1_goukei"));
		cbean.setTyukan_1_2_japanese(rs.getInt("tyukan_1_2_japanese"));
		cbean.setTyukan_1_2_math(rs.getInt("tyukan_1_2_math"));
		cbean.setTyukan_1_2_english(rs.getInt("tyukan_1_2_english"));
		cbean.setTyukan_1_2_science(rs.getInt("tyukan_1_2_science"));
		cbean.setTyukan_1_2_social(rs.getInt("tyukan_1_2_social"));
		cbean.setTyukan_1_2_goukei(rs.getInt("tyukan_1_2_goukei"));
		cbean.setKimatu_1_2_japanese(rs.getInt("kimatu_1_2_japanese"));
		cbean.setKimatu_1_2_math(rs.getInt("kimatu_1_2_math"));
		cbean.setKimatu_1_2_english(rs.getInt("kimatu_1_2_english"));
		cbean.setKimatu_1_2_scoience(rs.getInt("kimatu_1_2_scoience"));
		cbean.setKimatu_1_2_social(rs.getInt("kimatu_1_2_social"));
		cbean.setKimatu_1_2_goukei(rs.getInt("kimatu_1_2_goukei"));
		cbean.setGakuryokutest_1_japanese(rs.getInt("gakuryokutest_1_japanese"));
		cbean.setGakuryokutest_math(rs.getInt("gakuryokutest_math"));
		cbean.setGakuryokutest_english(rs.getInt("gakuryokutest_english"));
		cbean.setGakuryokutest_science(rs.getInt("gakuryokutest_science"));
		cbean.setGakuryokutest_social(rs.getInt("gakuryokutest_social"));
		cbean.setGakuryokutest_goukei(rs.getInt("gakuryokutest_goukei"));


		cbean.setTyukan_2_1_japanese(rs.getInt("tyukan_2_1_japanese"));
		cbean.setTyukan_2_1_math(rs.getInt("tyukan_2_1_math"));
		cbean.setTyukan_2_1_english(rs.getInt("tyukan_2_1_english"));
		cbean.setTyukan_2_1_science(rs.getInt("tyukan_2_1_science"));
		cbean.setTyukan_2_1_social(rs.getInt("tyukan_2_1_social"));
		cbean.setTyukan_2_1_goukei(rs.getInt("tyukan_2_1_goukei"));
		cbean.setKimatu_2_1_japanese(rs.getInt("kimatu_2_1_japanese"));
		cbean.setKimatu_2_1_math(rs.getInt("kimatu_2_1_math"));
		cbean.setKimatu_2_1_english(rs.getInt("kimatu_2_1_english"));
		cbean.setKimatu_2_1_science(rs.getInt("kimatu_2_1_science"));
		cbean.setKimatu_2_1_social(rs.getInt("kimatu_2_1_social"));
		cbean.setKimatu_2_1_goukei(rs.getInt("kimatu_2_1_goukei"));
		cbean.setTyukan_2_2_japanese(rs.getInt("tyukan_2_2_japanese"));
		cbean.setTyukan_2_2_math(rs.getInt("tyukan_2_2_math"));
		cbean.setTyukan_2_2_english(rs.getInt("tyukan_2_2_english"));
		cbean.setTyukan_2_2_science(rs.getInt("tyukan_2_2_science"));
		cbean.setTyukan_2_2_social(rs.getInt("tyukan_2_2_social"));
		cbean.setTyukan_2_2_goukei(rs.getInt("tyukan_2_2_goukei"));
		cbean.setKimatu_2_2_japanese(rs.getInt("kimatu_2_2_japanese"));
		cbean.setKimatu_2_2_math(rs.getInt("kimatu_2_2_math"));
		cbean.setKimatu_2_2_english(rs.getInt("kimatu_2_2_english"));
		cbean.setKimatu_2_2_science(rs.getInt("kimatu_2_2_science"));
		cbean.setKimatu_2_2_social(rs.getInt("kimatu_2_2_social"));
		cbean.setKimatu_2_2_goukei(rs.getInt("kimatu_2_2_goukei"));
		cbean.setGakuryokutest_2_japanese(rs.getInt("gakuryokutest_2_japanese"));
		cbean.setGakuryokutest_2_math(rs.getInt("gakuryokutest_2_math"));
		cbean.setGakuryokutest_2_english(rs.getInt("gakuryokutest_2_english"));
		cbean.setGakuryokutest_2_science(rs.getInt("gakuryokutest_2_science"));
		cbean.setGakuryokutest_2_social(rs.getInt("gakuryokutest_2_social"));
		cbean.setGakuryokutest_2_goukei(rs.getInt("gakuryokutest_2_goukei"));


		/*cbean.setTairyokutest_1(rs.getInt("tairyokutest_1"));
		cbean.setTairyokutest_2(rs.getInt("tairyokutest_2"));*/


		cbean.setTyukan_3_1_japanese(rs.getInt("tyukan_3_1_japanese"));
		cbean.setTyukan_3_1_math(rs.getInt("tyukan_3_1_math"));
		cbean.setTyukan_3_1_english(rs.getInt("tyukan_3_1_english"));
		cbean.setTyukan_3_1_science(rs.getInt("tyukan_3_1_science"));
		cbean.setTyukan_3_1_social(rs.getInt("tyukan_3_1_social"));
		cbean.setTyukan_3_1_goukei(rs.getInt("tyukan_3_1_goukei"));
		cbean.setKimatu_3_1_japanese(rs.getInt("kimatu_3_1_japanese"));
		cbean.setKimatu_3_1_math(rs.getInt("kimatu_3_1_math"));
		cbean.setKimatu_3_1_english(rs.getInt("kimatu_3_1_english"));
		cbean.setKimatu_3_1_science(rs.getInt("kimatu_3_1_science"));
		cbean.setKimatu_3_1_social(rs.getInt("kimatu_3_1_social"));
		cbean.setKimatu_3_1_goukei(rs.getInt("kimatu_3_1_goukei"));
		cbean.setTyukan_3_2_japanese(rs.getInt("tyukan_3_2_japanese"));
		cbean.setTyukan_3_2_math(rs.getInt("tyukan_3_2_math"));
		cbean.setTyukan_3_2_english(rs.getInt("tyukan_3_2_english"));
		cbean.setTyukan_3_2_science(rs.getInt("tyukan_3_2_science"));
		cbean.setTyukan_3_2_social(rs.getInt("tyukan_3_2_social"));
		cbean.setTyukan_3_2_goukei(rs.getInt("tyukan_3_2_goukei"));
		cbean.setKimatu_3_2_japanese(rs.getInt("kimatu_3_2_japanese"));
		cbean.setKimatu_3_2_math(rs.getInt("kimatu_3_2_math"));
		cbean.setKimatu_3_2_english(rs.getInt("kimatu_3_2_english"));
		cbean.setKimatu_3_2_science(rs.getInt("kimatu_3_2_science"));
		cbean.setKimatu_3_2_social(rs.getInt("kimatu_3_2_social"));
		cbean.setKimatu_3_2_goukei(rs.getInt("kimatu_3_2_goukei"));
		cbean.setGakuryokutest_3_japanese(rs.getInt("gakuryokutest_3_japanese"));
		cbean.setGakuryokutest_3_math(rs.getInt("gakuryokutest_3_math"));
		cbean.setGakuryokutest_3_english(rs.getInt("gakuryokutest_3_english"));
		cbean.setGakuryokutest_3_science(rs.getInt("gakuryokutest_3_science"));
		cbean.setGakuryokutest_3_social(rs.getInt("gakuryokutest_3_social"));
		cbean.setGakuryokutest_3_goukei(rs.getInt("gakuryokutest_3_goukei"));
		return cbean;

	}
}

