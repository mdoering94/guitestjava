package application;

import javafx.event.Event;
import javafx.scene.Node;
import javafx.stage.Stage;

public class LoginAction {
	
	public static void login(String user,String pass) {
		LoginAlert outDialog = new LoginAlert();
		LoginRequest loginRequest = new LoginRequest(user, pass);
		
		Boolean loginSuccess = loginRequest.request();
		
		if(loginSuccess) {
			outDialog.succeedLogin();
		}else {
			outDialog.failedLogin();
		}

	}

	public static void determinateProgram(Event event) {
		final Node source = (Node) event.getSource();
		final Stage stage = (Stage) source.getScene().getWindow();
		stage.close();
		
	}
}
