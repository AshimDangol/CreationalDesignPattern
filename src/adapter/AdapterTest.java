package adapter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// JUnit 5 tests to verify Adapter pattern behavior
class AdapterTest {

    @Test
    // Verify the adapter object is created successfully
    void testAdapterObjectCreated() {
        LegacyEmailService oldService = new LegacyEmailService();
        Notification adapter = new EmailAdapter(oldService);
        assertNotNull(adapter);
    }

    @Test
    // Verify sendNotification() delegates to sendMail() without throwing exceptions
    void testAdapterDelegatesCorrectly() {
        LegacyEmailService oldService = new LegacyEmailService();
        EmailAdapter adapter = new EmailAdapter(oldService);
        assertDoesNotThrow(() -> adapter.sendNotification("Test message"));
    }

    @Test
    // Verify the adapter implements the Notification interface
    void testAdapterImplementsNotification() {
        LegacyEmailService oldService = new LegacyEmailService();
        Notification adapter = new EmailAdapter(oldService);
        assertTrue(adapter instanceof Notification);
    }

    @Test
    // Verify the adapter object is not null
    void testAdapterNotNull() {
        LegacyEmailService oldService = new LegacyEmailService();
        EmailAdapter adapter = new EmailAdapter(oldService);
        assertNotNull(adapter);
    }
}
