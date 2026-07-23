package state.demo;

import state.ApplicationContext;

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
