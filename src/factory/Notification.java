package factory;

// Product interface — defines the common contract for all notification types
// Each concrete implementation must provide its own send() behavior
public interface Notification {
    void send(String message);
}
