package login;

import java.io.Serializable;

public class LoginBean implements Serializable {
	private String id;
	private String password;
	private int login_user_flg;

	public String getId() {
		return id;
		}
	public void setId(String id) {
		this.id = id;
		}

	// ゲッターとセッターの作成（パスワード）
	public String getPassword() {
		return password;
		}
	public void setPassword(String password) {
		this.password = password;
		}

	// ゲッターとセッターの作成（ユーザフラグ）
	public int getLogin_user_flg() {
		return login_user_flg;
		}
	public void setLogin_user_flg(int userflg) {
		this.login_user_flg = userflg;
		}
}