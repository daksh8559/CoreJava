import java.io.Console;

public class Employee {
    
    private String name;
    private int age;
    private float salary;

    public Employee() {
        this.name = "Unknown";
    }

    public Employee(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee(Employee emp) {
        this.name = emp.name;
        this.age = emp.age;
        this.salary = emp.salary;
    }

    public void addEmployee() {
        Console con = System.console();

        System.out.print("Enter employee name: ");
        name = con.readLine();

        System.out.print("Enter employee age: ");
        age = Integer.parseInt(con.readLine());

        System.out.print("Enter employee salary: ");
        salary = Float.parseFloat(con.readLine());
    }

    public void showEmployee() {
        System.out.println("Employee name: "+name);
        System.out.println("Employee age: "+age);
        System.out.println("Employee salary: "+salary);
    }
}
