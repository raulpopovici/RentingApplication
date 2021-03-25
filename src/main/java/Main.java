
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    //private static Scene scene;

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("/login.fxml"));
        primaryStage.setTitle("RentingApplication");
        primaryStage.setScene(new Scene(root, 737, 524));
        primaryStage.setResizable(false);
        primaryStage.show();

    }

//    static void setRoot(String fxml) throws IOException{
//        scene.set
//    }


    public static void main(String[] args) {
        launch(args);
    }
}
