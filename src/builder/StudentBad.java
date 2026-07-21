package builder;

// Bad design: telescoping constructor with 8 parameters — hard to read and easy to swap arguments
// Compare with Student.java which uses the Builder pattern for readable object creation
public class StudentBad {

    private int studentId;
    private String name;
    private String email;
    private String phoneNumber;
    private String department;
    private int semester;
    private String address;
    private String guardianName;

    // Single constructor with all fields — error-prone, no way to set fields selectively
    public StudentBad(
            int studentId,
            String name,
            String email,
            String phoneNumber,
            String department,
            int semester,
            String address,
            String guardianName
    ) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.semester = semester;
        this.address = address;
        this.guardianName = guardianName;
    }
}
