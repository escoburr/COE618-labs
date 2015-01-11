package lab3.exercise1;

public class LinkedDigitCounter extends AbstractCounter {
	private Counter leftNeighbour;
	AbstractCounter ab;

	public LinkedDigitCounter() {
		super();
	}

	public void setLeftNeightbour(Counter c) {
		this.leftNeighbour = c;
		ab = (AbstractCounter)leftNeighbour;
	}

	@Override
	public void increment() {
		if (super.getValue() < 9) {
			super.increment();
		} else {
			super.reset();
			leftNeighbour.increment();
		}
	}

	@Override
	public void decrement() {
		
		if (super.getValue()>0){
			super.decrement();
		}else{
			ab.decrement();
			super.setValue(9);
		}
	}

	@Override
	public String toString() {
		return Integer.toString(super.getValue());
	}
}
