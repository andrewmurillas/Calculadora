package app;

import javafx.stage.Stage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene;
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/res/gui.fxml"));
			scene = new Scene(root);
		} catch (NullPointerException e) {
			scene = new Scene(new StackPane(), 400, 300);
			e.printStackTrace();
		}

		primaryStage.setTitle("Calculadora");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
