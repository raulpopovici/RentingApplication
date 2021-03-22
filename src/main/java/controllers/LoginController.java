package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;


public class LoginController {

    @FXML
    private Button loginButton;

    public void loginButtonAction(ActionEvent event){

        int ok=0;
        if(ok == 1){
            Stage stage = (Stage) loginButton.getScene().getWindow();
            stage.close();
        }


    }


}
