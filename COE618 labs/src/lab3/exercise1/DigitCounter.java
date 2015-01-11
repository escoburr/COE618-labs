package lab3.exercise1;

public class DigitCounter extends AbstractCounter {

	private int v;

	public DigitCounter() {
		super();
		v = super.getValue();
	}

	@Override
	public void increment() {
		if (v < 9)
			v++;
		else {
			v = 0;

		}
	}
	
	

	@Override
	public void reset() {
		v=0;
	}

	@Override
	public String toString() {
		return Integer.toString(v);
	}

	@Override
	public void setLeftNeightbour(Counter c) {
		// TODO Auto-generated method stub

	}

}
