package lab4.exercise1;

public class Poly {
	// OVERVIEW: Polys are immutable polynomials with integer coefficients.
	//   A typical Poly is c0+c1x+...

	// constructor
	public Poly() {
		// EFFECTS: Initializes this to be the zero polynomial
	}

	public Poly(int c, int n) throws NegativeExponentException {
		// EFFECTS: if n<0 throws NegativeExponentException else
		// initializes this to be the Poly cx^n.

	}

	// methods
	public int degree() {
		// EFFECTS: Returns the degree of this, i.e., the largest exponent
		// with a non-zero coefficient. Returns 0 if this is the zero Poly.
		return 0;
	}

	public int coeff(int d) {
		// EFFECTS: Returns the coefficient of the term of this whose exponent
		// is d.
		return 0;
	}

	public Poly add(Poly q) throws NullPointerException {
		// EFFECTS: if q is null throws NullPointerException else
		// returns the Poly this+q.
		return null;

	}

	public Poly mul(Poly q) throws NullPointerException {
		// EFFECTS: if q is null throws NullPointerException else
		// return the Poly this*q.
		return null;
	}

	public Poly sub(Poly q) throws NullPointerException {
		// EFFECTS: if q is null throws NullPointerException else
		// returns the Poly this - q.
		return null;
	}

	public Poly minus() {
		// EFFECT: Returns the Poly - this.
		return null;
	}

	public static Poly diff(Poly p) throws NullPointerException {
		// EFFECTS: if p is null throws NullPointerException
		// else returns the Poly obtained by differentiating p.
		Poly q = new Poly();
		for (int i = 1; i <= p.degree(); i++)
			q = q.add(new Poly(p.coeff(i) * i, i - 1));
		return q;
	}

}
