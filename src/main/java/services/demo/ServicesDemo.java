package services.demo;

import services.StudentServicesFacade;

// Demo for the Student Services Module — integrates all 4 structural design patterns
public class ServicesDemo {
    public static void main(String[] args) {
        StudentServicesFacade services = new StudentServicesFacade();

        System.out.println("=== 1. Student Registration (Facade + Adapter) ===");
        services.registerStudent("Ram", "ram@gmail.com");

        System.out.println("\n=== 2. Admin Viewing Marks (Proxy) ===");
        services.viewStudentMarks("Ram", "ADMIN");

        System.out.println("\n=== 3. Student Viewing Marks (Proxy - Denied) ===");
        services.viewStudentMarks("Ram", "STUDENT");

        System.out.println("\n=== 4. Generate Student Report (Decorator) ===");
        services.generateStudentReport("Ram", 101);
    }
}
