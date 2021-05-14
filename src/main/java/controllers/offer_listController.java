package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class offer_listController {

    @FXML
    private Label addressLabel;

    @FXML
    private Label utilitiesLabel;

    @FXML
    private Label nrofroomsLabel;

    @FXML
    private Label descriptionLabel;

    @FXML
    private Label priceLabel;

    public void setData(String address,String price,String utilities,String nrrooms, String ownerName,String description){


        addressLabel.setText(address);
        //firstnameProfile.setText();
        utilitiesLabel.setText(utilities);
        nrofroomsLabel.setText(nrrooms);
        descLabel.setText(description);
        priceLabel.setText(price);
        reviewsLabel.setText(price);

}
