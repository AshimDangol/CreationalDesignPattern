package builder.demo;

import builder.Student;

// Demo showing the Builder fix: fluent API makes object creation clear and flexible
// Each setter reveals what value it sets — self-documenting code
public class BuilderDemo {
    public static void main(String[] args) {
        // Fluent method chaining with named setter methods for readability
        Student student = new Student.Builder()
                .studentId(101)
                .name("Ram")
                .email("ram@gmail.com")
                .phoneNumber("9800000000")
                .department("BCA")
                .semester(5)
                .address("Kathmandu")
                .guardianName("Hari")
                .build();

        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Name: " + student.getName());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Phone: " + student.getPhoneNumber());
        System.out.println("Department: " + student.getDepartment());
        System.out.println("Semester: " + student.getSemester());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Guardian: " + student.getGuardianName());
    }
}
