package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class clientMainPageController {

    @FXML
    private Button signout;

    @FXML
    private Button overviewButton;

    @FXML
    private Button apartamentsButtons;

    @FXML
    private Button reviewsButton;




    @FXML
    private void signoutButtonAction() throws IOException {

        Stage stage = (Stage) signout.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("login.fxml"));
        primaryStage.setTitle("Rellow");
        primaryStage.setScene(new Scene(root, 737, 524));
        primaryStage.getIcons().add(new Image("rellow.jpg"));
        primaryStage.setResizable(false);
        primaryStage.show();

    }





    public void overviewmouseEnterAction(MouseEvent mouseEvent) {
        overviewButton.setStyle("-fx-background-color: #F6DAFE;");
    }

    public void overviewmouseExitAction(MouseEvent mouseEvent) {
        overviewButton.setStyle("-fx-background-color: #DEEBFF;");
    }

    public void apartamentsmouseEnterAction(MouseEvent mouseEvent) {

        apartamentsButtons.setStyle("-fx-background-color: #F6DAFE;");
    }

    public void apartamentsmouseExitAction(MouseEvent mouseEvent) {
        apartamentsButtons.setStyle("-fx-background-color: #DEEBFF;");
    }

    public void reviewsmouseEnterAction(MouseEvent mouseEvent) {

        reviewsButton.setStyle("-fx-background-color: #F6DAFE;");

    }

    public void reviewsmouseExitAction(MouseEvent mouseEvent) {
        reviewsButton.setStyle("-fx-background-color:#DEEBFF");

    }

    public void signoutmouseEnterAction(MouseEvent mouseEvent) {
        signout.setStyle("-fx-background-color: #F6DAFE;");
    }

    public void signoutmouseExitAction(MouseEvent mouseEvent) {
        signout.setStyle("-fx-background-color: #DEEBFF;");
    }
}
