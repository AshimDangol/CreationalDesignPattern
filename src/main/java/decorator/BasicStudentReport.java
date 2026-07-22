package decorator;

// ConcreteComponent — the core object to which additional features can be attached
// Generates a basic student report with name and ID
public class BasicStudentReport implements StudentReport {
    private String studentName;
    private int studentId;

    public BasicStudentReport(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    @Override
    public void generate() {
        System.out.println("Student Report");
        System.out.println("ID: " + studentId + ", Name: " + studentName);
    }
}
