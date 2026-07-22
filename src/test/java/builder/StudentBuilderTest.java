package builder;

import java.util.Scanner;

public class StudentBuilderTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== StudentBuilder Test ===");

        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();

        System.out.print("Enter department: ");
        String dept = scanner.nextLine();

        System.out.print("Enter semester: ");
        int sem = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        System.out.print("Enter guardian name: ");
        String guardian = scanner.nextLine();

        Student student = new Student.Builder()
                .studentId(id)
                .name(name)
                .email(email)
                .phoneNumber(phone)
                .department(dept)
                .semester(sem)
                .address(address)
                .guardianName(guardian)
                .build();

        System.out.println("\n=== Test Results ===");
        testStudentCreatedSuccessfully(student);
        testStudentId(student, id);
        testStudentName(student, name);
        testDepartment(student, dept);
        testSemester(student, sem);
        testEmail(student, email);
        testPhoneNumber(student, phone);
        testAddress(student, address);
        testGuardianName(student, guardian);

        scanner.close();
    }

    static void testStudentCreatedSuccessfully(Student student) {
        if (student != null) {
            System.out.println("PASS: Student created successfully");
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
            System.out.println("PASS: Name is " + expected);
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

    static void testEmail(Student student, String expected) {
        if (expected.equals(student.getEmail())) {
            System.out.println("PASS: Email is " + expected);
        } else {
            System.out.println("FAIL: Expected " + expected + " but got " + student.getEmail());
        }
    }

    static void testPhoneNumber(Student student, String expected) {
        if (expected.equals(student.getPhoneNumber())) {
            System.out.println("PASS: Phone is " + expected);
        } else {
            System.out.println("FAIL: Expected " + expected + " but got " + student.getPhoneNumber());
        }
    }

    static void testAddress(Student student, String expected) {
        if (expected.equals(student.getAddress())) {
            System.out.println("PASS: Address is " + expected);
        } else {
            System.out.println("FAIL: Expected " + expected + " but got " + student.getAddress());
        }
    }

    static void testGuardianName(Student student, String expected) {
        if (expected.equals(student.getGuardianName())) {
            System.out.println("PASS: Guardian is " + expected);
        } else {
            System.out.println("FAIL: Expected " + expected + " but got " + student.getGuardianName());
        }
    }
}
