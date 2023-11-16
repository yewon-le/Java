
class Point {
private int x,y;
public void set(int x, int y) {
	this.x=x; this.y=y;
}
public void showPoint() {
	System.out.println("(" + x +"," + y + ")");
	}
}

//=======================

class ColorPoint extends Point {
	private String color;
	void setColor(String color) {
		this.color = color;
	}
	void showColorPoint() {
		System.out.print(color);
		super.showPoint();
	}
}