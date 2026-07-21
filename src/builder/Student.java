package builder;

// Builder pattern: constructs a complex object step by step with readable method chaining
// All fields are final — the object is fully initialized once built
public class Student {
    private final int studentId;
    private final String name;
    private final String email;
    private final String phoneNumber;
    private final String department;
    private final int semester;
    private final String address;
    private final String guardianName;

    // Private constructor — only the Builder can create Student instances
    private Student(Builder builder) {
        this.studentId = builder.studentId;
        this.name = builder.name;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.department = builder.department;
        this.semester = builder.semester;
        this.address = builder.address;
        this.guardianName = builder.guardianName;
    }

    public int getStudentId() { return studentId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getDepartment() { return department; }
    public int getSemester() { return semester; }
    public String getAddress() { return address; }
    public String getGuardianName() { return guardianName; }

    // Inner static Builder class — each setter returns 'this' for fluent chaining
    public static class Builder {
        private int studentId;
        private String name;
        private String email;
        private String phoneNumber;
        private String department;
        private int semester;
        private String address;
        private String guardianName;

        public Builder studentId(int studentId) { this.studentId = studentId; return this; }
        public Builder name(String name) { this.name = name; return this; }
        public Builder email(String email) { this.email = email; return this; }
        public Builder phoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; return this; }
        public Builder department(String department) { this.department = department; return this; }
        public Builder semester(int semester) { this.semester = semester; return this; }
        public Builder address(String address) { this.address = address; return this; }
        public Builder guardianName(String guardianName) { this.guardianName = guardianName; return this; }

        // Terminal method — constructs the immutable Student object
        public Student build() {
            return new Student(this);
        }
    }
}
