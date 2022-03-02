package view;

import javax.swing.JFrame;

public class Window {

	private JFrame frame;

	public Window() {
		initialize();
	}

	public void show() {
		frame.setVisible(true);
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
