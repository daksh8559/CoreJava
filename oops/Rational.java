public class Rational {
 private int numerator;
 private int denominator;



 public Rational() {

 }

 public Rational(int numerator, int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
 }
 
 public void set(int n, int d) {
    numerator = n;
    denominator = d;
 }


 public Rational add(Rational r) {
   Rational temp = new Rational();
   int n = (this.numerator * r.denominator) + (this.denominator * r.numerator);
   int n1 = this.denominator*r.denominator;
   temp.set(n, n1);
   return temp;
 }

  public Rational subtract(Rational r) {
   Rational temp = new Rational();
   int n = (this.numerator * r.denominator) - (this.denominator * r.numerator);
   int n1 = this.denominator*r.denominator;
   temp.set(n, n1);
   return temp;
 }

  public Rational multiply(Rational r) {
   Rational temp = new Rational();
   int n = (this.numerator * r.numerator);
   int n1 = this.denominator*r.denominator;
   temp.set(n, n1);
   return temp;
 }

   public Rational divide(Rational r) {
   Rational temp = new Rational();
   int n = (this.numerator * r.denominator);
   int n1 = this.denominator*r.numerator;
   temp.set(n, n1);
   return temp;
 }

 public void show() {
    System.out.println(numerator+"/"+denominator);
 }
}
