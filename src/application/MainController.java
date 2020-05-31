package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {
	@FXML
	Label SecondLabel = new Label();
	String value2 = "";
	String value1 = "";
	String pm = "";
	@FXML
	Label Label = new Label();

	@FXML
	Label Labeltemp = new Label();
	Boolean start = true;

	@FXML
	public void setNumbers(ActionEvent action) {

		if (Label.getText().matches("0")) {

			Label.setText("");

		}

		String temp = "";
		temp += ((Button) action.getSource()).getText();
		Label.setText(Label.getText() + temp);
		if (Label.getText().charAt(0) == '.') {
			String tempForDot = "0";
			tempForDot += Label.getText();
			Label.setText(tempForDot);

		}
		if (Label.getText().isEmpty()) {

		}

		if (Label.getText().matches(".*\\..*\\..*")) {

			clearOne(action);

		}

	}

	@FXML
	public void setP(ActionEvent action) {
		if (value1 != "" && Label.getText() != "") {
			calculate(action);
		}
		if (!pm.isEmpty() && !SecondLabel.getText().isEmpty()) {

		} else {

			String a = String.valueOf(Label.getText());
			value1 = a;

			Label.setText("");
			SecondLabel.setText(value1);

			pm += ((Button) action.getSource()).getText();
			SecondLabel.setText(SecondLabel.getText() + ((Button) action.getSource()).getText());
		}
	}

	public void calculate(ActionEvent action) {

		Float a = Float.parseFloat(value1);
		Float b = Float.parseFloat(Label.getText());
		value1 = "";
		value2 = "";
		Float soucet = a + b;
		Float soucet2 = a - b;
		Float suma = a * b;
		Float deleni = a / b;
		switch (pm) {
		case ("+"):
			Label.setText("" + soucet);
			break;

		case ("-"):
			Label.setText("" + soucet2);
			break;
		case ("*"):
			Label.setText("" + suma);
			break;
		case ("/"):

			if (b == 0) {
				Label.setText("0");
			} else {
				Label.setText("" + deleni);
				break;
			}
		}

		if (Label.getText().matches("[0-9]*\\.0")) {
			String temp = "";
			temp = Label.getText();
			StringBuilder sb = new StringBuilder(temp);
			sb.deleteCharAt(sb.length() - 1);
			sb.deleteCharAt(sb.length() - 1);
			String TempString = new String(sb);
			Label.setText(TempString);

		}
		pm = "";
		SecondLabel.setText("");

	}

	public void values(ActionEvent action) {
		Labeltemp.setText("" + value1 + " " + value2);

	}

	public void clearAll(ActionEvent action) {

		value1 = "";
		pm = "";
		Label.setText("0");
		start = true;
		SecondLabel.setText("");
	}

	public void clearOne(ActionEvent action) {
		ClearSecondLabel(action);
		if (Label.getText().isEmpty()) {

		} else {
			String temp = "";
			temp = Label.getText();
			StringBuilder sb = new StringBuilder(temp);
			sb.deleteCharAt(sb.length() - 1);
			String a = new String(sb);
			Label.setText(a);

		}
		if (Label.getText().isEmpty()) {

			Label.setText("0");

		}

	}

	public void ClearSecondLabel(ActionEvent action) {
		if ((Label.getText() == "" || Label.getText() == "0") && SecondLabel.getText() != "") {

			String temp = SecondLabel.getText();

			StringBuilder sb = new StringBuilder(temp);
			sb.deleteCharAt(sb.length() - 1);
			String a = new String(sb);
			SecondLabel.setText(a);
			pm = "";

		}

	}

}
