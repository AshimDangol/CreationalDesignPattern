package facade;

// Subsystem component — persists student record to the system
public class StudentSaver {
    public void save(String name, int rollNumber, String department) {
        System.out.println("Student " + name + " saved with roll number " + rollNumber + " in " + department);
    }
}
