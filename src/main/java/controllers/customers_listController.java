package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import services.ApartmentService;
import services.OffersService;
import usermodel.Apartment;
import usermodel.Offer;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class customers_listController implements Initializable {

    @FXML
    private BorderPane searchPane;

    @FXML
    private VBox apartmentsLayout;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        int oke = 0;

        for (Offer offer : OffersService.offers) {

            if (offer.getOwnerName().contains("")) {
                oke = 1;
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/offer_list.fxml"));

//                FXMLLoader fxmlLoader1 = new FXMLLoader();
//                fxmlLoader1.setLocation(getClass().getResource("/apartmentDescription.fxml"));


                try {


                    BorderPane pane = fxmlLoader.load();
                    offer_listController ap = fxmlLoader.getController();
                    ap.setData(offer.getAddress(), offer.getPrice(), offer.getUtilities(), offer.getNrOfRooms(), offer.getOwnerName(), offer.getDescription());

                    apartmentsLayout.getChildren().add(pane);


                } catch (IOException e) {
                    e.printStackTrace();
                }

            }


        }
    }

}
