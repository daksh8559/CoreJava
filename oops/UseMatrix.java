public class UseMatrix {
    public static void main(String[] args) {
        Matrix m1 = new Matrix();
        System.out.println("Enter 9 values");
        m1.read();

        Matrix m2 = new Matrix(4,3);
        System.out.println("Enter "+4*3+" values");
        m2.read();

        System.out.println("First matrix is:");
        m1.show();

        System.out.println("Second matrix is:");
        m2.show();

        // copy constructor 
        Matrix m3 = new Matrix(m2);
        System.out.println("Third matrix is:");
        m3.show();
    }
}
