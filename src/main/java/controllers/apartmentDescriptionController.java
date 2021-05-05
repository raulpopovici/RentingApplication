package controllers;

import com.sun.prism.paint.Color;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;

public class apartmentDescriptionController {


    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Label LabelApane;

    public void setDataDesc(){

        LabelApane.setText("Unfortunately we have no apartments in this area.");
        LabelApane.setStyle("-fx-text-fill: #000");
        LabelApane.setStyle("-fx-font-size: 20");


    }
}
