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
    public Text registrationMessage;
    @FXML
    public PasswordField passwordField;
    @FXML
    public TextField usernameField;
    @FXML
    public ChoiceBox role;

    @FXML
    public TextField firstNameField;
    @FXML
    public TextField lastNameField;

    @FXML
    public TextField phoneNumberField;
    @FXML
    public TextField addressField;

    @FXML
    private Label wronglogin;

    @FXML
    private Button cancelButton;

    @FXML
    public Label accountSuccesfullLabel;

    @FXML
    public void initialize() {
        role.getItems().addAll("Owner", "Client");
    }

    @FXML
    public void handleRegisterAction(){


        if(UserService.checkEmptyFields(usernameField.getText(), passwordField.getText(), firstNameField.getText(), lastNameField.getText(), phoneNumberField.getText(), addressField.getText(), (String) role.getValue())){

            try {



                UserService.addUser(usernameField.getText(), passwordField.getText(), firstNameField.getText(), lastNameField.getText(), phoneNumberField.getText(), addressField.getText(), (String) role.getValue());
                registrationMessage.setText("Account created successfully!");
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
