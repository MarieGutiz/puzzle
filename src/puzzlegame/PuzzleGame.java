/**
 * @author MarieGutiz
 * @email 
 * @create date 2022-11-06 16:52:26
 * @modify date 2022-11-06 16:52:26
 * @desc [puzzle]
 */
package puzzlegame;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * @author LovART
 */
public class PuzzleGame extends Application {
    private ImageView imageView = new ImageView();
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        primaryStage.setScene(new Scene(root));
        // load puzzle image
        Image image = new Image(getClass().getResourceAsStream("01.jpg"));
        
         imageView.setImage(image);
         imageView.setFitWidth(image.getWidth());
         imageView.setFitHeight(image.getHeight());
        
         Group content= new Group();
         root.getChildren().add(content);
         content.getChildren().add(imageView);
        
        primaryStage.setTitle("puzzle");
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
