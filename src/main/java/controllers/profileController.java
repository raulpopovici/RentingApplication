package controllers;
import controllers.LoginController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

import services.UserService;
import usermodel.User;

public class profileController implements Initializable {

    String profileUsername = LoginController.username;
    String profilePassword = LoginController.password;

    @FXML
    Label usernameProfile;

    @FXML
    private Label firstnameProfile;

    @FXML
    private Label lastnameProfile;

    @FXML
    private Label phonenumberProfile;

    @FXML
    private Label addressProfile;



    @Override
    public void initialize(URL location, ResourceBundle resources) {

        for(User user : UserService.users ){
            if(user.getUsername().equals(profileUsername)){

                usernameProfile.setText(user.getUsername());
                firstnameProfile.setText(user.getFirstName());
                lastnameProfile.setText(user.getLastName());
                phonenumberProfile.setText(user.getPhoneNumber());
                addressProfile.setText(user.getAddress());
                break;

            }

        }



    }
}
