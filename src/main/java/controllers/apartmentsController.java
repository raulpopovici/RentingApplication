package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import services.ApartmentService;
import usermodel.Apartment;



public class apartmentsController implements Initializable {

    @FXML VBox apartmentsLayout;
    @FXML Label addressLayout;
    @FXML Label priceLayout;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        for(Apartment apartment : ApartmentService.apartments){
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/oneApartment.fxml"));

            try {

                    HBox hbox = fxmlLoader.load();
                    oneApartmentController ap = fxmlLoader.getController();
                    ap.setData(apartment.getAddress(),apartment.getPrice());
                    apartmentsLayout.getChildren().add(hbox);


            } catch (IOException e) {
                e.printStackTrace();
            }

        }



    }


}
