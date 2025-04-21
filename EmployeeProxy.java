package proxy;

public class EmployeeProxy implements Employee {
    private RealEmployee realEmployee;
    private String role;

    public EmployeeProxy(String role) {
        this.role = role;
    }

    @Override
    public void displayInfo() {
        if ("admin".equals(role)) {
            if (realEmployee == null) {
                realEmployee = new RealEmployee("John Doe", "Software Engineer", 80000);
            }
            realEmployee.displayInfo(); 
        } else {
            if (realEmployee == null) {
                realEmployee = new RealEmployee("John Doe", "Software Engineer", 80000);
            }
            System.out.println("Employee Name: " + realEmployee.name);
            System.out.println("Position: " + realEmployee.position);
            System.out.println("Salary: Access Denied");
        }
    }
}
