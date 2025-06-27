

public class UseRational {
    public static void main(String[] args) {
        Rational r1 = new Rational();
        r1.set(1, 2);
        r1.show();

        Rational r2 = new Rational(100,30);
        r2.show();

        Rational r3 = r1.add(r2);   
        r3.show();

        Rational r4 = r1.subtract(r2);   
        r4.show();

        Rational r5 = r1.multiply(r2);   
        r5.show();

        Rational r6 = r1.divide(r2);   
        r6.show();
    }
}
