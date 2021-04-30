package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import controllers.apartmentsController;

import java.io.IOException;


public class oneApartmentController {

    @FXML
    Label addressLabel;
    @FXML
    Label priceLabel;
//    @FXML
//    Button fullDescription;

    public void setData(String address){
        addressLabel.setText(address);


    }




}
