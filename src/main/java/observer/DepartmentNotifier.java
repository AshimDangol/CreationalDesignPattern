package observer;

// Concrete observer: notifies the academic department when results are published
public class DepartmentNotifier implements Observer {
    private String department;

    public DepartmentNotifier(String department) {
        this.department = department;
    }

    @Override
    public void update(String message) {
        System.out.println(department + " Department notified: " + message);
    }
}
