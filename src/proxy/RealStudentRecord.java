package proxy;

// RealSubject — the actual object that performs the real work
// In a real system this would query a database; here it returns sample marks
public class RealStudentRecord implements StudentRecord {
    private String studentName;

    public RealStudentRecord(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public void viewMarks() {
        System.out.println("Displaying marks for " + studentName + ": A+, A, B+");
    }
}
