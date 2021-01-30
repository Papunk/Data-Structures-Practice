package Fraction;

public class Fraction {
    private int a;
    private int b;

    public Fraction(int a, int b) {
        if (b == 0) return;
        this.a = a;
        this.b = b;
    }


    public int getNumerator() {
        return a;
    }

    public int getDenominator() {
        return b;
    }

    public double computeFraction() {
        return (double) a / b;
    }

    public Fraction getReciprocal() {
        return new Fraction(this.b, this.a);
    }


    public static Fraction add(Fraction f1, Fraction f2) {
        int newA = (f1.getNumerator() * f2.getDenominator()) + (f2.getNumerator() * f1.getDenominator());
        int newB = (f1.getDenominator() * f2.getDenominator());
        return new Fraction(newA, newB);
    }

    public static Fraction subtract(Fraction f1, Fraction f2) {
        int newA = (f1.getNumerator() * f2.getDenominator()) - (f2.getNumerator() * f1.getDenominator());
        int newB = (f1.getDenominator() * f2.getDenominator());
        return new Fraction(newA, newB);
    }

    public static Fraction multiply(Fraction f1, Fraction f2) {
        int newA = f1.getNumerator() * f2.getNumerator();
        int newB = f1.getDenominator() * f2.getDenominator();
        return new Fraction(newA, newB);
    }

    public static Fraction divide(Fraction f1, Fraction f2) {
        return multiply(f1, f2.getReciprocal());
    }

}
