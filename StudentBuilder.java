package Builder;

public class StudentBuilder {
    private String name;
    private int rollNo;

    private String email;
    private String phone;
    private String address;

    public StudentBuilder(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public StudentBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public StudentBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Student build() {
        return new Student(this);
    }

   
    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}
