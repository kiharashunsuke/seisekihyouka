package database;

import java.sql.SQLException;
import java.util.List;

public class TestScoreDAO {
//データ更新のメソッド（後ほど適切なものに変換予定）
public int insert(StudentBean sbean) throws SQLException{
		String sql = "INSERT INTO (テーブルの名前)" +
		"(japanese, math, science, social, english, goukei) VALUES(" +
		"'" + sbean.getJapanese() + "'," +
		"'" + sbean.getMath() + "'," +
		"'" + sbean.getScience() + "'," +
		"'" + sbean.getSocial() + "'," +
		"'" + sbean.getEnglish() + "'," +
		sbean.getGoukei() + ")";
		return DBManager.simpleUpdate(sql);
}
//ここまで

	//入れ込むデータのselect文をDBManagerのそれぞれのメソッドに送信
	//SelectServletで名前のセレクトボックスで使うnameの取得
	public static List<StudentBean> getStudentList() throws SQLException{
		String sql = "SELECT name, student_no, japanese, math, science, social, english, goukei from gakuryokutest_1";
		return DBManager.findAll(sql, new StudentBeanMapping());
	}
	//SelectServletでテスト名のセレクトボックスで使うtableNameの取得
	public static List<TableBean> getTableList() throws SQLException{
		String tableSQL = "SELECT relname AS tableName FROM pg_stat_user_tables";
		return DBManager.simpleFind(tableSQL, new TableBeanMapping());
	}
	//jspのセレクトボックスで取得したテスト名のデータをもとに、対応したテーブルから
	//名前、出席番号、各教科の点数を取得
	public static List<StudentBean> getScoreList(TableBean tbean) throws SQLException{
		//tableNameの宣言と、TableBeanのメソッドの呼び出し
		String tableName = tbean.getTableName();
		String scoreSQL = "SELECT name, student_no, japanese, math, science, social, english, goukei from " + tableName;
		return DBManager.findScore(scoreSQL, new StudentBeanMapping());
	}
}
