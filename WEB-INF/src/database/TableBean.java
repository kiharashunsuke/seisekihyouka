package database;

public class TableBean {

	private String tableName;

	public TableBean() {
	}
		public TableBean(String tableName) {
			this.tableName = tableName;
		}
		public String getTableName() {
			return tableName;
		}
		public void setTableName(String tableName) {
			this.tableName = tableName;
		}
	}

