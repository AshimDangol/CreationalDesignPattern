package observer.bad;

// Bad design: all notification targets are hardcoded into a single method
// Adding a new recipient requires modifying this class (violates Open/Closed)
public class ResultNotifierBad {

    // Tightly coupled — every notification target is directly printed here
    public void publishResults(String studentName, String parentName, String department) {
        System.out.println("Results published for " + studentName);
        System.out.println("Student " + studentName + " notified");
        System.out.println("Parent " + parentName + " notified");
        System.out.println(department + " Department notified");
    }
}
