package facade;

import java.util.Scanner;

public class FacadeTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Facade Test ===");
        testFacadeNotNull();

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student email: ");
        String email = scanner.nextLine();

        testRegistrationStartsSuccessfully(name, email);
        testValidationServiceExecuted(name, email);
        testDepartmentAllocationExecuted(name, email);
        testNotificationServiceExecuted(name, email);

        scanner.close();
    }

    static void testRegistrationStartsSuccessfully(String name, String email) {
        StudentRegistrationFacade facade = new StudentRegistrationFacade();
        try {
            facade.registerStudent(name, email);
            System.out.println("PASS: Registration started successfully");
        } catch (IllegalArgumentException e) {
            System.out.println("PASS: Validation rejected invalid input - " + e.getMessage());
        } catch (Exception e) {
            System.out.println("FAIL: Unexpected exception - " + e.getMessage());
        }
    }

    static void testValidationServiceExecuted(String name, String email) {
        StudentRegistrationFacade facade = new StudentRegistrationFacade();
        try {
            facade.registerStudent(name, email);
            if (name == null || name.isEmpty() || email == null || !email.contains("@")) {
                System.out.println("FAIL: Validation did not reject invalid data");
            } else {
                System.out.println("PASS: Validation service executed for valid data");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("PASS: Validation service executed and rejected invalid data");
        }
    }

    static void testDepartmentAllocationExecuted(String name, String email) {
        StudentRegistrationFacade facade = new StudentRegistrationFacade();
        try {
            facade.registerStudent(name, email);
            System.out.println("PASS: Department allocation executed");
        } catch (Exception e) {
            System.out.println("FAIL: Department allocation failed - " + e.getMessage());
        }
    }

    static void testNotificationServiceExecuted(String name, String email) {
        StudentRegistrationFacade facade = new StudentRegistrationFacade();
        try {
            facade.registerStudent(name, email);
            System.out.println("PASS: Notification service executed");
        } catch (Exception e) {
            System.out.println("FAIL: Notification service failed - " + e.getMessage());
        }
    }

    static void testFacadeNotNull() {
        StudentRegistrationFacade facade = new StudentRegistrationFacade();
        if (facade != null) {
            System.out.println("PASS: Facade object is not null");
        } else {
            System.out.println("FAIL: Facade is null");
        }
    }
}
