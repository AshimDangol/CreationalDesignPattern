package state;

import java.util.Scanner;

public class StateTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== State Test ===");
        testInitialStateIsSubmitted();
        testTransitionToVerified();
        testTransitionToApproved();
        testTransitionToEnrolled();

        System.out.print("Enter 1 to test rejection (or 0 to skip): ");
        int rejectChoice = scanner.nextInt();
        scanner.nextLine();
        if (rejectChoice == 1) {
            testRejectedState();
        }

        System.out.print("Enter 1 to test full lifecycle (or 0 to skip): ");
        int lifecycleChoice = scanner.nextInt();
        scanner.nextLine();
        if (lifecycleChoice == 1) {
            testFullLifecycle();
        }

        testStateImplementsApplicationState();

        scanner.close();
    }

    static void testInitialStateIsSubmitted() {
        ApplicationContext app = new ApplicationContext();
        if ("Submitted".equals(app.getCurrentState())) {
            System.out.println("PASS: Initial state is Submitted");
        } else {
            System.out.println("FAIL: Expected Submitted but got " + app.getCurrentState());
        }
    }

    static void testTransitionToVerified() {
        ApplicationContext app = new ApplicationContext();
        app.next();
        if ("Verified".equals(app.getCurrentState())) {
            System.out.println("PASS: Transitioned to Verified");
        } else {
            System.out.println("FAIL: Expected Verified but got " + app.getCurrentState());
        }
    }

    static void testTransitionToApproved() {
        ApplicationContext app = new ApplicationContext();
        app.next();
        app.next();
        if ("Approved".equals(app.getCurrentState())) {
            System.out.println("PASS: Transitioned to Approved");
        } else {
            System.out.println("FAIL: Expected Approved but got " + app.getCurrentState());
        }
    }

    static void testTransitionToEnrolled() {
        ApplicationContext app = new ApplicationContext();
        app.next();
        app.next();
        app.next();
        if ("Enrolled".equals(app.getCurrentState())) {
            System.out.println("PASS: Transitioned to Enrolled");
        } else {
            System.out.println("FAIL: Expected Enrolled but got " + app.getCurrentState());
        }
    }

    static void testRejectedState() {
        ApplicationContext app = new ApplicationContext();
        app.reject();
        if ("Rejected".equals(app.getCurrentState())) {
            System.out.println("PASS: Application rejected successfully");
        } else {
            System.out.println("FAIL: Expected Rejected but got " + app.getCurrentState());
        }
    }

    static void testFullLifecycle() {
        ApplicationContext app = new ApplicationContext();
        app.next();
        app.next();
        app.next();
        if ("Enrolled".equals(app.getCurrentState())) {
            System.out.println("PASS: Full lifecycle completed successfully");
        } else {
            System.out.println("FAIL: Expected Enrolled but got " + app.getCurrentState());
        }
    }

    static void testStateImplementsApplicationState() {
        ApplicationContext app = new ApplicationContext();
        if (app.getSubmittedState() instanceof ApplicationState
                && app.getVerifiedState() instanceof ApplicationState
                && app.getApprovedState() instanceof ApplicationState
                && app.getEnrolledState() instanceof ApplicationState
                && app.getRejectedState() instanceof ApplicationState) {
            System.out.println("PASS: All states implement ApplicationState interface");
        } else {
            System.out.println("FAIL: Some state does not implement ApplicationState");
        }
    }
}
