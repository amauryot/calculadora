package view.frame;

public enum MenuItem {

	ABOUT(0, "Sobre"),
	EXIT(1, "Sair");
	
	private int index;
	private String title;
	
	private MenuItem(int index, String title) {
		this.index = index;
		this.title = title;
	}
	
	public int index() {
		return index;
	}
	
	public String title() {
		return title;
	}
}
