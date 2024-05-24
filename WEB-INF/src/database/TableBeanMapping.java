package database;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TableBeanMapping implements ResultSetBeanMapping<TableBean> {
	//Tableの名前を取得し、セットするメソッドの紐づけ
	public TableBean createFromResultSet(ResultSet rs) throws SQLException{
		TableBean tbean = new TableBean();

		tbean.setTableName(rs.getString("tableName"));
		return tbean;
	}

}
