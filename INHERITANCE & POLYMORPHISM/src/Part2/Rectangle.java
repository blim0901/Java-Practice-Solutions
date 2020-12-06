package Part2;

public class Rectangle implements Shape {

	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public int getLength() {
		return length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public double getArea() {
		return this.length * this.width;
	}
	
}

