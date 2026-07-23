package observer;

import java.util.ArrayList;
import java.util.List;

public class ResultPublisher implements ResultSubject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void publishResults(String studentName) {
        System.out.println("Results published for " + studentName);
        notifyObservers(studentName + " results are now available");
    }
}
