package services;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// JUnit 5 tests to verify the Student Services Module integration
class ServicesTest {

    @Test
    void testRegisterStudent() {
        StudentServicesFacade services = new StudentServicesFacade();
        assertDoesNotThrow(() -> services.registerStudent("Ram", "ram@gmail.com"));
    }

    @Test
    void testAdminViewMarks() {
        StudentServicesFacade services = new StudentServicesFacade();
        assertDoesNotThrow(() -> services.viewStudentMarks("Ram", "ADMIN"));
    }

    @Test
    void testStudentViewMarks() {
        StudentServicesFacade services = new StudentServicesFacade();
        assertDoesNotThrow(() -> services.viewStudentMarks("Ram", "STUDENT"));
    }

    @Test
    void testGenerateReport() {
        StudentServicesFacade services = new StudentServicesFacade();
        assertDoesNotThrow(() -> services.generateStudentReport("Ram", 101));
    }

    @Test
    void testServicesFacadeNotNull() {
        StudentServicesFacade services = new StudentServicesFacade();
        assertNotNull(services);
    }
}
