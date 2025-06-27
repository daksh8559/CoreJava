public class Office {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.addEmployee();

        Employee emp2 = new Employee();
        emp2.addEmployee();

        System.out.println("Here are the Office employees:");
        emp1.showEmployee();
        emp2.showEmployee();

    }
}
