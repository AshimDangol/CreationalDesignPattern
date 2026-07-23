package observer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ObserverTest {

    @Test
    void testStudentNotifier() {
        Observer observer = new StudentNotifier("Ram");
        assertDoesNotThrow(() -> observer.update("Test message"));
    }

    @Test
    void testParentNotifier() {
        Observer observer = new ParentNotifier("Hari");
        assertDoesNotThrow(() -> observer.update("Test message"));
    }

    @Test
    void testDepartmentNotifier() {
        Observer observer = new DepartmentNotifier("BCA");
        assertDoesNotThrow(() -> observer.update("Test message"));
    }

    @Test
    void testPublisherNotifiesAllObservers() {
        ResultPublisher publisher = new ResultPublisher();
        StringBuilder log = new StringBuilder();
        publisher.addObserver(new StudentNotifier("Ram"));
        publisher.addObserver(new ParentNotifier("Hari"));
        publisher.addObserver(new DepartmentNotifier("BCA"));
        assertDoesNotThrow(() -> publisher.publishResults("Ram"));
    }

    @Test
    void testRemoveObserver() {
        ResultPublisher publisher = new ResultPublisher();
        Observer student = new StudentNotifier("Ram");
        publisher.addObserver(student);
        publisher.removeObserver(student);
        assertDoesNotThrow(() -> publisher.publishResults("Ram"));
    }

    @Test
    void testObserverImplementsObserver() {
        assertTrue(new StudentNotifier("Ram") instanceof Observer);
        assertTrue(new ParentNotifier("Hari") instanceof Observer);
        assertTrue(new DepartmentNotifier("BCA") instanceof Observer);
    }

    @Test
    void testPublisherImplementsSubject() {
        assertTrue(new ResultPublisher() instanceof ResultSubject);
    }
}
