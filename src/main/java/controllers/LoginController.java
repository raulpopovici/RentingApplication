package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import exceptions.UsernameAlreadyExistsException;

import services.UserService;

import java.io.IOException;


public class LoginController {

    @FXML
    private Button loginButton;

    @FXML
    private Button registerButton;

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordTextField;

    @FXML
    private Label wronglogin;

    public void loginButtonAction(ActionEvent event) throws IOException,UsernameAlreadyExistsException{
        if (!UserService.checkIfPassAndUserAreValid(usernameTextField.getText(),passwordTextField.getText())){
            wronglogin.setText("User or password are incorrect");
        }


        if(usernameTextField.getText().isEmpty() && passwordTextField.getText().isEmpty())
        {
            wronglogin.setText("Please enter your credentials ");
        }


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
