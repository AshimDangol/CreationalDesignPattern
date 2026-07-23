package observer.bad;

public class ResultNotifierBad {

    public void publishResults(String studentName, String parentName, String department) {
        System.out.println("Results published for " + studentName);
        System.out.println("Student " + studentName + " notified");
        System.out.println("Parent " + parentName + " notified");
        System.out.println(department + " Department notified");
    }
}
