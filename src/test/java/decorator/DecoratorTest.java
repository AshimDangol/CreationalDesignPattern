package decorator;

import java.util.Scanner;

public class DecoratorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Decorator Test ===");

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\n--- Testing Basic Report ---");
        testBasicReportGeneration(name, id);

        System.out.println("\n--- Testing PDF Feature ---");
        testPdfFeatureWorks(name, id);

        System.out.println("\n--- Testing Watermark Feature ---");
        testWatermarkFeatureWorks(name, id);

        System.out.println("\n--- Testing Signature Feature ---");
        testSignatureFeatureWorks(name, id);

        System.out.println("\n--- Testing Decorated Report Not Null ---");
        testDecoratedReportNotNull(name, id);

        scanner.close();
    }

    static void testBasicReportGeneration(String name, int id) {
        StudentReport report = new BasicStudentReport(name, id);
        try {
            report.generate();
            System.out.println("PASS: Basic report generated successfully");
        } catch (Exception e) {
            System.out.println("FAIL: Exception - " + e.getMessage());
        }
    }

    static void testPdfFeatureWorks(String name, int id) {
        StudentReport report = new PdfDecorator(new BasicStudentReport(name, id));
        try {
            report.generate();
            System.out.println("PASS: PDF feature works");
        } catch (Exception e) {
            System.out.println("FAIL: Exception - " + e.getMessage());
        }
    }

    static void testWatermarkFeatureWorks(String name, int id) {
        StudentReport report = new WatermarkDecorator(new BasicStudentReport(name, id));
        try {
            report.generate();
            System.out.println("PASS: Watermark feature works");
        } catch (Exception e) {
            System.out.println("FAIL: Exception - " + e.getMessage());
        }
    }

    static void testSignatureFeatureWorks(String name, int id) {
        StudentReport report = new SignatureDecorator(new BasicStudentReport(name, id));
        try {
            report.generate();
            System.out.println("PASS: Signature feature works");
        } catch (Exception e) {
            System.out.println("FAIL: Exception - " + e.getMessage());
        }
    }

    static void testDecoratedReportNotNull(String name, int id) {
        StudentReport report = new PdfDecorator(new BasicStudentReport(name, id));
        if (report != null) {
            System.out.println("PASS: Decorated report is not null");
        } else {
            System.out.println("FAIL: Decorated report is null");
        }
    }
}
