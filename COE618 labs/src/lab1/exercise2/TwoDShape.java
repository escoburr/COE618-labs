package lab1.exercise2;

public abstract class TwoDShape {
	private int x;
	private int y;

	/**
	 * Constructor
	 * 
	 * @param x
	 *            the x-coordinate of the top left corner
	 * @param y
	 *            the y-coordinate of the top left corner
	 */
	public TwoDShape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		return (x + "" + y);
	}

	public abstract void scale(double factor);
}
