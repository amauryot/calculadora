package view;

import javax.swing.JMenuItem;

import controller.Controller;
import view.frame.Frame;
import view.frame.MenuItem;
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

	public JMenuItem getMenuItem(MenuItem menuItem) {
		return frame.menuItemList.get(menuItem.index());
	}
	
	public void addController(Controller controller) {
		frame.menuItemList.forEach(menuItem -> menuItem.addActionListener(controller));
	}
	
	public void show() {
		frame.setVisible(true);
	}
	
	public void close() {
		frame.dispose();
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
