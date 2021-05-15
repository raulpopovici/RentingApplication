package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import services.ApartmentService;
import usermodel.Apartment;

public class apartment_viewController {

    @FXML
    private Label addressLabel;

    @FXML
    private Label utilitiesLabel;

    @FXML
    private Label nrofroomsLabel;

    @FXML
    private Label reviewsLabel;

    @FXML
    private Label descLabel;

    @FXML
    private Button Delete;

    @FXML
    private Label priceLabel;

    public String ADDRESS;



    public void setData(String address,String price,String utilities,String nrrooms, String ownerName,String description){


        addressLabel.setText(address);
        //firstnameProfile.setText();
        utilitiesLabel.setText(utilities);
        nrofroomsLabel.setText(nrrooms);
        descLabel.setText(description);
        priceLabel.setText(price);
        reviewsLabel.setText(price);

        ADDRESS = address;



    }

    @FXML
    void deleteApartmentButtonAction() {

        Apartment aux = new Apartment();


        for(Apartment apartment: ApartmentService.apartments){
            if(apartment.getAddress().equals(ADDRESS)){

                aux = apartment;

            }
        }

        ApartmentService.apartments.remove(aux);
        ApartmentService.persistApartments();

    }


}
