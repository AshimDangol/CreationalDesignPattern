package admission;

import builder.Student;
import java.util.Scanner;

public class AdmissionTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Enter Student Test Data ===");
        System.out.print("Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Department: ");
        String dept = scanner.nextLine();
        System.out.print("Semester: ");
        int sem = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Guardian Name: ");
        String guardian = scanner.nextLine();

        AdmissionService service = new AdmissionService();
        Student student = service.admitStudent(id, name, email, phone, dept, sem, address, guardian);

        System.out.println("\n=== Test Results ===");
        testNotNull(student);
        testStudentId(student, id);
        testStudentName(student, name);
        testDepartment(student, dept);
        testSemester(student, sem);

        scanner.close();
    }

    static void testNotNull(Student student) {
        if (student != null) {
            System.out.println("PASS: Student is not null");
        } else {
            System.out.println("FAIL: Student is null");
        }
    }

    static void testStudentId(Student student, int expected) {
        if (student.getStudentId() == expected) {
            System.out.println("PASS: Student ID is " + expected);
        } else {
            System.out.println("FAIL: Expected " + expected + " but got " + student.getStudentId());
        }
    }

    static void testStudentName(Student student, String expected) {
        if (expected.equals(student.getName())) {
            System.out.println("PASS: Student name is " + expected);
        } else {
            System.out.println("FAIL: Expected " + expected + " but got " + student.getName());
        }
    }

    static void testDepartment(Student student, String expected) {
        if (expected.equals(student.getDepartment())) {
            System.out.println("PASS: Department is " + expected);
        } else {
            System.out.println("FAIL: Expected " + expected + " but got " + student.getDepartment());
        }
    }

    static void testSemester(Student student, int expected) {
        if (student.getSemester() == expected) {
            System.out.println("PASS: Semester is " + expected);
        } else {
            System.out.println("FAIL: Expected " + expected + " but got " + student.getSemester());
        }
    }
}
