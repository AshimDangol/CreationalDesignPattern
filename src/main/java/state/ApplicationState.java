package state;

public interface ApplicationState {
    void handle();
    String getStateName();
}
