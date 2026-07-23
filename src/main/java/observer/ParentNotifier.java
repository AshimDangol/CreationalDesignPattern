package observer;

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
