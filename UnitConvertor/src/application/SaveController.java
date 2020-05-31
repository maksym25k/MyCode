package application;

import java.io.IOException;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SaveController {

	// false = weigth
	// true == length
	boolean state  = true ;

	double firstUnit;
	double secondUnit;
	@FXML
	MenuButton firstunit;

	@FXML
	TextField TextField1 = new TextField();
	@FXML
	TextField TextField2 = new TextField();

	@FXML
	public void changeToLength(ActionEvent action) throws IOException {

		Parent root = FXMLLoader.load(getClass().getResource("LengthFxml.fxml"));
		Scene scene = new Scene(root);
		Stage window = (Stage) ((Node) action.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
state = true	;
System.out.println("prdel");
	}

	public void changeToWeight(ActionEvent action) throws IOException {

		Parent root = FXMLLoader.load(getClass().getResource("Weight.fxml"));
		Scene scene = new Scene(root);
		Stage window = (Stage) ((Node) action.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();
state = false ;
System.out.println("prdel");
	}
	


	public void setFirstUnit(ActionEvent action ) {
		String temp = ((MenuItem) action.getSource()).getText();
		if (state) {
			System.out.println("prdel");

			for (Length c : Length.values()) {
				if (c.name().equals(temp)) {
					firstUnit = c.getConstant();
					System.out.println("prdel");
				}

			}

		} else {

			if (!state) {
				for (Weight c : Weight.values()) {
					if (c.name().equals(temp)) {
						firstUnit = c.getConstant();
						System.out.println("prdel");
					
					}

				}
			}

		}
		
	}

	public void setSecondUnit(ActionEvent action) {
		System.out.println("prdel");
		String temp = ((MenuItem) action.getSource()).getText();
		if (state) {
			System.out.println("prdel");

			for (Length c : Length.values()) {
				if (c.name().equals(temp)) {
					secondUnit = c.getConstant();
				}
				System.out.println("prdel");

			}

		} else {

			if (!state) {
				for (Weight c : Weight.values()) {
					if (c.name().equals(temp)) {
						secondUnit = c.getConstant();
						System.out.println("prdel");
					}

				}
			}

		}
	}
}
