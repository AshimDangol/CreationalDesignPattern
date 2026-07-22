package decorator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// JUnit 5 tests to verify Decorator pattern behavior
class DecoratorTest {

    @Test
    // Verify basic report generation
    void testBasicReportGeneration() {
        StudentReport report = new BasicStudentReport("Ram", 101);
        assertDoesNotThrow(() -> report.generate());
    }

    @Test
    // Verify PDF feature works when decorated
    void testPdfFeatureWorks() {
        StudentReport report = new PdfDecorator(
                new BasicStudentReport("Ram", 101)
        );
        assertDoesNotThrow(() -> report.generate());
    }

    @Test
    // Verify Watermark feature works when decorated
    void testWatermarkFeatureWorks() {
        StudentReport report = new WatermarkDecorator(
                new BasicStudentReport("Ram", 101)
        );
        assertDoesNotThrow(() -> report.generate());
    }

    @Test
    // Verify Signature feature works when decorated
    void testSignatureFeatureWorks() {
        StudentReport report = new SignatureDecorator(
                new BasicStudentReport("Ram", 101)
        );
        assertDoesNotThrow(() -> report.generate());
    }

    @Test
    // Verify decorated report is not null
    void testDecoratedReportNotNull() {
        StudentReport report = new PdfDecorator(
                new BasicStudentReport("Ram", 101)
        );
        assertNotNull(report);
    }
}
