package factory;

// Bad design: violates Open/Closed Principle — adding a new type requires modifying this class
public class NotificationServiceBad {

    public void sendNotification(String type, String message) {
        if (type.equalsIgnoreCase("EMAIL")) {
            System.out.println("Sending email: " + message);
        } else if (type.equalsIgnoreCase("SMS")) {
            System.out.println("Sending SMS: " + message);
        } else if (type.equalsIgnoreCase("PUSH")) {
            System.out.println("Sending push notification: " + message);
        } else {
            throw new IllegalArgumentException("Invalid notification type");
        }
    }
}
