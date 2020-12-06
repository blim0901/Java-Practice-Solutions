package Part2;

public class Pyramid extends Triangle implements Figure{

	private int slantHeight;
	
	public Pyramid(int slantHeight, int height, int base) {
		super(height, base);
		this.slantHeight = slantHeight;
	}
	
	public double getSurfaceArea() {
		return super.getBase() * 4 * 0.5 * this.slantHeight;
	}
	
}


