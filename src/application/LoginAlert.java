package application;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class LoginAlert {

	public void failedLogin() {
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Login failed!");
//		alert.setHeaderText(null);
		alert.setContentText("Your username or password was incorrect!");
		
		alert.showAndWait();

	}

public void succeedLogin() {
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Login successfull!");
//		alert.setHeaderText(null);
		alert.setContentText("Your username or password was correct!");
		
		alert.showAndWait();

	}

	
}
