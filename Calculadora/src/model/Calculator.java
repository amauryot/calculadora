package model;

public class Calculator {

	private double number1;
	private double number2;
	
	public void setNumbers(double number1, double number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	public double add() {
		return number1 + number2;
	}
	
	public double subtract() {
		return number1 - number2;
	}
	
	public double multiply() {
		return number1 * number2;
	}
	
	public double divide() {
		return number1 / number2;
	}
}
