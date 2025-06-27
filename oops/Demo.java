public class Demo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        int x,y;
        float f1,f2;

        x = calc.sum(3, 4);
        System.out.println("3+4="+x);

        y = calc.sum(3, 4,5);
        System.out.println("3+4+5="+y);

        f1 = calc.sum(2.4f, 3.4f);
        System.out.println("2.4+3.4="+f1);

        f2 = calc.sum(2.4f, 3.4f, 5.6f);
        System.out.println("2.4+3.4+5.6="+f2);
    }
}
