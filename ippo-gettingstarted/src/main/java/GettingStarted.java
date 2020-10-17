// * ippo GettingStarted application
// *

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class GettingStarted extends Application {

    @Override
    public void start(Stage stage) {
        Label l = new Label("Well done! You are now running the IPPO \"Getting Started\" example.");
        Scene scene = new Scene(new StackPane(l), 500, 80);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
