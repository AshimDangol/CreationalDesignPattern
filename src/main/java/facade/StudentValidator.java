package facade;

// Subsystem component — handles student data validation
// Checks that name is non-empty and email contains '@'
public class StudentValidator {
    public boolean validate(String name, String email) {
        return name != null && !name.isEmpty() && email != null && email.contains("@");
    }
}
