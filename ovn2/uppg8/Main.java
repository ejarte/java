public class Main {
    public static void main(String[] args) {
        Rational rational = new Rational(6,3);
        Rational newRational = new Rational(8,2);

        System.out.println(rational.add(newRational).toString());

        System.out.println(rational.toString());
    }
}