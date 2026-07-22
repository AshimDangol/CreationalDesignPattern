package factory;

// Concrete product — sends notification via SMS
// One of several Notification implementations created by NotificationFactory
public class SmsNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
