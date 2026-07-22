package adapter;

// Target interface — defines the contract expected by the new notification system
// The Adapter pattern makes incompatible interfaces work together
public interface Notification {
    void sendNotification(String message);
}
