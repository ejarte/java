package money;

/**
 * Represents an amount of money, represented in a specific currency.
 * Instances of this class are <em>immutable</em>.
 */
public class Money implements IMoney {
    private final double amount;
    private final Currency currency;

    /**
     * Create an instance with the indicated amount and currency.
     */
    public Money(double amount, Currency currency) throws IllegalArgumentException {
        if (amount < 0) throw new IllegalArgumentException("amount  < 0");
        this.amount = amount;
        this.currency = currency;
    }

    /**
     * Create an instance with amount 0 and the indicated currency.
     */
    public Money(Currency currency) {
        this(0.0, currency);
    }

    /**
     * Create an instance with amount 0 and currency EUR.
     */
    public Money() {
        this(Currency.EUR);
    }

    /**
     * Return the amount for this money.Money.
     */
    @Override
    public double getAmount() {
        return amount;
    }

    /**
     * Return the currency for this money.Money.
     */
    @Override
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Return a copy of this instance.
     */
    @Override
    public Money copy() {
        return new Money(this.amount, this.currency);
    }

    /**
     * Create a new money.Money instance, with the indicated currency and the
     *
     * @param newCurrency
     * @return a new money.Money instance.
     */
    @Override
    public Money toCurrency(Currency newCurrency) {
        return new Money(calculateAmountIn(newCurrency), newCurrency);
    }

    /**
     * Create a new money.Money instance with the sum, in the same currency as this.
     *
     * @param moneyToAdd the money to add to this money
     * @return a new money.Money instance in the same currency as this.
     */
    @Override
    public Money add(Money moneyToAdd) {
        double sum = this.amount + moneyToAdd.calculateAmountIn(this.getCurrency());
        return new Money(sum, this.currency);
    }

    /**
     * Create a new money.Money instance with the difference, in the same currency as this.
     *
     * @param moneyToAdd the money to add to this money
     * @return a new money.Money instance in the same currency as this.
     * @throws IllegalArgumentException if the sum is less than zero.
     */
    @Override
    public Money subtract(Money moneyToAdd) throws IllegalArgumentException {
        double sum = this.amount - moneyToAdd.calculateAmountIn(this.getCurrency());
        if (sum < 0) throw new IllegalArgumentException("new amount < 0");
        return new Money(sum, this.currency);
    }

    /**
     * Return a string with the amount, rounded to two decimals, and the currency.
     */
    @Override
    public String toString() {
        return String.format("%.2f %s", amount, currency.toString());
    }

    /**
     * Compare amounts, internally converted to EUR. Two instances are
     * considered equal if amounts differ less than 1E-3.
     * Also see documentation for interface java.lang.Comparable.
     */
    public int compareTo(Money other) {
        double thisEur = this.calculateAmountIn(Currency.EUR);
        double otherEur = other.calculateAmountIn(Currency.EUR);
        if(Math.abs(thisEur- otherEur)< 1E-3) {
            return 0;
        }
        else if(thisEur > 0) {
            return 1;
        }
        else {
            return -1;
        }
    }

    /**
     * Compare amounts, internally converted to EUR. Two instances are
     * considered equal if amounts differ less than 1E-3.
     * Also see documentation for class java.lang.Object.
     */
    @Override
    public boolean equals(Object other) {
        if(other instanceof Money) {
            return this.compareTo((Money) other) == 0;
        }
        return false;
    }

    private double calculateAmountIn(Currency newCurrency) {
        return amount * this.currency.getRate() / newCurrency.getRate();
    }
}
