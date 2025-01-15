import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

public class Lab14 extends Application {
    @Override
    public void start(Stage primaryStage) {
       
        HBox hbox = new HBox();
        hbox.setSpacing(10); 

        
        Font font = Font.font("Arial", javafx.scene.text.FontWeight.BOLD, javafx.scene.text.FontPosture.ITALIC, 22);

        
        for (int i = 0; i < 5; i++) {
            // Create a new Text object
            Text text = new Text("Java I");

            // Set font to the Text object
            text.setFont(font);

            // Rotate the text 60 degrees
            text.setRotate(60);

            // Set random color for the Text object
            text.setFill(generateRandomColor());

            // Add the Text object to the HBox
            hbox.getChildren().add(text);
        }

        
        Scene scene = new Scene(hbox, 300, 100);

        
        primaryStage.setTitle("Lab 14");

        // Set the scene to the stage and display it
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Helper method to generate random colors
    private Color generateRandomColor() {
        Random random = new Random();
        return Color.color(random.nextDouble(), random.nextDouble(), random.nextDouble());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
