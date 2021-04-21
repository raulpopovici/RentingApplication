package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class oneApartmentController {

    @FXML
    Label addressLabel;
    @FXML
    Label priceLabel;

    public void setData(String address, String price){
        addressLabel.setText(address);
        priceLabel.setText(price);

    }
}
