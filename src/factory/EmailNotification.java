package factory;

// Concrete product — sends notification via email
// One of several Notification implementations created by NotificationFactory
public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}
