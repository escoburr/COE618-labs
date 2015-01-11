package lab4.exercise1;

import java.util.Vector;

public class IntSet {
	// OVERVIEW: IntSets are mutable, unbounded sets of integers,
	// A typical IntSet is {x1,...,xn}.
	private Vector<Integer> els; // the rep

	// constructors
	public IntSet() {
		// EFFECTS:Initializes this to be empty
		els = new Vector<>();
	}

	// methods
	public void insert(int x) {
		// MODIFIES: this
		// EFFECTS: Adds x to the elements of this, i.e., this_post = this+{x}
		Integer y = new Integer(x);
		if (getIndex(y) >= 0)
			els.add(y);
	}

	public void remove(int x) {
		// MODIFIES: this
		// EFFECTS: Removes x from this, i.e., this_post = this-{x}
		Integer y = new Integer(x);
		int index = getIndex(y);
		if (index < 0)
			return;
		if (index >= 0)
			els.remove(index);

	}

	public boolean isIn(int x) {
		// EFFECTS: if x is in this returns true else returns false
		return getIndex(new Integer(x))>=0;
	}

	public int size() {
		// EFFECTS: Returns the cardinality of this
		return els.size();
	}

	private int getIndex(Integer x) {
		// EFFECTS: if x is in this returns index where x appears else returns -
		// 1.
		for (int i = 0; i < els.size(); i++) {
			if (x.equals(els.get(i)))
				return i;
		}
		return -1;
	}

	public int choose() throws EmptyException {
		// EFFECTS: if this is empty, throws EmptyException else
		// returns an arbitrary element of this.
		if (els.size() == 0)
			throw new EmptyException("Intset.choose");
		return els.lastElement();
	}

	public static IntSet getElemenets(int[] a) throws NullPointerException {
		// EFFECTS: if a is null throws NullPointerException else returns a set
		// containing an entry for each distinct element of a.
		IntSet s = new IntSet();
		for (int i = 0; i < a.length; i++)
			s.insert(a[i]);
		return s;

	}

}
