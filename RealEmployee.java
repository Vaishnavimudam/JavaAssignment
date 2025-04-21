package proxy;

public class RealEmployee implements Employee {
    String name;
    String position;
    private double salary;

    public RealEmployee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Salary: $" + salary);
    }

    public double getSalary() {
        return salary;
    }
}
