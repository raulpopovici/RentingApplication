package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import services.ApartmentService;
import services.UserService;
import usermodel.Apartment;
import usermodel.User;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class apart_listController implements Initializable {

    @FXML
    private BorderPane searchPane;

    @FXML
    private VBox apartmentsLayout;

    @FXML
    private Button add_apartment;

    @FXML
    void add_apartment(){
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        int oke = 0;

        for(Apartment apartment : ApartmentService.apartments){

            if(apartment.getOwnerName().contains("")){
                oke = 1;
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/apartment_view.fxml"));

//                FXMLLoader fxmlLoader1 = new FXMLLoader();
//                fxmlLoader1.setLocation(getClass().getResource("/apartmentDescription.fxml"));



                try {


                    BorderPane  pane = fxmlLoader.load();
                    apartment_viewController ap = fxmlLoader.getController();
                    ap.setData(apartment.getAddress(),apartment.getPrice(),apartment.getUtilities(),apartment.getNrOfRooms(),apartment.getOwnerName(),apartment.getDescription());

                    apartmentsLayout.getChildren().add(pane);




                } catch (IOException e) {
                    e.printStackTrace();
                }

            }


        }

//        if(oke == 0) {
//
//            FXMLLoader fxmlLoader = new FXMLLoader();
//            fxmlLoader.setLocation(getClass().getResource("/apartmentDescription.fxml"));
//
//            try {
//
//                AnchorPane anchorPane  = fxmlLoader.load();
//                apartmentDescriptionController aux = fxmlLoader.getController();
//                aux.setDataDesc();
//                apartmentsLayout.getChildren().add(anchorPane);
//
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }


    }
    public void add_apartmentAction() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/apartment_adding.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),826,933);
        Stage stage1 = new Stage();
        stage1.setTitle("Add Apartment");
        scene.getStylesheets().add("/button.css");
        stage1.setScene(scene);
        stage1.getIcons().add(new Image("images/rellow.jpg"));
        stage1.setResizable(false);
        stage1.show();
    }
}
