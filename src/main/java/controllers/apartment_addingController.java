package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import services.ApartmentService;


public class apartment_addingController {

    @FXML
    private BorderPane DescriptionPane;

    @FXML
    private Button addapartment_done;

    @FXML
    private TextField adresstextfield;

    @FXML
    private TextField pricetextfield;

    @FXML
    private TextField utilitiestextfield;

    @FXML
    private TextField nrofroomstextfield;

    @FXML
    private TextField ownertextfield;

    @FXML
    private TextField descriptiontextfield;




    @FXML
    void reserveButtonAction() {
        ApartmentService.addApartment(adresstextfield.getText(),pricetextfield.getText(),utilitiestextfield.getText(),nrofroomstextfield.getText(),ownertextfield.getText(),descriptiontextfield.getText());
        Stage stage = (Stage) addapartment_done.getScene().getWindow();
        stage.close();
    }

}

