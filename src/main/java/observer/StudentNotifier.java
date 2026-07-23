package observer;

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
