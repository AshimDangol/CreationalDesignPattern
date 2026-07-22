package services;

import adapter.EmailAdapter;
import adapter.LegacyEmailService;
import adapter.Notification;
import decorator.PdfDecorator;
import decorator.SignatureDecorator;
import decorator.StudentReport;
import decorator.WatermarkDecorator;
import decorator.BasicStudentReport;
import facade.StudentRegistrationFacade;
import proxy.StudentRecord;
import proxy.StudentRecordProxy;

// Facade for the Student Services Module — integrates Adapter, Facade, Proxy, and Decorator
// Provides a unified interface for student registration, record access, and report generation
public class StudentServicesFacade {
    private StudentRegistrationFacade registrationFacade;
    private LegacyEmailService legacyEmailService;

    public StudentServicesFacade() {
        this.registrationFacade = new StudentRegistrationFacade();
        this.legacyEmailService = new LegacyEmailService();
    }

    // Register student using Facade pattern, send welcome via Adapter
    public void registerStudent(String name, String email) {
        registrationFacade.registerStudent(name, email);
        Notification notif = new EmailAdapter(legacyEmailService);
        notif.sendNotification("Welcome " + name + " to PCPS College");
    }

    // Access student records using Proxy pattern
    public void viewStudentMarks(String studentName, String role) {
        StudentRecord proxy = new StudentRecordProxy(studentName, role);
        proxy.viewMarks();
    }

    // Generate student report using Decorator pattern
    public void generateStudentReport(String studentName, int studentId) {
        StudentReport report = new SignatureDecorator(
                new WatermarkDecorator(
                        new PdfDecorator(
                                new BasicStudentReport(studentName, studentId)
                        )
                )
        );
        report.generate();
    }
}
