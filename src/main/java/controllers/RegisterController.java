package controllers;

import exceptions.EmptyFieldsException;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import exceptions.UsernameAlreadyExistsException;
import javafx.stage.Stage;
import services.UserService;

public class RegisterController {

    @FXML
    private Text registrationMessage;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField usernameField;
    @FXML
    private ChoiceBox role;

    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;

    @FXML
    private TextField phoneNumberField;
    @FXML
    private TextField addressField;

    @FXML
    private Label wronglogin;

    @FXML
    private Button cancelButton;

    @FXML
    private Label accountSuccesfullLabel;

    @FXML
    public void initialize() {
        role.getItems().addAll("Owner", "Client");
    }

    @FXML
    public void handleRegisterAction(){


        if(UserService.checkEmptyFields(usernameField.getText(), passwordField.getText(), firstNameField.getText(), lastNameField.getText(), phoneNumberField.getText(), addressField.getText(), (String) role.getValue())){

            try {



                UserService.addUser(usernameField.getText(), passwordField.getText(), firstNameField.getText(), lastNameField.getText(), phoneNumberField.getText(), addressField.getText(), (String) role.getValue());
                //registrationMessage.setText("Account created successfully!");
                accountSuccesfullLabel.setText("Account created successfully!");
                accountSuccesfullLabel.setStyle("-fx-font-color: #000");

            } catch (UsernameAlreadyExistsException e) {
                accountSuccesfullLabel.setText(e.getMessage());
                accountSuccesfullLabel.setStyle("-fx-font-color: #000");
            }
        }
        else{
            accountSuccesfullLabel.setText("Please fill in all the fields!!");
            accountSuccesfullLabel.setStyle("-fx-font-color: #000");


        }


    }

    @FXML
    public void cancelButtonAction(){
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }
}
