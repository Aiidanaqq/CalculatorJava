package org.example.javafxcalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {

    private Calculator calculator = new Calculator();
    private StringBuilder input = new StringBuilder();

    @FXML
    private TextField display;

    @FXML
    public void handleNumber(javafx.event.ActionEvent event) {
        String value = ((Button) event.getSource()).getText();
        input.append(value);
        display.setText(input.toString());
    }

    @FXML
    public void handleOperator(javafx.event.ActionEvent event) {
        if (input.length() > 0) {
            calculator.setOperand1(Double.parseDouble(input.toString()));
            input.setLength(0); // Reset input for the next operand
            String operator = ((Button) event.getSource()).getText();
            calculator.setOperator(operator.charAt(0));
        }
    }

    @FXML
    public void handleEquals(javafx.event.ActionEvent event) {
        if (input.length() > 0) {
            calculator.setOperand2(Double.parseDouble(input.toString()));
            calculator.calculate();
            if (calculator.isError()) {
                display.setText("Error: Division by Zero");
            } else {
                display.setText(Double.toString(calculator.getResult()));
            }
            input.setLength(0); // Clear input for the next operation
        }
    }

    @FXML
    public void handleClear(javafx.event.ActionEvent event) {
        calculator.reset();
        input.setLength(0);
        display.setText("");
    }
}