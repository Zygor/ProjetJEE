package truc;

public class ServiceLogin {

	Login login;

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login a) {
		login = a;
	}

	public void affiche() {
		login.setPwd("aa");
		login.setUsername("a");
		System.out.println(login.toString());
	}
}
