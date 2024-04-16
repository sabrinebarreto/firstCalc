package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class ViewController implements Initializable{
	
	@FXML
	private TextField textField;
	
	@FXML
	private TextField resultField;
	
	private String firstNumber = "";
	private String currentNumber = "";
	private String cType;
	
	@FXML
	public void sum(ActionEvent event) {
		cTypeCalc("+");
	}
	@FXML
	public void multiply(ActionEvent event) {
		cTypeCalc("*");
	}
	@FXML
	public void minus(ActionEvent event) {
		cTypeCalc("-");
	}
	
	@FXML
	public void divide(ActionEvent event) {
		cTypeCalc("/");
	}
	
	@FXML
	public void equalsBt(ActionEvent event) {
		
		int firstNumberInt = Integer.parseInt(firstNumber);
		int currentNumberInt = Integer.parseInt(currentNumber);

		if (cType == "+") {
			int result = firstNumberInt + currentNumberInt;
			textField.setText(firstNumberInt + " " + cType + " " + currentNumberInt);
			resultField.setText(String.valueOf(result));
		}
		if (cType == "-") {
			int result = firstNumberInt - currentNumberInt;
			textField.setText(firstNumberInt + " " + cType + " " + currentNumberInt);
			resultField.setText(String.valueOf(result));
		}
		if (cType == "/") {
			double result = firstNumberInt / (double)currentNumberInt;
			textField.setText(firstNumberInt + " " + cType + " " + currentNumberInt);
			resultField.setText(String.valueOf(result));
		}
		if (cType == "*") {
			int result = firstNumberInt * currentNumberInt;
			textField.setText(firstNumberInt + " " + cType + " " + currentNumberInt);
			resultField.setText(String.valueOf(result));
		}
	}
	
	@FXML
	public void number1(ActionEvent event) {
		addNumber("1");
	}
	
	@FXML
	public void number2(ActionEvent event) {
		addNumber("2");
	}
	
	@FXML
	public void number3(ActionEvent event) {
		addNumber("3");
	}
	
	@FXML
	public void number4(ActionEvent event) {
		addNumber("4");
	}
	
	@FXML
	public void number5(ActionEvent event) {
		addNumber("5");
	}
	
	@FXML
	public void number6(ActionEvent event) {
		addNumber("6");
	}
	
	@FXML
	public void number7(ActionEvent event) {
		addNumber("7");
	}
	
	@FXML
	public void number8(ActionEvent event) {
		addNumber("8");
	}
	
	@FXML
	public void number9(ActionEvent event) {
		addNumber("9");
	}
	
	@FXML
	public void number0(ActionEvent event) {
		if(!currentNumber.equals("")) {
		addNumber("0");
		}
	}
	
	public void clearBt(ActionEvent event) {
		if (firstNumber != null) {
			firstNumber = "";
		}
		currentNumber = "";
		cType = "";
		textField.setText("");
		resultField.setText("");
	}
	

	public void updateTextField() {
		textField.setText(currentNumber);
	}
	
	
	public void addNumber(String number) {
		currentNumber += number;
		updateTextField();
	}
	
	public void cTypeCalc(String cType) {
		this.cType = cType;
		firstNumber = currentNumber;
		currentNumber = "";
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
	
	}

}
