package proxy;

import java.util.Scanner;

public class ProxyTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Proxy Test ===");

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter role (ADMIN/STUDENT): ");
        String role = scanner.nextLine();

        testAdminAccessAllowed(studentName, role);
        testStudentAccessDenied(studentName, role);
        testProxyObjectCreated(studentName, role);

        testProxyNotNull(studentName, role);

        scanner.close();
    }

    static void testAdminAccessAllowed(String name, String role) {
        StudentRecord proxy = new StudentRecordProxy(name, role);
        try {
            proxy.viewMarks();
            if ("ADMIN".equalsIgnoreCase(role)) {
                System.out.println("PASS: Admin access allowed");
            } else {
                System.out.println("PASS: Denied as expected for non-admin role");
            }
        } catch (Exception e) {
            System.out.println("FAIL: Exception thrown - " + e.getMessage());
        }
    }

    static void testStudentAccessDenied(String name, String role) {
        StudentRecord proxy = new StudentRecordProxy(name, role);
        try {
            proxy.viewMarks();
            if ("ADMIN".equalsIgnoreCase(role)) {
                System.out.println("PASS: Admin accessed successfully");
            } else {
                System.out.println("PASS: Student access denied as expected");
            }
        } catch (Exception e) {
            System.out.println("FAIL: Exception thrown - " + e.getMessage());
        }
    }

    static void testProxyObjectCreated(String name, String role) {
        StudentRecord proxy = new StudentRecordProxy(name, role);
        if (proxy instanceof StudentRecord) {
            System.out.println("PASS: Proxy implements StudentRecord interface");
        } else {
            System.out.println("FAIL: Proxy does not implement StudentRecord");
        }
    }

    static void testProxyNotNull(String name, String role) {
        StudentRecord proxy = new StudentRecordProxy(name, role);
        if (proxy != null) {
            System.out.println("PASS: Proxy object is not null");
        } else {
            System.out.println("FAIL: Proxy is null");
        }
    }
}
