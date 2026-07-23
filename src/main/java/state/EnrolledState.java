package state;

// Concrete state: represents the final Enrolled stage — admission is complete
// Terminal state — no further transitions (handle is a no-op)
public class EnrolledState implements ApplicationState {
    private ApplicationContext context;

    public EnrolledState(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void handle() {
        System.out.println("Student enrolled — final state reached");
    }

    @Override
    public String getStateName() {
        return "Enrolled";
    }
}
