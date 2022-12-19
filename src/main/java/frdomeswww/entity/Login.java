package frdomeswww.entity;

public class Login {
	private String login;
	private String password;
	private int token;
	
	public Login(String login, String password, int token) {
		super();
		this.login = login;
		this.password = password;
		this.token = token;	
	}
	
	public final String getLogin() {
		return login;
	}
	public final void setLogin(String login) {
		this.login = login;
	}
	public final String getPassword() {
		return password;
	}
	public final void setPassword(String password) {
		this.password = password;
	}
	public final int getToken() {
		return token;
	}
	public final void setToken(int token) {
		this.token = token;
	}
	
}
