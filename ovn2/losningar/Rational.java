/**
 * A rational-object represents a rational number (fraction);
 * numerator/denominator.
 */
public class Rational {

	public Rational(int num_, int den_) {
		// Check data
		if (den_ == 0)
			den_ = 1;

		num = num_;
		den = den_;
		reduce();
	}

	public Rational(int value) { // value/1
		num = value;
		den = 1;
	}

	public Rational() {
		num = 0;
		den = 1;
	}

	public int getNumerator() {
		return num;
	}

	public int getDenominator() {
		return den;
	}

	/**
	 * Create a new, reduced, Rational, representing the sum of this rational
	 * and other.
	 */
	public Rational add(Rational other) {
		return new Rational(num * other.den + other.num * den, den * other.den);
	}

	public String toString() {
		String info = num + "/" + den;
		return info;
	}

	// Attributes and private methods
	private int num, den;

	private int gcd(int m, int n) {
		m = Math.abs(m);
		n = Math.abs(n);
		while (m != n) {
			if (m > n)
				m -= n;
			else
				n -= m;
		}
		return m;
	}

	private void reduce() {
		if (num != 0) {
			int common = gcd(num, den);
			num = num / common;
			den = den / common;
		} else {
			den = 1;
		}

		if (den < 0) { // denominator should be positive
			num = -1 * num;
			den = -1 * den;
		}
	}
}