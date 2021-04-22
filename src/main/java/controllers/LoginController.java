package controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.input.MouseEvent;
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
        else{
               String ROLE = UserService.checkOwnerOrClient(usernameTextField.getText(),passwordTextField.getText());

               FXMLLoader fxmlLoader = new FXMLLoader();
              if(ROLE.equals("Owner")){


                  fxmlLoader.setLocation(getClass().getResource("/ownerMainPage.fxml"));
              }
              else if(ROLE.equals("Client")){

                  fxmlLoader.setLocation(getClass().getResource("/client.fxml"));

              }
              else{
                  fxmlLoader.setLocation(getClass().getResource("/ownerMainPage.fxml"));

              }

           // Scene scene = new Scene(fxmlLoader.load());
            Stage stage1 = new Stage();
            stage1.setTitle("RellowOwner");
            stage1.setScene(new Scene(fxmlLoader.load(), 1400, 900));
            //stage1.setScene();

           //stage1.getIcons().add(new Image("rellow.jpg"));
            stage1.show();
            Stage stage = (Stage) loginButton.getScene().getWindow();
            stage.close();

        }


        if(usernameTextField.getText().isEmpty() && passwordTextField.getText().isEmpty())
        {
            wronglogin.setText("Please enter your credentials ");
        }


    }




    public void registerButtonAction(ActionEvent event) throws IOException{

            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/register.fxml"));
            Scene scene = new Scene(fxmlLoader.load(),826,933);
            Stage stage1 = new Stage();
            stage1.setTitle("Register");
            scene.getStylesheets().add("/button.css");
            stage1.setScene(scene);
            stage1.getIcons().add(new Image("images/rellow.jpg"));
            stage1.setResizable(false);
            stage1.show();

    }
}



