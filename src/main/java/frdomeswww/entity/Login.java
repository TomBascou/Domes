package frdomeswww.entity;

public class Login {
	private String login;
	private String password;
	private String token;
	
	public Login() {
		super();
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
	public final String getToken() {
		return token;
	}
	public final void setToken(String token) {
		this.token = token;
	}
	
}
