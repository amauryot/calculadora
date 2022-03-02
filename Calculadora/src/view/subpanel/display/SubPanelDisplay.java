package view.subpanel.display;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class SubPanelDisplay extends JPanel {

	private static final long serialVersionUID = 5947000816717475801L;

	private final int SUBPANEL_X = 10;
	private final int SUBPANEL_Y = 10;
	private final int SUBPANEL_WIDTH = 230;
	private final int SUBPANEL_HEIGHT = 50;
	
	private JTextField display;
	
	public SubPanelDisplay() {
		super();
		initialize();
	}
	
	public JTextField display() {
		return display;
	}
	
	private void initialize() {
		
		/* SUBPANEL */
		
		this.setLayout(new BorderLayout());
		this.setBounds(SUBPANEL_X, SUBPANEL_Y, SUBPANEL_WIDTH, SUBPANEL_HEIGHT);
		
		/* FONT */
		
		Font textFieldFont = new Font("Tahoma", Font.PLAIN, 30);
		
		/* TEXT FIELD */
		
		JTextField textField = new JTextField();
		textField.setFont(textFieldFont);
		textField.setHorizontalAlignment(JTextField.RIGHT);
		this.add(textField);
	}
}
