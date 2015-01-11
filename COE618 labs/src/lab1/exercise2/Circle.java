package lab1.exercise2;

public class Circle extends TwoDShape{
	private double radius;
	
	public Circle(int x, int y, double radius){
		super(x,y);
		if (radius<0) throw new IllegalArgumentException("Radius cannot be negative");
		this.radius = radius;
	}
	
	public double getRadius(){
		return this.radius;
	}

	@Override
	public void scale(double factor) {
		if (factor < 0 ) throw new IllegalArgumentException("factor cannot be negative");
		this.radius = this.radius  * factor;
		
	}
}
