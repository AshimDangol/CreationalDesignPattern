package state;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StateTest {

    @Test
    void testInitialStateIsSubmitted() {
        ApplicationContext app = new ApplicationContext();
        assertEquals("Submitted", app.getCurrentState());
    }

    @Test
    void testTransitionToVerified() {
        ApplicationContext app = new ApplicationContext();
        app.next();
        assertEquals("Verified", app.getCurrentState());
    }

    @Test
    void testTransitionToApproved() {
        ApplicationContext app = new ApplicationContext();
        app.next();
        app.next();
        assertEquals("Approved", app.getCurrentState());
    }

    @Test
    void testTransitionToEnrolled() {
        ApplicationContext app = new ApplicationContext();
        app.next();
        app.next();
        app.next();
        assertEquals("Enrolled", app.getCurrentState());
    }

    @Test
    void testRejectedState() {
        ApplicationContext app = new ApplicationContext();
        app.reject();
        assertEquals("Rejected", app.getCurrentState());
    }

    @Test
    void testFullLifecycle() {
        ApplicationContext app = new ApplicationContext();
        app.next();
        app.next();
        app.next();
        assertEquals("Enrolled", app.getCurrentState());
    }

    @Test
    void testStateImplementsApplicationState() {
        ApplicationContext app = new ApplicationContext();
        assertTrue(app.getSubmittedState() instanceof ApplicationState);
        assertTrue(app.getVerifiedState() instanceof ApplicationState);
        assertTrue(app.getApprovedState() instanceof ApplicationState);
        assertTrue(app.getEnrolledState() instanceof ApplicationState);
        assertTrue(app.getRejectedState() instanceof ApplicationState);
    }
}
