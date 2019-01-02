package application;

public class LoginRequest {

	private String user;
	private String password;
	
	public LoginRequest(String user,String password) {
		this.user = user;
		this.password = password;
		
	}
	
	public boolean request(){
		if(user.equals("maxd") && password.equals("pass")) {
			return true;
		}else {
			return false;
		}
	}
	
}
