public class UseMoney {
    public static void main(String[] args) {
        Money m1;
        m1 = new Money();
        m1.set(100, 30);
        System.out.println("First amount is: ");
        m1.show();

        Money m2 = new Money();
        m2.set(200, 30);
        System.out.println("Second amount is: ");
        m2.show();
    }
}
