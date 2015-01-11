package lab3.exercise1;

public abstract class AbstractCounter implements Counter {
	private int value;

	public AbstractCounter() {
		value = 0;
	}
	

	public int getValue() {
		return value;
	}
	public void setValue(int value){
		this.value = value;
	}


	public void increment() {
		if (value < 9)
			value = value + 1;
		else {
			value = 0;
			// increment digit to the left
		}
	}

	public void decrement() {
		if (value > 0)
			value = value - 1;
		else {
			value = 9;
			// decrement digit to the left
		}
	}

	public void reset() {
		value =0;
	}

	public String count() {
		return Integer.toString(value);
	}

}
