package lab3.exercise1;

public class Odometer {

	private Counter listOfCounters[];
	private DigitCounter dc;
	private int s;

	public Odometer(int size) {
		this.s = size;
		if (size == 0)
			throw new IllegalArgumentException("Can't have size 0 odometer");
		listOfCounters = new Counter[size];
		dc = new DigitCounter();

		// create objects
		for (int i = 0; i < size; i++) {
			if (i == size - 1) {
				listOfCounters[i] = dc;
				break;
			}
			listOfCounters[i] = new LinkedDigitCounter();
		}
		// set left neighbours
		for (int i = 0; i < size; i++) {
			if (i==size-1) break;
			listOfCounters[i].setLeftNeightbour(listOfCounters[i + 1]);
		}

	}

	public void increment() {
		listOfCounters[0].increment();
	}

	public void decrement() {
		listOfCounters[0].decrement();
	}
	public void reset(){
		for (Counter c:listOfCounters){
			c.reset();
		}
	}

	@Override
	public String toString() {
		for (int i = s - 1; i >= 0; i--) {
			System.out.print(listOfCounters[i].toString());
		}
		return "";
	}

}
