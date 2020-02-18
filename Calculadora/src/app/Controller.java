package app;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller implements Initializable {

	@FXML
	TextField screen;
//	@FXML
//	Button buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight,
//			buttonNine, buttonZero, buttonComa;
//	@FXML
//	JFXButton buttonPlus, buttonMinus, buttonEqual, buttonObelo, buttonConvertToNegative, buttonTimes;
//	@FXML
//	JFXButton buttonClear, buttonClearAll, buttonDelete;

	String numberOnScreen = "";
	int numberSetOne = 0;
	int numberSets[] = { 0, 0 };
	byte set = 0;

	public void initialize(URL location, ResourceBundle resources) {
		screen.setEditable(false);
	}

	@FXML
	private void buttonZeroClick() {
		if (numberOnScreen.equals("0")) {

		} else {
			numberOnScreen = numberOnScreen.concat("0");
			screen.setText(numberOnScreen);
		}
	}

	@FXML
	private void numerButtonClick() {
		
	}

	@FXML
	private void clearAll() {
		System.out.println("salsa");
		numberSets[set] = 0;
		numberOnScreen = "";
		screen.setText(numberOnScreen);
	}

}
