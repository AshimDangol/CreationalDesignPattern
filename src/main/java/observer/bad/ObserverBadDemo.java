package observer.bad;

public class ObserverBadDemo {
    public static void main(String[] args) {
        ResultNotifierBad notifier = new ResultNotifierBad();
        notifier.publishResults("Ram", "Hari", "BCA");
    }
}
