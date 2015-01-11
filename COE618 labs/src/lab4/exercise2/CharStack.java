package lab4.exercise2;

public class CharStack {
	/**
	 * Implementation of a first-in, last-out stack.
	 */

	// Abstraction function:
	//The nth element from the bottom of the stack = stackArray[N-1]
	//where the 1st elemenet is at the bottom
	
	// Rep invariant:
	//For any index i such that 0 <= i < size, elements[i] != null
	//topOfStack = size - 1
	
	// Instance variables
	private char[] stackArray;// The array implementing the stack.
	private int topOfStack;// The top of the stack.

	// static variable
	private static int counter;

	// Constructor now increments the counter for each object created.
	public CharStack(int capacity) {
		stackArray = new char[capacity];
		counter++;
	}

	// Instance methods
	public void push(char element) {
		stackArray[++topOfStack] = element;
	}

	public char pop() {
		return stackArray[topOfStack--];
	}

	public char peek() {
		return stackArray[topOfStack];
	}

	public boolean isEmpty() {
		return topOfStack < 0;
	}

	public boolean isFull() {
		return topOfStack == stackArray.length - 1;
	}

	public boolean RepOK() {
		// EFFECTS: Returns true if the rep invariant holds for this;
		// //otherwise returns false
		if (topOfStack == stackArray.length-1){
			return true;
		}
		return false;
	}
}
