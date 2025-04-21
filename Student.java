package Builder;

public class Student {
    private String name;
    private int rollNo;
    private String email;
    private String phone;
    private String address;

    public Student(StudentBuilder builder) {
        this.name = builder.getName();
        this.rollNo = builder.getRollNo();
        this.email = builder.getEmail();
        this.phone = builder.getPhone();
        this.address = builder.getAddress();
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Email: " + (email != null ? email : "N/A"));
        System.out.println("Phone: " + (phone != null ? phone : "N/A"));
        System.out.println("Address: " + (address != null ? address : "N/A"));
    }
}