package seiseki;

import java.sql.SQLException;

import seiseki.DBManager;

public class DataInputDAO {

	public static int update(DataInputBean dibean) throws SQLException{
		//テーブル名、列名変更予定
		 String sql = "UPDATE STUDENT SET"
	     + "\"tyukan_3_1_japanese\" = " + dibean.getJapanese() + ", "
	     + "\"tyukan_3_1_math\" = " + dibean.getMath() + ", "
	     + "\"tyukan_3_1_english\" = " + dibean.getEnglish() + ", "
	     + "\"tyukan_3_1_science\" = " + dibean.getScience() + ", "
	     + "\"tyukan_3_1_social\" = " + dibean.getSocial() + ", "
	     + "\"tyukan_3_1_goukei\" = " + dibean.getGoukei() + " "
	     /*+ "WHERE NAME = " + dibean.getName() + " "*/
	     + "WHERE STU_NO = " + dibean.getStu_no() + " ";
		/*String sql = "INSERT INTO STUDENT" +
	     "(TYUKAN_3_1_JAPANESE, TYUKAN_3_1_MATH, TYUKAN_3_1_ENGLISH, TYUKAN_3_1_SCIENCE, TYUKAN_3_1_SOCIAL, TYUKAN_3_1_GOUKEI) VALUES (" +
		 "'" + dibean.getJapanese() + "', " +
	     "'" + dibean.getMath() + "', " +
		 "'" + dibean.getEnglish() + "'," +
	     "'" + dibean.getScience() + "'," +
		 "'" + dibean.getSocial() + "', " +
	     "'" + dibean.getGoukei() +  "'," +
	     "(WHERE NAME = '" + dibean.getName() + "'" + ")";*/
  		return DBManager.simpleUpdate(sql);
	}
}