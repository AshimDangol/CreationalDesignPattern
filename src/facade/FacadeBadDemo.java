package facade;

// Bad design: client code must know about and coordinate all subsystem classes
// Adding or changing a step means editing every client that does registration
public class FacadeBadDemo {
    public static void main(String[] args) {
        StudentValidator validator = new StudentValidator();
        RollNumberAssigner assigner = new RollNumberAssigner();
        DepartmentAssigner deptAssigner = new DepartmentAssigner();
        StudentSaver saver = new StudentSaver();
        WelcomeMessageSender sender = new WelcomeMessageSender();

        String name = "Ram";
        String email = "ram@gmail.com";

        if (validator.validate(name, email)) {
            int roll = assigner.assignRollNumber();
            String dept = deptAssigner.assignDepartment(name);
            saver.save(name, roll, dept);
            sender.sendWelcome(name);
        } else {
            System.out.println("Invalid details");
        }
    }
}
