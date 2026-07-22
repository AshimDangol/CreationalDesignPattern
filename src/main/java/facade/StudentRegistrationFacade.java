package facade;

// Facade — provides a simplified interface to the complex registration subsystem
// Client code only calls registerStudent() instead of orchestrating all steps manually
public class StudentRegistrationFacade {
    private StudentValidator validator;
    private RollNumberAssigner rollNumberAssigner;
    private DepartmentAssigner departmentAssigner;
    private StudentSaver studentSaver;
    private WelcomeMessageSender welcomeSender;

    public StudentRegistrationFacade() {
        this.validator = new StudentValidator();
        this.rollNumberAssigner = new RollNumberAssigner();
        this.departmentAssigner = new DepartmentAssigner();
        this.studentSaver = new StudentSaver();
        this.welcomeSender = new WelcomeMessageSender();
    }

    // Single entry point that coordinates validate → assign roll → assign dept → save → send welcome
    public void registerStudent(String name, String email) {
        if (!validator.validate(name, email)) {
            throw new IllegalArgumentException("Invalid student details");
        }
        int rollNumber = rollNumberAssigner.assignRollNumber();
        String department = departmentAssigner.assignDepartment(name);
        studentSaver.save(name, rollNumber, department);
        welcomeSender.sendWelcome(name);
    }
}
