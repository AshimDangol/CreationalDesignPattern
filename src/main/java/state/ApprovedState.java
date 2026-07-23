package state;

// Concrete state: represents the Approved stage after review
// Transitions to Enrolled to finalize the admission
public class ApprovedState implements ApplicationState {
    private ApplicationContext context;

    public ApprovedState(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void handle() {
        System.out.println("Application approved — moving to Enrolled");
        context.setState(context.getEnrolledState());
    }

    @Override
    public String getStateName() {
        return "Approved";
    }
}
