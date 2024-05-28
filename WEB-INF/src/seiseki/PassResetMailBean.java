package seiseki;

public class PassResetMailBean {
	private String id;
	private String password;
	private String email;
	public PassResetMailBean() {
	}
	public PassResetMailBean(String id, String password, String email) {
		this.id = id;
		this.password = password;
		this.email = email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
