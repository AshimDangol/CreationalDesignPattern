package command;

// Command pattern: encapsulates a request as an object
// Allows parameterization, queuing, logging, and undo of operations
public interface ServiceRequest {
    void execute();
}
