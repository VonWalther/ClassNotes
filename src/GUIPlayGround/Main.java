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
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane drawPane = new Pane();
        drawPane.setPadding(new Insets(10,10,10,10));
        String mesg = "~~~This will be an Ellipse!~~~";
        Text nameOfThing = new Text(mesg);
        nameOfThing.xProperty().bind(drawPane.widthProperty().divide(3));
        nameOfThing.yProperty().bind(drawPane.heightProperty().subtract(50));
        nameOfThing.setTextAlignment(TextAlignment.CENTER);
        drawPane.getChildren().add(nameOfThing);

        for(int i = 0;i<16;i++){
            Ellipse elp = new Ellipse(100,75);
            elp.setCenterX(150);
            elp.setCenterY(150);
            elp.setStroke(Color.color(Math.random(),Math.random(),Math.random()));
            elp.setFill(Color.color(.3,.3,.3));
            elp.setRotate(i * 180 / 16);
            drawPane.getChildren().add(elp);
        }

        Scene funWithCode = new Scene(drawPane,300,300);
        primaryStage.setTitle("ELLIPSE");
        primaryStage.setScene(funWithCode);
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
