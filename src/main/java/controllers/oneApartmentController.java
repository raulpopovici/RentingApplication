package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import services.OffersService;
import services.UserService;
import usermodel.User;



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
    private TextField dateField;


    public String clientFirstName = profileController.firstName;
    public String clientLastName = profileController.lastName;
    public String clientPhoneNumber = profileController.phoneNumber;

    String Username = LoginController.username;
    private String nrOfRooms;
    private String Utilities;
    private String Address;
    private String Price;
    private String Description;
    private String OwnerName;
    private String Date;






    public void setData(String address,String utilities,String nrrooms, String ownerName,String description,String price){
        addressLabel.setText(address);
        utilitiesLabel.setText(utilities);
        nrroomsLabel.setText(nrrooms);
        ownerLabel.setText(ownerName);
        descriptionLabel.setText(description);
        priceLabel.setText(price);



        nrOfRooms = nrrooms;
        Utilities = utilities;
        Address = address;
        Price =  price;
        Description = description;
        OwnerName = ownerName;



    }





    @FXML
    public void reserveButtonAction(){


        for(User user : UserService.users ){
            if(user.getUsername().equals(Username)){

                clientFirstName = user.getFirstName();
                clientLastName = user.getLastName();
                clientPhoneNumber = user.getPhoneNumber();
            }
        }

        OffersService.addOffer(nrOfRooms,Utilities,Address,Price,Description ,OwnerName,clientFirstName,clientLastName,clientPhoneNumber,dateField.getText());

    }




}
