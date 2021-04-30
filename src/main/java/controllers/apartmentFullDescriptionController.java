package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class apartmentFullDescriptionController {

    @FXML
    private Label addressLabel;

    @FXML
    private Label priceLabel;

    @FXML
    private Label utilitiesLabel;

    @FXML
    private Label nrroomsLabel;

    @FXML
    private Label ownerLabel;

    @FXML
    private Label descriptionLabel;

    void setData(String address,String price, String utilities, String nrrooms,String owner, String description){

        addressLabel.setText(address);
        priceLabel.setText(price);
        utilitiesLabel.setText(utilities);
        nrroomsLabel.setText(nrrooms);
        ownerLabel.setText(owner);
        descriptionLabel.setText(description);
    }


}
