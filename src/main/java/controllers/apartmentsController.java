package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
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
    @FXML
    Button searchButton;
    @FXML
    TextField searchBar;

    @FXML
    BorderPane searchPane;


    @FXML
    public void searchButtonAction() throws IOException {
        int oke = 0;

        apartmentsLayout.getChildren().clear();

        for(Apartment apartment : ApartmentService.apartments){

            if(apartment.getAddress().contains(searchBar.getText())){
                oke = 1;
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/oneApartment.fxml"));

                FXMLLoader fxmlLoader1 = new FXMLLoader();
                fxmlLoader1.setLocation(getClass().getResource("/apartmentDescription.fxml"));


                try {


                    AnchorPane anchorPane  = fxmlLoader1.load();
                    BorderPane  pane = fxmlLoader.load();
                    oneApartmentController ap = fxmlLoader.getController();
                    ap.setData(apartment.getAddress(),apartment.getUtilities(),apartment.getNrOfRooms(),apartment.getOwnerName(),apartment.getDescription(),apartment.getPrice());

                    apartmentsLayout.getChildren().add(pane);
                    apartmentsLayout.getChildren().add(anchorPane);



                } catch (IOException e) {
                    e.printStackTrace();
                }

            }


        }

        if(oke == 0) {

            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/apartmentDescription.fxml"));

            try {

                AnchorPane anchorPane  = fxmlLoader.load();
                apartmentDescriptionController aux = fxmlLoader.getController();
                aux.setDataDesc();
                apartmentsLayout.getChildren().add(anchorPane);


            } catch (IOException e) {
                e.printStackTrace();
            }
        }





    }






    @Override
    public void initialize(URL location, ResourceBundle resources) {



    }




}
