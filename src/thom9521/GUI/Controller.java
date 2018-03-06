package thom9521.GUI;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;




public class Controller {

    @FXML
    private TextField telefonField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button loginButton;
    @FXML
    private Label loginText;
    @FXML
    private Tab tabLogin;
    @FXML
    private Tab tabKurser;



    @FXML
    private void loginButtonAction(ActionEvent e) {
    int tnr;
    int pass;
        tnr = Integer.parseInt(telefonField.getText());
        pass = Integer.parseInt(passwordField.getText());
    if (e.getSource()==loginButton){
        if (tnr == 30306406){
            if (pass == 123){
            loginText.setText("Du er nu logget ind.");
        } else{
                loginText.setText("Telefonnummer eller password er forkert.");
            }

    }
    else{
            loginText.setText("Telefonnummer eller password er forkert.");
        }

    }
}
}
