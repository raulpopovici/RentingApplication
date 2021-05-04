package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class apartmentDescriptionController {


    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Label LabelApane;

    public void setDataDesc(){

        LabelApane.setText("We have no apartment in this area");


    }
}
