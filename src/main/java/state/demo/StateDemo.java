package state.demo;

import state.ApplicationContext;

// Demo showing the State pattern: application progresses through lifecycle stages
// Each call to next() triggers the current state's logic and transitions to the next
public class StateDemo {
    public static void main(String[] args) {
        ApplicationContext app = new ApplicationContext();

        System.out.println("Current: " + app.getCurrentState());
        app.next();
        System.out.println("Current: " + app.getCurrentState());
        app.next();
        System.out.println("Current: " + app.getCurrentState());
        app.next();
        System.out.println("Current: " + app.getCurrentState());
    }
}
