public class Rational {
    private int numerator; // täljare
    private int denominator; // nämnare

    Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Rational add(Rational r) {
        int tempNumerator;
        int tempDenominator;
        int tempgcd;

        tempNumerator = (numerator * r.getDenominator()) + (denominator * r.getNumerator());
        tempDenominator = (denominator * r.getDenominator());

        tempgcd = gcd(tempNumerator, tempDenominator);

        tempNumerator = tempNumerator/tempgcd;
        tempDenominator = tempDenominator/tempgcd;

        return new Rational(tempNumerator, tempDenominator);
    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    @Override
    public String toString() {
        return numerator + " / " + denominator;
    }
}