package factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

// JUnit 5 tests to verify Factory pattern behavior
class NotificationFactoryTest {

    @Test
    void testEmailNotification() {
        Notification notification = NotificationFactory.createNotification("EMAIL");
        assertTrue(notification instanceof EmailNotification);
    }

    @Test
    void testSmsNotification() {
        Notification notification = NotificationFactory.createNotification("SMS");
        assertTrue(notification instanceof SmsNotification);
    }

    @Test
    void testPushNotification() {
        Notification notification = NotificationFactory.createNotification("PUSH");
        assertTrue(notification instanceof PushNotification);
    }

    @Test
    void testNotificationNotNull() {
        Notification notification = NotificationFactory.createNotification("EMAIL");
        assertNotNull(notification);
    }

    @Test
    void testInvalidTypeThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> NotificationFactory.createNotification("FAX"));
    }
}
