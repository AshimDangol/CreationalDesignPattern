package academic.demo;

import academic.AcademicManagementSystem;

// Demo showing the Academic Management System — integrates all 4 behavioral patterns
// Demonstrates State (lifecycle), Strategy (fees), Observer (results), and Command (requests)
public class AcademicDemo {
    public static void main(String[] args) {
        AcademicManagementSystem system = new AcademicManagementSystem();

        System.out.println("========== STUDENT ACADEMIC MANAGEMENT SYSTEM ==========\n");

        system.processApplication();
        system.payFees("KHALTI", 25000);
        system.payFees("ESEWA", 15000);
        system.payFees("BANK", 50000);
        system.publishResults("Ram", "Hari", "BCA");
        system.requestService("Ram");
    }
}
