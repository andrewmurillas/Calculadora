package app;

import javafx.stage.Stage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/res/gui.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setTitle("Calculdora");
			primaryStage.getIcons().add(new Image("/res/icon.png"));
			primaryStage.setScene(scene);
		} catch (NullPointerException e) {
			Text errorMessage = new Text();
			errorMessage.setText("Algo salio mal");

			StackPane layout = new StackPane();
			layout.getChildren().add(errorMessage);

			Scene errorScene = new Scene(layout, 400, 300);
			primaryStage.setTitle("Error");
			primaryStage.setScene(errorScene);

			e.printStackTrace();
		}

		primaryStage.show();
	}

}
