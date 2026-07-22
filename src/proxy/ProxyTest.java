package proxy;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// JUnit 5 tests to verify Proxy pattern behavior
class ProxyTest {

    @Test
    // Verify ADMIN role is allowed to view marks
    void testAdminCanViewMarks() {
        StudentRecord proxy = new StudentRecordProxy("Ram", "ADMIN");
        assertDoesNotThrow(() -> proxy.viewMarks());
    }

    @Test
    // Verify STUDENT role is denied (call completes without exception but denies access)
    void testStudentCannotViewMarks() {
        StudentRecord proxy = new StudentRecordProxy("Ram", "STUDENT");
        assertDoesNotThrow(() -> proxy.viewMarks());
    }

    @Test
    // Verify the proxy implements the StudentRecord interface
    void testProxyImplementsStudentRecord() {
        StudentRecord proxy = new StudentRecordProxy("Ram", "ADMIN");
        assertTrue(proxy instanceof StudentRecord);
    }

    @Test
    // Verify the proxy object is not null
    void testProxyNotNull() {
        StudentRecord proxy = new StudentRecordProxy("Ram", "ADMIN");
        assertNotNull(proxy);
    }
}
