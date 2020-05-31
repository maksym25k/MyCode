package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	
	public static Parent root;
	public static Scene scene;
	public void start(Stage primaryStage) {
		try {
			 this.root = FXMLLoader.load(getClass().getResource("Main.fxml"));
			 this.scene = new Scene(root);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Calculator");
			
		primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		}
	
	void setAnotherFxml ()
	{
		try {
			root = FXMLLoader.load(getClass().getResource("LengthFml.fxml"));
			scene = new Scene(root);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
