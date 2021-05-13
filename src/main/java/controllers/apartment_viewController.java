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



    public void setData(String address,String utilities,String nrrooms, String ownerName,String description,String price){


        usernameProfile.setText(address);
        firstnameProfile.setText(utilities);
        lastnameProfile.setText(nrrooms);
        phonenumberProfile.setText(ownerName);
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
