package truc;

public class Login {

	String username;
	String pwd;

	@Override
	public String toString() {

		return "Login : " + username + "PWD :  " + pwd;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Login(String username, String pwd) {
		super();
		this.username = username;
		this.pwd = pwd;
	}

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

}
