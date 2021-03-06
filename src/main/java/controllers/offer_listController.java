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
    private Label dateLabel;

    @FXML
    private Label priceLabel;

    @FXML
    private Label clientFN;

    @FXML
    private Label clientLN;

    public void setData(String address,String price,String utilities,String nrrooms, String ownerName,String Date,String firstname,String lastname) {


        addressLabel.setText(address);

        utilitiesLabel.setText(utilities);

        nrofroomsLabel.setText(nrrooms);

        priceLabel.setText(price);

        dateLabel.setText(Date);

        clientFN.setText(firstname);

        clientLN.setText(lastname);
    }

}
