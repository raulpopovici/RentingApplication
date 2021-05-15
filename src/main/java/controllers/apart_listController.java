package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import services.ApartmentService;
import services.UserService;
import usermodel.Apartment;
import usermodel.User;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class apart_listController implements Initializable {

    @FXML
    private BorderPane searchPane;

    @FXML
    private VBox apartmentsLayout;

    @FXML
    private Button add_apartment;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {

        profileController aux = new profileController();

        String name = aux.getName();

        for(Apartment apartment : ApartmentService.apartments){

            if(apartment.getOwnerName().contains(name)){


                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/apartment_view.fxml"));



                try {


                    BorderPane  pane = fxmlLoader.load();
                    apartment_viewController ap = fxmlLoader.getController();
                    ap.setData(apartment.getAddress(),apartment.getPrice(),apartment.getUtilities(),apartment.getNrOfRooms(),apartment.getOwnerName(),apartment.getDescription());

                    apartmentsLayout.getChildren().add(pane);




                } catch (IOException e) {
                    e.printStackTrace();
                }

            }


        }



    }
    public void add_apartmentAction() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/apartment_adding.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),826,933);
        Stage stage1 = new Stage();
        stage1.setTitle("Add Apartment");
        scene.getStylesheets().add("/button.css");
        stage1.setScene(scene);
        stage1.getIcons().add(new Image("images/rellow.jpg"));
        stage1.setResizable(false);
        stage1.show();
    }
}
