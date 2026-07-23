package observer;

// Subject interface: manages observer registration and notification
// Any class acting as a publishable result source implements this
public interface ResultSubject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}
