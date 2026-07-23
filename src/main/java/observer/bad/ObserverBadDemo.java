package observer.bad;

// Demo showing the problem: notification recipients are fixed at compile time
// Changing who gets notified means editing the class itself
public class ObserverBadDemo {
    public static void main(String[] args) {
        ResultNotifierBad notifier = new ResultNotifierBad();
        notifier.publishResults("Ram", "Hari", "BCA");
    }
}
