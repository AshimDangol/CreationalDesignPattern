package proxy;

// Subject interface — defines the common contract for both the real object and the proxy
// Client code depends on this interface, not on concrete implementations
public interface StudentRecord {
    void viewMarks();
}
