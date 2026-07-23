package observer;

// Observer pattern: defines the interface for objects that observe events
// Each observer receives notifications when the subject's state changes
public interface Observer {
    void update(String message);
}
