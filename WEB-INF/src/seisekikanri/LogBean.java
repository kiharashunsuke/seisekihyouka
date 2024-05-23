package seisekikanri;

public class LogBean {
	private String id;
	private String password;
	private String mail;

	public LogBean() {
	}
	public LogBean(String id, String password, String mail) {
		this.id = id;
		this.password = password;
		this.setMail(mail);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
}

