public class Employee {
    private String Fullname;
    private String email;
    private String WorkPosition;
    private int PhoneNumber;
    private int age;

    public Employee(String fullname, String email, String workPosition, int phoneNumber, int age) {
        Fullname = fullname;
        this.email = email;
        WorkPosition = workPosition;
        PhoneNumber = phoneNumber;
        this.age = age;
    }
}
