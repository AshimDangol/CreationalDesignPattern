package factory;

// Concrete product — sends notification via push notification
public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending push notification: " + message);
    }
}
