package controllers;
import javafx.application.Application;
import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class RegisterController {

    @FXML
    private Button cancelRegisterButton;

    public void cancelRegisterButtonAction(ActionEvent event) throws IOException {

        Stage stage = (Stage) cancelRegisterButton.getScene().getWindow();
        stage.close();

    }

}
