package decorator.demo;

import decorator.BasicStudentReport;
import decorator.PdfDecorator;
import decorator.SignatureDecorator;
import decorator.StudentReport;
import decorator.WatermarkDecorator;

// Demo showing the Decorator fix: features are added at runtime by wrapping objects
// Each decorator adds a new capability without modifying existing classes
public class DecoratorDemo {
    public static void main(String[] args) {
        // Basic report with PDF export
        StudentReport pdfReport = new PdfDecorator(
                new BasicStudentReport("Ram", 101)
        );
        System.out.println("=== Report with PDF ===");
        pdfReport.generate();

        System.out.println();

        // Report with PDF and watermark
        StudentReport watermarkedPdf = new WatermarkDecorator(
                new PdfDecorator(
                        new BasicStudentReport("Ram", 101)
                )
        );
        System.out.println("=== Report with PDF & Watermark ===");
        watermarkedPdf.generate();

        System.out.println();

        // Full report with PDF, watermark, and signature
        StudentReport fullReport = new SignatureDecorator(
                new WatermarkDecorator(
                        new PdfDecorator(
                                new BasicStudentReport("Ram", 101)
                        )
                )
        );
        System.out.println("=== Full Report with PDF, Watermark & Signature ===");
        fullReport.generate();
    }
}
