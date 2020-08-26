public class RationalMain {

	public static void main(String[] args) {

		Rational r1 = new Rational(3, 9);
		Rational r2 = new Rational(5, 30);
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		
		Rational r3 = r1.add(r2);
		System.out.println("r1 + r2 = " + r3);
	}
}
