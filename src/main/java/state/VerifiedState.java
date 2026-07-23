package state;

// Concrete state: represents the Verified stage after document validation
// Transitions to Approved after verification is complete
public class VerifiedState implements ApplicationState {
    private ApplicationContext context;

    public VerifiedState(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void handle() {
        System.out.println("Application verified — moving to Approved");
        context.setState(context.getApprovedState());
    }

    @Override
    public String getStateName() {
        return "Verified";
    }
}
