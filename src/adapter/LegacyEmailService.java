package adapter;

// Adaptee — existing third-party service with an incompatible interface
// Cannot be modified, so the Adapter pattern wraps it to match Notification
public class LegacyEmailService {
    public void sendMail(String text) {
        System.out.println("Sending email: " + text);
    }
}
