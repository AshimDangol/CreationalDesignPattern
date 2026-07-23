package state;

public class RejectedState implements ApplicationState {
    private ApplicationContext context;

    public RejectedState(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void handle() {
        System.out.println("Application rejected — process ended");
    }

    @Override
    public String getStateName() {
        return "Rejected";
    }
}
