package view.frame;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Frame extends JFrame {

	private static final long serialVersionUID = 8296914021670968846L;

	private final String ICON_FILE = "icon.png";
	private final String MENU_TITLE = "Menu";
	private final String FRAME_TITLE = "Calculadora";
	private final int FRAME_WIDTH = 284;
	private final int FRAME_HEIGHT = 450;
	
	public ArrayList<JMenuItem> menuItemList;
	
	public Frame() {
		super();
		initialize();
	}
	
	public ArrayList<JMenuItem> menuItemlist() {
		return menuItemList;
	}
	
	private void initialize() {
		
		/* FRAME */
		
		this.setTitle(FRAME_TITLE);
		this.getContentPane().setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		/* ICON */
		
		ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource(ICON_FILE));
		this.setIconImage(icon.getImage());
		
		/* MENU */
		
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		
		JMenu menu = new JMenu(MENU_TITLE);
		menuBar.add(menu);
		
		menuItemList = new ArrayList<JMenuItem>();
		
		for (MenuItem menuItemEnum : MenuItem.values()) {
			JMenuItem menuItem = new JMenuItem(menuItemEnum.title());
			menu.add(menuItem);
			menuItemList.add(menuItem);
		}
	}
}
