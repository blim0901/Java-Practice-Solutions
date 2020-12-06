package Part2;

public class Triangle implements Shape{

	private int base;
	private int height;
	
	public Triangle(int height, int base) {
		this.height = height;
		this.base = base;
	}
	
	public int getBase() {
		return base;
	}
	
	public double getArea() {
		return this.height * this.base * 0.5;
	}
	
}
