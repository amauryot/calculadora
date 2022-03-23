package view;

import javax.swing.JOptionPane;

public class OptionPane {

	private final String MESSAGE_TITLE = "Sobre Calculadora";
	private final String MESSAGE_ABOUT = 
		"Calculadora"
		+ "\nCopyright © Mar 2022"
		+ "\n\nVersão: 0.4.1"
		+ "\n\nAmaury Tavares"
		+ "\namauryot@gmail.com\n\n";
	
	public void showMessageAbout() {
		JOptionPane.showMessageDialog(null, MESSAGE_ABOUT, MESSAGE_TITLE, JOptionPane.INFORMATION_MESSAGE);
	}
}
