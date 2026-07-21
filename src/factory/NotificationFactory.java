package factory;

// Factory pattern: encapsulates object creation — adding a new type only requires a new class
public class NotificationFactory {
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
