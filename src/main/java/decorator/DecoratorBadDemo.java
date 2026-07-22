package decorator;

// Bad design: to add PDF, watermark, or signature, you must modify BasicStudentReport
// Each new feature requires editing the class — violates Open/Closed Principle
public class DecoratorBadDemo {
    public static void main(String[] args) {
        BasicStudentReport report = new BasicStudentReport("Ram", 101);
        report.generate();
        System.out.println("--- To add PDF, watermark, or signature, we must edit BasicStudentReport ---");
    }
}
