package seiseki;

public class PassResetMailBean {
	private String id;
	private String password;
	public PassResetMailBean() {
	}
	public PassResetMailBean(String id, String password) {
		this.id = id;
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
