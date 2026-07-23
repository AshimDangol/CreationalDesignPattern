package state;

// Concrete state: represents the initial Submitted stage
// Transitions to Verified after processing
public class SubmittedState implements ApplicationState {
    private ApplicationContext context;

    public SubmittedState(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void handle() {
        System.out.println("Application submitted — moving to Verified");
        context.setState(context.getVerifiedState());
    }

    @Override
    public String getStateName() {
        return "Submitted";
    }
}
