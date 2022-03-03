package view.subpanel.keyboard;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class SubPanelKeyboard extends JPanel {

	private static final long serialVersionUID = 7179741503899190282L;

	private final int SUBPANEL_X = 10,    SUBPANEL_Y = 70,    SUBPANEL_WIDTH = 230,   SUBPANEL_HEIGHT = 290;
	private final int SUBPANEL_1_X = 0,   SUBPANEL_1_Y = 0,   SUBPANEL_1_WIDTH = 230, SUBPANEL_1_HEIGHT = 230;
	private final int SUBPANEL_2_X = 0,   SUBPANEL_2_Y = 240, SUBPANEL_2_WIDTH = 110, SUBPANEL_2_HEIGHT = 50;
	private final int SUBPANEL_3_X = 120, SUBPANEL_3_Y = 240, SUBPANEL_3_WIDTH = 110, SUBPANEL_3_HEIGHT = 50;
	private final int GRID_1_ROWS = 4, GRID_1_COLS = 4, GRID_1_HGAP = 10, GRID_1_VGAP = 10;
	private final int GRID_2_ROWS = 1, GRID_2_COLS = 1, GRID_2_HGAP = 0,  GRID_2_VGAP = 0;
	private final int GRID_3_ROWS = 1, GRID_3_COLS = 2, GRID_3_HGAP = 10, GRID_3_VGAP = 0;
	
	private JPanel subPanel1;
	private JPanel subPanel2;
	private JPanel subPanel3;
	private ArrayList<JButton> keyList;
	
	public SubPanelKeyboard() {
		super();
		initialize();
	}
	
	public ArrayList<JButton> keyList() {
		return keyList;
	}
	
	private JPanel panel(int index) {
		if (index < 16) return subPanel1;
		if (index > 16) return subPanel3;
		return subPanel2;
	}
	
	private void initialize() {
		
		/* SUBPANELS */
		
		this.setLayout(null);
		this.setBounds(SUBPANEL_X, SUBPANEL_Y, SUBPANEL_WIDTH, SUBPANEL_HEIGHT);
		
		subPanel1 = new JPanel();
		subPanel1.setLayout(new GridLayout(GRID_1_ROWS, GRID_1_COLS, GRID_1_HGAP, GRID_1_VGAP));
		subPanel1.setBounds(SUBPANEL_1_X, SUBPANEL_1_Y, SUBPANEL_1_WIDTH, SUBPANEL_1_HEIGHT);
		this.add(subPanel1);
		
		subPanel2 = new JPanel();
		subPanel2.setLayout(new GridLayout(GRID_2_ROWS, GRID_2_COLS, GRID_2_HGAP, GRID_2_VGAP));
		subPanel2.setBounds(SUBPANEL_2_X, SUBPANEL_2_Y, SUBPANEL_2_WIDTH, SUBPANEL_2_HEIGHT);
		this.add(subPanel2);
		
		subPanel3 = new JPanel();
		subPanel3.setLayout(new GridLayout(GRID_3_ROWS, GRID_3_COLS, GRID_3_HGAP, GRID_3_VGAP));
		subPanel3.setBounds(SUBPANEL_3_X, SUBPANEL_3_Y, SUBPANEL_3_WIDTH, SUBPANEL_3_HEIGHT);
		this.add(subPanel3);
		
		/* FONT */
		
		Font buttonFont = new Font("Tahoma", Font.BOLD, 18);
		
		/* BUTTONS */
		
		keyList = new ArrayList<JButton>();
		
		for (Key key : Key.values()) {
			JButton button = new JButton(key.title());
			button.setMargin(new Insets(0, 0, 0, 0));
			button.setFont(buttonFont);
			button.setFocusable(false);
			panel(key.index()).add(button);
			keyList.add(button);
		}
	}
}
