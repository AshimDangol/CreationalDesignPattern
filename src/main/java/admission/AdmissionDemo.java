package admission;

import builder.Student;

// Demo for the admission flow — integrates Singleton, Builder, and Factory patterns
public class AdmissionDemo {
    public static void main(String[] args) {
        AdmissionService service = new AdmissionService();

        // Admit a student — internally uses Singleton, Builder, and Factory
        Student student = service.admitStudent(
                101,
                "Ram",
                "ram@gmail.com",
                "9800000000",
                "BCA",
                5,
                "Kathmandu",
                "Hari"
        );

        System.out.println("\n--- Admitted Student ---");
        System.out.println("ID: " + student.getStudentId());
        System.out.println("Name: " + student.getName());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Phone: " + student.getPhoneNumber());
        System.out.println("Department: " + student.getDepartment());
        System.out.println("Semester: " + student.getSemester());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Guardian: " + student.getGuardianName());
    }
}
