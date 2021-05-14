package controllers;

import exceptions.UsernameAlreadyExistsException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import services.ApartmentService;
import usermodel.Apartment;

import java.io.IOException;

public class clientMainPageController {

    @FXML
    private Button signout;

    @FXML
    private Button homeButton;

    @FXML
    private Button apartamentsButtons;

    @FXML
    private Button reviewsButton;



    @FXML
    private BorderPane borderPane;






    @FXML
    private void signoutButtonAction() throws IOException {

        Stage stage = (Stage) signout.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("login.fxml"));
        primaryStage.setTitle("Rellow");
        primaryStage.setScene(new Scene(root, 737, 524));
        primaryStage.getIcons().add(new Image("images/rellow.jpg"));
        primaryStage.setResizable(false);
        primaryStage.show();

    }




    @FXML
    public void homeButtonAction() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader();

        fxmlLoader.setLocation(getClass().getResource("/overview.fxml"));

        //Pane view = object.getPage("Screen1");

        GridPane grid = fxmlLoader.load();

        borderPane.setCenter(grid);

    }


    @FXML
    public void apartamentsButtonsAction() throws IOException {



        FXMLLoader fxmlLoader = new FXMLLoader();

        fxmlLoader.setLocation(getClass().getResource("/apartments.fxml"));

        //Pane view = object.getPage("Screen1");

        BorderPane view = fxmlLoader.load();

        borderPane.setCenter(view);



        //centrePane.setCenter(view);

    }

    @FXML
    public void profileButtonAction() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader();

        fxmlLoader.setLocation(getClass().getResource("/profile.fxml"));

        //Pane view = object.getPage("Screen1");

        BorderPane view = fxmlLoader.load();

        borderPane.setCenter(view);






    }

}
