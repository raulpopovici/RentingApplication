

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import services.ApartmentService;
import services.UserService;
import usermodel.User;

import java.awt.*;
import java.util.Objects;

public class Main extends Application {




    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        UserService.loadUsersFromFile();
        ApartmentService.loadAFromFile();



        //ApartmentService.addApartment();

        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("login.fxml"));
        primaryStage.setTitle("Rellow");
        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.setScene(new Scene(root, 737, 524));
        primaryStage.getIcons().add(new Image("images/rellow.jpg"));
        primaryStage.setResizable(false);
        primaryStage.show();

    }


}
