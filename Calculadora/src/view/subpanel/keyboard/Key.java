package view.subpanel.keyboard;

public enum Key {

	CLEAR(0,  "AC"), MINUS(1,  "+/-"), PERCENTAGE(2,  "%"), DIVISION      (3,  "÷"),
	SEVEN(4,  "7" ), EIGHT(5,  "8"  ), NINE      (6,  "9"), MULTIPLICATION(7,  "x"),
	FOUR (8,  "4" ), FIVE (9,  "5"  ), SIX       (10, "6"), SUBTRACTION   (11, "-"),
	ONE  (12, "1" ), TWO  (13, "2"  ), THREE     (14, "3"), ADDITION      (15, "+"),
	ZERO (16, "0" ), DOT  (17, "."  ), EQUAL     (18, "=");
	
	private int index;
	private String title;
	
	private Key(int index, String title) {
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
