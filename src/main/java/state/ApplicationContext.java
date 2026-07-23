package state;

// Context: manages the application lifecycle through state transitions
// Delegates behavior to the current state object — states control the transition logic
public class ApplicationContext {
    private ApplicationState submittedState;
    private ApplicationState verifiedState;
    private ApplicationState approvedState;
    private ApplicationState enrolledState;
    private ApplicationState rejectedState;
    private ApplicationState currentState;

    // Initializes all possible states and starts at Submitted
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

    // Advances to the next state (delegates to current state's handle)
    public void next() {
        currentState.handle();
    }

    // Short-circuits to Rejected state (skips normal flow)
    public void reject() {
        setState(rejectedState);
        rejectedState.handle();
    }

    public String getCurrentState() {
        return currentState.getStateName();
    }

    // Expose states so each state can transition to the next
    public ApplicationState getSubmittedState() { return submittedState; }
    public ApplicationState getVerifiedState() { return verifiedState; }
    public ApplicationState getApprovedState() { return approvedState; }
    public ApplicationState getEnrolledState() { return enrolledState; }
    public ApplicationState getRejectedState() { return rejectedState; }
}
