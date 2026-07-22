package proxy;

// Bad design: access control logic is mixed into client code
// Every place that views marks must duplicate this if-else check
public class ProxyBadDemo {
    public static void main(String[] args) {
        RealStudentRecord record = new RealStudentRecord("Ram");
        String role = "STUDENT";

        if ("ADMIN".equalsIgnoreCase(role)) {
            record.viewMarks();
        } else {
            System.out.println("Access denied: Only ADMIN can view marks.");
        }
    }
}
