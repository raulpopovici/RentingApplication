package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import exceptions.UsernameAlreadyExistsException;
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
    public void initialize() {
        role.getItems().addAll("Client", "Admin");
    }

    @FXML
    public void handleRegisterAction() {
        try {
            UserService.addUser(usernameField.getText(), passwordField.getText(), firstNameField.getText(), lastNameField.getText(), phoneNumberField.getText(), addressField.getText(), (String) role.getValue());
            //registrationMessage.setText("Account created successfully!");
        } catch (UsernameAlreadyExistsException e) {
            //registrationMessage.setText(e.getMessage());
        }
    }
}
