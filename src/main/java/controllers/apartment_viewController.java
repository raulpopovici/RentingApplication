package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class apartment_viewController {

    @FXML
    private Label usernameProfile;

    @FXML
    private Label firstnameProfile;

    @FXML
    private Label lastnameProfile;

    @FXML
    private Label phonenumberProfile;

    @FXML
    private Label addressProfile;
    @FXML
    private Label priceLabel;



    public void setData(String address,String price,String utilities,String nrrooms, String ownerName,String description){


        usernameProfile.setText(address);
        //firstnameProfile.setText();
        lastnameProfile.setText(utilities);
        phonenumberProfile.setText(nrrooms);
        addressProfile.setText(description);


        //priceLabel.setText(price);



//        nrOfRooms = nrrooms;
//        Utilities = utilities;
//        Address = address;
//        Price =  price;
//        Description = description;
//        OwnerName = ownerName;



    }


}
