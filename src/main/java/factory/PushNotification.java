package factory;

// Concrete product — sends notification via push notification
// One of several Notification implementations created by NotificationFactory
public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending push notification: " + message);
    }
}
