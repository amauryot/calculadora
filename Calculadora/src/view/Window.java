package view;

import view.frame.Frame;
import view.panel.PanelMain;
import view.subpanel.display.SubPanelDisplay;
import view.subpanel.keyboard.SubPanelKeyboard;

public class Window {

	private Frame frame;
	private PanelMain panelMain;
	private SubPanelDisplay subPanelDisplay;
	private SubPanelKeyboard subPanelKeyboard;

	public Window() {
		initialize();
	}

	public void show() {
		frame.setVisible(true);
	}
	
	private void initialize() {		
		frame = new Frame();
		
		panelMain = new PanelMain();
		frame.getContentPane().add(panelMain);
		
		subPanelDisplay = new SubPanelDisplay();
		panelMain.add(subPanelDisplay);
		
		subPanelKeyboard = new SubPanelKeyboard();
		panelMain.add(subPanelKeyboard);
	}
}
