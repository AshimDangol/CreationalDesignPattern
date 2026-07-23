package observer;

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
