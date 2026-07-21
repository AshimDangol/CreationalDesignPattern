package factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

// JUnit 5 tests to verify Factory pattern behavior
class NotificationFactoryTest {

    @Test
    // Verify factory returns EmailNotification for "EMAIL"
    void testEmailNotification() {
        Notification notification = NotificationFactory.createNotification("EMAIL");
        assertTrue(notification instanceof EmailNotification);
    }

    @Test
    // Verify factory returns SmsNotification for "SMS"
    void testSmsNotification() {
        Notification notification = NotificationFactory.createNotification("SMS");
        assertTrue(notification instanceof SmsNotification);
    }

    @Test
    // Verify factory returns PushNotification for "PUSH"
    void testPushNotification() {
        Notification notification = NotificationFactory.createNotification("PUSH");
        assertTrue(notification instanceof PushNotification);
    }

    @Test
    // Verify factory never returns null for valid types
    void testNotificationNotNull() {
        Notification notification = NotificationFactory.createNotification("EMAIL");
        assertNotNull(notification);
    }

    @Test
    // Verify factory throws exception for unknown types
    void testInvalidTypeThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> NotificationFactory.createNotification("FAX"));
    }
}
