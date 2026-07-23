package state;

// State pattern: defines the interface for each state in the application lifecycle
// Each concrete state encapsulates behavior specific to that stage
public interface ApplicationState {
    void handle();
    String getStateName();
}
