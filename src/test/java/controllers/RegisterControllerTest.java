package controllers;



import javafx.fxml.FXMLLoader;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;


import org.junit.Test;
import org.testfx.framework.junit.ApplicationTest;
import services.FileSystemService;
import services.UserService;

import java.awt.*;

public class RegisterControllerTest extends ApplicationTest {

    public static final String TEST_USER = "testUser";
    public static final String TEST_PASSWORD = "testPassword";
    public static final String TEST_FIRSTNAME = "testFirstName";
    public static final String TEST_LASTNAME = "testLastName";
    public static final String TEST_PHONENUMBER = "testPhoneNumber";
    public static final String TEST_ADDRESS = "testAddress";

    private RegisterController controller;

    @BeforeClass
    public static void setupClass() throws Exception{
        FileSystemService.APPLICATION_FOLDER = ".test-registration-renting-example";
        FileSystemService.initApplicationHomeDirIfNeeded();
        UserService.loadUsersFromFile();
    }

    @Before
    public void setUp() throws Exception{

        FileUtils.cleanDirectory(FileSystemService.getApplicationHomePath().toFile());
        UserService.loadUsersFromFile();
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("main/resources/register.fxml"));

        controller = fxmlLoader.getController();



        controller = new RegisterController();

        controller.usernameField = new TextField();

        controller.passwordField = new PasswordField();

        controller.role = new ChoiceBox();

        controller.firstNameField = new TextField();

        controller.lastNameField = new TextField();

        controller.phoneNumberField = new TextField();

        controller.addressField = new TextField();

        controller.accountSuccesfullLabel = new Label();

        controller.passwordField.setText(TEST_PASSWORD);

        controller.usernameField.setText(TEST_USER);

        controller.firstNameField.setText(TEST_FIRSTNAME);

        controller.lastNameField.setText(TEST_LASTNAME);

        controller.phoneNumberField.setText(TEST_PHONENUMBER);

        controller.addressField.setText(TEST_ADDRESS);


    }

    @Test
    public void testHandleAddUserActionCode() {





//            controller.handleRegisterAction();
//            assertEquals(5,UserService.getUsers().size());
//            assertEquals("Account created successfully!",controller.accountSuccesfullLabel.getText());




         //assertEquals("Account created successfully!",controller.accountSuccesfullLabel.getText());

    }




}