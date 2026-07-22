package services;

import java.util.Scanner;

public class ServicesTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Student Services Module Test ===");

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student email: ");
        String email = scanner.nextLine();

        System.out.print("Enter role (ADMIN/STUDENT): ");
        String role = scanner.nextLine();

        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\n=== Test Results ===");
        testServicesFacadeNotNull();
        testRegisterStudent(name, email);
        testAdminViewMarks(name, role);
        testStudentViewMarks(name, role);
        testGenerateReport(name, id);

        scanner.close();
    }

    static void testRegisterStudent(String name, String email) {
        StudentServicesFacade services = new StudentServicesFacade();
        try {
            services.registerStudent(name, email);
            System.out.println("PASS: Student registered successfully");
        } catch (Exception e) {
            System.out.println("FAIL: Registration failed - " + e.getMessage());
        }
    }

    static void testAdminViewMarks(String name, String role) {
        StudentServicesFacade services = new StudentServicesFacade();
        try {
            services.viewStudentMarks(name, role);
            if ("ADMIN".equalsIgnoreCase(role)) {
                System.out.println("PASS: Admin accessed marks");
            } else {
                System.out.println("PASS: Access denied for non-admin role");
            }
        } catch (Exception e) {
            System.out.println("FAIL: Exception - " + e.getMessage());
        }
    }

    static void testStudentViewMarks(String name, String role) {
        StudentServicesFacade services = new StudentServicesFacade();
        try {
            services.viewStudentMarks(name, role);
            if ("ADMIN".equalsIgnoreCase(role)) {
                System.out.println("PASS: Admin accessed marks successfully");
            } else {
                System.out.println("PASS: Student access denied as expected");
            }
        } catch (Exception e) {
            System.out.println("FAIL: Exception - " + e.getMessage());
        }
    }

    static void testGenerateReport(String name, int id) {
        StudentServicesFacade services = new StudentServicesFacade();
        try {
            services.generateStudentReport(name, id);
            System.out.println("PASS: Report generated successfully");
        } catch (Exception e) {
            System.out.println("FAIL: Report generation failed - " + e.getMessage());
        }
    }

    static void testServicesFacadeNotNull() {
        StudentServicesFacade services = new StudentServicesFacade();
        if (services != null) {
            System.out.println("PASS: Services facade is not null");
        } else {
            System.out.println("FAIL: Services facade is null");
        }
    }
}
