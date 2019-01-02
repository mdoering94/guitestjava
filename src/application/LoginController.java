package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

public class LoginController {

    @FXML
    private Button quitButton;

    @FXML
    private Button loginButton;

    @FXML // fx:id="userField"
    private TextField userField; // Value injected by FXMLLoader

    @FXML // fx:id="passField"
    private PasswordField passField; // Value injected by FXMLLoader
    
    @FXML
    void login(ActionEvent event) {
    	System.out.println("Login!");
    	System.out.println(userField.getText());
    	System.out.println(passField.getText());
    	userField.clear();
    	passField.clear();
    	loginButton.setDisable(true);
    }

    @FXML
    void quitApplication(ActionEvent event) {
   
    }

}
