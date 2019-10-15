package GUIPlayGround;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane imagePane = new VBox(50);
        imagePane.setPadding(new Insets(5, 5, 5, 5));
        Image myClass = new Image("THE_CLASS.png");
        imagePane.getChildren().add(new ImageView(myClass));

        ImageView viewII = new ImageView(myClass);
        viewII.setFitHeight(50);
        viewII.setFitWidth(300);
        imagePane.getChildren().add(viewII);

        ImageView rotView = new ImageView(myClass);
        rotView.setRotate(90);
        imagePane.getChildren().add(rotView);

        Scene classScene = new Scene(imagePane);
        primaryStage.setTitle("Yall mugs!");
        primaryStage.setScene(classScene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
