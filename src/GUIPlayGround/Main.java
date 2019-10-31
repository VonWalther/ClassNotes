package GUIPlayGround;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox btPane = new HBox(20);
        btPane.setAlignment(Pos.CENTER);
        Button btOK     = new Button("OK");
        Button btnotOk    = new Button("Not OK");
        Button btCancel = new Button("Cancel");
        Button btLamdba = new Button("\u039b");
        //OK Handler
        OKHandlerClass okHand = new OKHandlerClass();
        btOK.setOnAction(okHand);
        //Not Ok Handler
        btnotOk.setOnAction(
        new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                System.out.println("I'm need Help, and cheeseburger!!!!!");
            }
        }
                );
        //Cancel Handler
        CancelHandlerClass cancelHand = new CancelHandlerClass();
        btCancel.setOnMouseReleased(cancelHand);
        //Lamdba Handler


        btPane.getChildren().addAll(btOK,btnotOk,btCancel,btLamdba);
        btPane.setPrefSize(300,100);

        Scene nowWithButtons = new Scene(btPane);

        primaryStage.setScene(nowWithButtons);
        primaryStage.setTitle("Handle Events");
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }

    private class OKHandlerClass implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event){
            System.out.println("OK, Hello World");
        }

    }

    private class CancelHandlerClass implements EventHandler<MouseEvent>{
        @Override
        public void handle(MouseEvent event){
            System.out.println("Goodbye!");
            System.exit(1);
        }
    }
}
