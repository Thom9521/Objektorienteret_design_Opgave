package thom9521.GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;;



public class Controller {

    @FXML
    private TextField telefonField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button loginButton;
    @FXML
    private Label loginText;
/*
    public boolean checkLogin(){
        boolean check = false;
        if(telfonField.getText() == "30306406"){
            if (passwordField.getText() == "test") {
                check = true;
            }
                else{
                    check = false;}

                } return check;

            }
*/



    @FXML
    private void handleButtonAction(ActionEvent e) {

    if (e.getSource()==loginButton){
        if (telefonField.getText()== "Hej"){
            loginText.setText("Sådan");
        }

    }

    }
}
