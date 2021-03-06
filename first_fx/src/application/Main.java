package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Main extends Application {
   @Override
   public void start(Stage Stage) {
      try {
         // stage>scene>container>node
         Pane pane = new Pane(); //container
         Scene scene = new Scene(pane,300,500);
         Stage.setScene(scene);
      
         /*
          * BorderPane root = new BorderPane(); Scene scene = new Scene(root,400,800);
          * scene.getStylesheets().add(getClass().getResource("application.css").
          * toExternalForm()); Stage.setScene(scene);
          */
         Stage.show();
         Stage.setTitle("My Windows");
      } catch(Exception e) {
         e.printStackTrace();
      }
   }
   
   public static void main(String[] args) {
      launch(args);
   }
}