package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Calculator;
import view.OptionPane;
import view.Window;
import view.frame.MenuItem;
import view.subpanel.keyboard.Key;

public class Controller implements ActionListener {

	private Calculator calculator;
	private OptionPane optionPane;
	private Window window;
	
	public Controller() {
		calculator = new Calculator();
		optionPane = new OptionPane();
		window = new Window();
	}
	
	public void run() {
		window.show();
		window.addController(this);
	}

	private String operator() {
		if (window.getDisplayValue().contains("÷")) return "÷";
		if (window.getDisplayValue().contains("-")) return "-";
		if (window.getDisplayValue().contains("x")) return "x";
		return "\\+";
	}
	
	private double getResult() {
		if (operator().equals("÷")) return calculator.divide();
		if (operator().equals("-")) return calculator.subtract();
		if (operator().equals("x")) return calculator.multiply();
		return calculator.add();
	}
	
	private String number(String number) {
		if (window.getDisplayValue().equals("0")) {
			window.clearDisplay();
		}
		return number;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {

		/* MENU ITEM ABOUT */
		
		if (event.getSource() == window.getMenuItem(MenuItem.ABOUT)) {
			optionPane.showMessageAbout();
			return;
		}
		
		/* MENU ITEM EXIT */
		
		if (event.getSource() == window.getMenuItem(MenuItem.EXIT)) {
			window.close();
		}
		
		/* KEY (=) */
		
		if (event.getSource() == window.getKey(Key.EQUAL)) {
			double number1 = Double.parseDouble(window.getDisplayValue().split(operator())[0]);
			double number2 = Double.parseDouble(window.getDisplayValue().split(operator())[1]);
			
			calculator.setNumbers(number1, number2);
			
			String result = String.valueOf(getResult());
			
			window.clearDisplay();
			window.setDisplay(result);
			return;
		}
		
		/* KEY (+/-) */
		
		if (event.getSource() == window.getKey(Key.MINUS)) {
			// TODO
			return;
		}
		
		/* KEY (%) */
		
		if (event.getSource() == window.getKey(Key.PERCENTAGE)) {
			// TODO
			return;
		}
		
		/* KEY (AC) */
		
		if (event.getSource() == window.getKey(Key.CLEAR)) {
			window.clearDisplay();
			return;
		}
		
		/* KEY (.) */
		
		if (event.getSource() == window.getKey(Key.DOT)) {
			window.setDisplay(".");
			return;
		}
		
		/* KEY (+) */
		
		if (event.getSource() == window.getKey(Key.ADDITION)) {
			window.setDisplay("+");
			return;
		}
		
		/* KEY (-) */
		
		if (event.getSource() == window.getKey(Key.SUBTRACTION)) {
			window.setDisplay("-");
			return;
		}
		
		/* KEY (x) */
		
		if (event.getSource() == window.getKey(Key.MULTIPLICATION)) {
			window.setDisplay("x");
			return;
		}
		
		/* KEY (÷) */
		
		if (event.getSource() == window.getKey(Key.DIVISION)) {
			window.setDisplay("÷");
			return;
		}
		
		/* KEY (0) */
		
		if (event.getSource() == window.getKey(Key.ZERO)) {
			window.setDisplay(number("0"));
			return;
		}
		
		/* KEY (1) */
		
		if (event.getSource() == window.getKey(Key.ONE)) {
			window.setDisplay(number("1"));
			return;
		}
		
		/* KEY (2) */
		
		if (event.getSource() == window.getKey(Key.TWO)) {
			window.setDisplay(number("2"));
			return;
		}
		
		/* KEY (3) */
		
		if (event.getSource() == window.getKey(Key.THREE)) {
			window.setDisplay(number("3"));
			return;
		}
		
		/* KEY (4) */
		
		if (event.getSource() == window.getKey(Key.FOUR)) {
			window.setDisplay(number("4"));
			return;
		}
		
		/* KEY (5) */
		
		if (event.getSource() == window.getKey(Key.FIVE)) {
			window.setDisplay(number("5"));
			return;
		}
		
		/* KEY (6) */
		
		if (event.getSource() == window.getKey(Key.SIX)) {
			window.setDisplay(number("6"));
			return;
		}
		
		/* KEY (7) */
		
		if (event.getSource() == window.getKey(Key.SEVEN)) {
			window.setDisplay(number("7"));
			return;
		}
		
		/* KEY (8) */
		
		if (event.getSource() == window.getKey(Key.EIGHT)) {
			window.setDisplay(number("8"));
			return;
		}
		
		/* KEY (9) */
		
		if (event.getSource() == window.getKey(Key.NINE)) {
			window.setDisplay(number("9"));
			return;
		}
	}
}
