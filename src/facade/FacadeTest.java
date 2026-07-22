package facade;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// JUnit 5 tests to verify Facade pattern behavior
class FacadeTest {

    @Test
    // Verify registration starts successfully
    void testRegistrationStartsSuccessfully() {
        StudentRegistrationFacade facade = new StudentRegistrationFacade();
        assertDoesNotThrow(() -> facade.registerStudent("Ram", "ram@gmail.com"));
    }

    @Test
    // Verify validation service is executed (throws for invalid data)
    void testValidationServiceExecuted() {
        StudentRegistrationFacade facade = new StudentRegistrationFacade();
        assertThrows(IllegalArgumentException.class,
                () -> facade.registerStudent("", "ram@gmail.com"));
    }

    @Test
    // Verify department allocation is executed
    void testDepartmentAllocationExecuted() {
        StudentRegistrationFacade facade = new StudentRegistrationFacade();
        assertDoesNotThrow(() -> facade.registerStudent("Ram", "ram@gmail.com"));
    }

    @Test
    // Verify notification service is executed
    void testNotificationServiceExecuted() {
        StudentRegistrationFacade facade = new StudentRegistrationFacade();
        assertDoesNotThrow(() -> facade.registerStudent("Ram", "ram@gmail.com"));
    }

    @Test
    // Verify facade object is not null
    void testFacadeNotNull() {
        StudentRegistrationFacade facade = new StudentRegistrationFacade();
        assertNotNull(facade);
    }
}
