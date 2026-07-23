package state.bad;

// Demo showing the problem: state transitions are managed by integer codes and conditionals
// No separation of concerns — state behavior and transitions are mixed in one class
public class StateBadDemo {
    public static void main(String[] args) {
        ApplicationManagerBad app = new ApplicationManagerBad();
        System.out.println("Current: " + app.getCurrentState());
        app.next();
        System.out.println("Current: " + app.getCurrentState());
        app.next();
        System.out.println("Current: " + app.getCurrentState());
        app.next();
        System.out.println("Current: " + app.getCurrentState());
    }
}
