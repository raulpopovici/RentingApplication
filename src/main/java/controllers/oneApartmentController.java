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

    @FXML
    private Label utilitiesLabel;

    @FXML
    private Label nrroomsLabel;

    @FXML
    private Label ownerLabel;

    @FXML
    private Label descriptionLabel;

    @FXML
    private Button reserveButton;


    public void setData(String address,String utilities,String nrrooms, String ownerName,String description,String price){
        addressLabel.setText(address);
        utilitiesLabel.setText(utilities);
        nrroomsLabel.setText(nrrooms);
        ownerLabel.setText(ownerName);
        descriptionLabel.setText(description);
        priceLabel.setText(price);

    }

    @FXML
    public void reserveButtonAction(){

        System.out.println(addressLabel.getText());

    }




}
