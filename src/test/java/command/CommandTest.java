package command;

import java.util.Scanner;

public class CommandTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Command Test ===");

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        testTranscriptRequest(studentName);
        testIdCardRequest(studentName);
        testCertificateRequest(studentName);
        testLibraryCardRequest(studentName);
        testInvokerProcessesRequests(studentName);
        testRequestImplementsServiceRequest(studentName);

        scanner.close();
    }

    static void testTranscriptRequest(String name) {
        ServiceRequest request = new TranscriptRequest(name);
        try {
            request.execute();
            System.out.println("PASS: Transcript request executed");
        } catch (Exception e) {
            System.out.println("FAIL: Transcript request threw exception - " + e.getMessage());
        }
    }

    static void testIdCardRequest(String name) {
        ServiceRequest request = new IdCardRequest(name);
        try {
            request.execute();
            System.out.println("PASS: ID card request executed");
        } catch (Exception e) {
            System.out.println("FAIL: ID card request threw exception - " + e.getMessage());
        }
    }

    static void testCertificateRequest(String name) {
        ServiceRequest request = new CertificateRequest(name);
        try {
            request.execute();
            System.out.println("PASS: Certificate request executed");
        } catch (Exception e) {
            System.out.println("FAIL: Certificate request threw exception - " + e.getMessage());
        }
    }

    static void testLibraryCardRequest(String name) {
        ServiceRequest request = new LibraryCardRequest(name);
        try {
            request.execute();
            System.out.println("PASS: Library card request executed");
        } catch (Exception e) {
            System.out.println("FAIL: Library card request threw exception - " + e.getMessage());
        }
    }

    static void testInvokerProcessesRequests(String name) {
        ServiceRequestInvoker invoker = new ServiceRequestInvoker();
        try {
            invoker.submitRequest(new TranscriptRequest(name));
            invoker.submitRequest(new IdCardRequest(name));
            invoker.showHistory();
            System.out.println("PASS: Invoker processed requests successfully");
        } catch (Exception e) {
            System.out.println("FAIL: Invoker failed - " + e.getMessage());
        }
    }

    static void testRequestImplementsServiceRequest(String name) {
        if (new TranscriptRequest(name) instanceof ServiceRequest
                && new IdCardRequest(name) instanceof ServiceRequest
                && new CertificateRequest(name) instanceof ServiceRequest
                && new LibraryCardRequest(name) instanceof ServiceRequest) {
            System.out.println("PASS: All requests implement ServiceRequest interface");
        } else {
            System.out.println("FAIL: Some request does not implement ServiceRequest");
        }
    }
}
