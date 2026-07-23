package observer;

// Concrete observer: notifies the student when results are published
public class StudentNotifier implements Observer {
    private String studentName;

    public StudentNotifier(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public void update(String message) {
        System.out.println("Student " + studentName + " notified: " + message);
    }
}
