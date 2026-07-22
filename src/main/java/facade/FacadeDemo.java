package facade;

// Demo showing the Facade fix: one simple method call hides the subsystem complexity
// Client code is decoupled from StudentValidator, RollNumberAssigner, etc.
public class FacadeDemo {
    public static void main(String[] args) {
        StudentRegistrationFacade facade = new StudentRegistrationFacade();
        facade.registerStudent("Ram", "ram@gmail.com");
    }
}
