package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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
    public void searchButtonAction(){
        int oke = 0;

        apartmentsLayout.getChildren().clear();

        for(Apartment apartment : ApartmentService.apartments){

            if(apartment.getAddress().contains(searchBar.getText())){
                oke = 1;
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

        if(oke == 0) {

            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/oneApartment.fxml"));

            try {

                HBox hbox = fxmlLoader.load();
                oneApartmentController ap = fxmlLoader.getController();
                ap.setData("We cound not find any apartments in this area","");
                apartmentsLayout.getChildren().add(hbox);


            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }








    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }




}
