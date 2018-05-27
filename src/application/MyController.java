package application;

import java.awt.Desktop.Action;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;


public class MyController {

	@FXML
	private Button sum;
	@FXML
	private Button res;
	@FXML
	private Button mul;

	@FXML
	private TextField num1;
	@FXML
	private TextField num2;
	@FXML
	private TextField resul;

	int numero1, numero2;

	@FXML
	public void initialize() {

	}

	@FXML
	public void suma(Action Event) {
		// SUMA NUM1 Y NUM2

		numero1 = Integer.parseInt(num2.getText());
		numero2 = Integer.parseInt(num1.getText());
		int resu = numero1 + numero2;
	       res.setText(Integer.toString(resu));
		
		
	}

	@FXML
	public void resta(Action Event) {

		// RESTA NUM1 Y NUM2

		numero1 = Integer.parseInt(num1.getText());
		numero2 = Integer.parseInt(num2.getText());
		int resu = numero1 - numero2;
	       res.setText(Integer.toString(resu));
	
		
	}

	@FXML
	public void multiplicacion(Action Event) {

		// MULTIPLICACION NUM1 Y NUM2

		numero1 = Integer.parseInt(num1.getText());
		numero2 = Integer.parseInt(num2.getText());
		int resu = numero1 * numero2;
	       res.setText(Integer.toString(resu));


	}
	

}
