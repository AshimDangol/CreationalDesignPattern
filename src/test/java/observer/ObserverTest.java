package observer;

import java.util.Scanner;

public class ObserverTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Observer Test ===");

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter parent name: ");
        String parentName = scanner.nextLine();

        System.out.print("Enter department: ");
        String department = scanner.nextLine();

        testStudentNotifier(studentName);
        testParentNotifier(parentName);
        testDepartmentNotifier(department);
        testPublisherNotifiesAllObservers(studentName, parentName, department);
        testRemoveObserver(studentName);
        testObserverImplementsObserver(studentName, parentName, department);
        testPublisherImplementsSubject();

        scanner.close();
    }

    static void testStudentNotifier(String name) {
        Observer observer = new StudentNotifier(name);
        try {
            observer.update("Test message");
            System.out.println("PASS: StudentNotifier update executed");
        } catch (Exception e) {
            System.out.println("FAIL: StudentNotifier threw exception - " + e.getMessage());
        }
    }

    static void testParentNotifier(String name) {
        Observer observer = new ParentNotifier(name);
        try {
            observer.update("Test message");
            System.out.println("PASS: ParentNotifier update executed");
        } catch (Exception e) {
            System.out.println("FAIL: ParentNotifier threw exception - " + e.getMessage());
        }
    }

    static void testDepartmentNotifier(String dept) {
        Observer observer = new DepartmentNotifier(dept);
        try {
            observer.update("Test message");
            System.out.println("PASS: DepartmentNotifier update executed");
        } catch (Exception e) {
            System.out.println("FAIL: DepartmentNotifier threw exception - " + e.getMessage());
        }
    }

    static void testPublisherNotifiesAllObservers(String student, String parent, String dept) {
        ResultPublisher publisher = new ResultPublisher();
        publisher.addObserver(new StudentNotifier(student));
        publisher.addObserver(new ParentNotifier(parent));
        publisher.addObserver(new DepartmentNotifier(dept));
        try {
            publisher.publishResults(student);
            System.out.println("PASS: Publisher notified all observers");
        } catch (Exception e) {
            System.out.println("FAIL: Publisher notification failed - " + e.getMessage());
        }
    }

    static void testRemoveObserver(String student) {
        ResultPublisher publisher = new ResultPublisher();
        Observer observer = new StudentNotifier(student);
        publisher.addObserver(observer);
        publisher.removeObserver(observer);
        try {
            publisher.publishResults(student);
            System.out.println("PASS: Observer removed without error");
        } catch (Exception e) {
            System.out.println("FAIL: Remove observer caused error - " + e.getMessage());
        }
    }

    static void testObserverImplementsObserver(String student, String parent, String dept) {
        if (new StudentNotifier(student) instanceof Observer
                && new ParentNotifier(parent) instanceof Observer
                && new DepartmentNotifier(dept) instanceof Observer) {
            System.out.println("PASS: All notifiers implement Observer interface");
        } else {
            System.out.println("FAIL: Some notifier does not implement Observer");
        }
    }

    static void testPublisherImplementsSubject() {
        if (new ResultPublisher() instanceof ResultSubject) {
            System.out.println("PASS: ResultPublisher implements ResultSubject");
        } else {
            System.out.println("FAIL: ResultPublisher does not implement ResultSubject");
        }
    }
}
