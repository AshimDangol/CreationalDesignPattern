package observer;

// Concrete observer: notifies the student's parent when results are published
public class ParentNotifier implements Observer {
    private String parentName;

    public ParentNotifier(String parentName) {
        this.parentName = parentName;
    }

    @Override
    public void update(String message) {
        System.out.println("Parent " + parentName + " notified: " + message);
    }
}
