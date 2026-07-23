package observer.demo;

import observer.DepartmentNotifier;
import observer.ParentNotifier;
import observer.ResultPublisher;
import observer.StudentNotifier;

public class ObserverDemo {
    public static void main(String[] args) {
        ResultPublisher publisher = new ResultPublisher();

        publisher.addObserver(new StudentNotifier("Ram"));
        publisher.addObserver(new ParentNotifier("Hari"));
        publisher.addObserver(new DepartmentNotifier("BCA"));

        publisher.publishResults("Ram");
    }
}
