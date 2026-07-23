package state.bad;

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
