package GUIPlayGround;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //primaryStage.setTitle("Hello World");
        //primaryStage.setScene(new Scene(root, 300, 275));
        Button btOK = new Button("OK");
        StackPane stPane = new StackPane();
        stPane.getChildren().add(btOK);
        Scene myScene = new Scene(stPane,250,250);
        primaryStage.setTitle("Push My Button");
        primaryStage.setScene(myScene);
        primaryStage.show();

        /*
        Stage secStage = new Stage();
        secStage.setTitle("Second Screen");
        secStage.setScene(new Scene(new Button("All NEW and IMPROVED"), 200, 200));
        secStage.show();
        */
    }


    public static void main(String[] args) {
        launch(args);
    }
}
