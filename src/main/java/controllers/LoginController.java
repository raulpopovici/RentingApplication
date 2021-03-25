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



public class LoginController{

    @FXML
    private Button loginButton;

    @FXML
    private Button registerButton;


    public void loginButtonAction(ActionEvent event) throws IOException{


    }
    public void registerButtonAction(ActionEvent event) throws IOException{

            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/register.fxml"));
            Scene scene = new Scene(fxmlLoader.load(),823,1030);
            Stage stage1 = new Stage();
            stage1.setTitle("Register");
            stage1.setScene(scene);
            stage1.setResizable(false);
            stage1.show();







    }


}
