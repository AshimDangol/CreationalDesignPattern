package state;

public class ApplicationContext {
    private ApplicationState submittedState;
    private ApplicationState verifiedState;
    private ApplicationState approvedState;
    private ApplicationState enrolledState;
    private ApplicationState rejectedState;
    private ApplicationState currentState;

    public ApplicationContext() {
        submittedState = new SubmittedState(this);
        verifiedState = new VerifiedState(this);
        approvedState = new ApprovedState(this);
        enrolledState = new EnrolledState(this);
        rejectedState = new RejectedState(this);
        currentState = submittedState;
    }

    public void setState(ApplicationState state) {
        currentState = state;
    }

    public void next() {
        currentState.handle();
    }

    public void reject() {
        setState(rejectedState);
        rejectedState.handle();
    }

    public String getCurrentState() {
        return currentState.getStateName();
    }

    public ApplicationState getSubmittedState() { return submittedState; }
    public ApplicationState getVerifiedState() { return verifiedState; }
    public ApplicationState getApprovedState() { return approvedState; }
    public ApplicationState getEnrolledState() { return enrolledState; }
    public ApplicationState getRejectedState() { return rejectedState; }
}
