package org.example.javafxcalculator;

public class Calculator {

    private double operand1;
    private double operand2;
    private char operator;
    private double result;
    private boolean isError;

    // Sets the first operand
    public void setOperand1(double operand) {
        this.operand1 = operand;
    }

    // Sets the second operand
    public void setOperand2(double operand) {
        this.operand2 = operand;
    }

    // Sets the operator for the arithmetic operation
    public void setOperator(char operator) {
        this.operator = operator;
    }

    // Performs the calculation based on the operator
    public void calculate() {
        isError = false;  // Reset error state
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 == 0) {
                    isError = true; // Handle division by zero error
                } else {
                    result = operand1 / operand2;
                }
                break;
            default:
                isError = true; // Handle invalid operator
        }
    }

    // Returns the result of the calculation
    public double getResult() {
        return result;
    }

    // Returns true if an error occurred during the calculation
    public boolean isError() {
        return isError;
    }

    // Resets all fields for a new calculation
    public void reset() {
        operand1 = 0;
        operand2 = 0;
        operator = '\0';
        result = 0;
        isError = false;
    }
}