package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;

public class LoginController {
	
	@FXML
	private AnchorPane mainLoginWindow;

    @FXML
    private Button quitButton;

    @FXML
    private Button loginButton;

    @FXML // fx:id="userField"
    private TextField userField; // Value injected by FXMLLoader

    @FXML // fx:id="passField"
    private PasswordField passField; // Value injected by FXMLLoader
    
    @FXML
    void klickLoginButton(ActionEvent event) {
    	LoginAction.login(userField.getText(), passField.getText());
    }
    

    @FXML
    void klickQuitButton(ActionEvent event) {
    	LoginAction.determinateProgram(event);
    }
    
    @FXML
    void onKeyPressedAtMainWindow(KeyEvent event) {
    	if(event.getCode() == KeyCode.ENTER) {
    		LoginAction.login(userField.getText(), passField.getText());
    	}else if(event.getCode() == KeyCode.ESCAPE) {		
    		LoginAction.determinateProgram(event);
    	}
    }
}
    