package factory;

// Factory pattern: encapsulates object creation — adding a new type only requires a new class
// Client code depends on the Notification interface, not on concrete classes
public class NotificationFactory {
    // Static factory method — returns the appropriate Notification based on type
    public static Notification createNotification(String type) {
        if (type.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification();
        } else if (type.equalsIgnoreCase("SMS")) {
            return new SmsNotification();
        } else if (type.equalsIgnoreCase("PUSH")) {
            return new PushNotification();
        } else {
            throw new IllegalArgumentException("Invalid notification type: " + type);
        }
    }
}
