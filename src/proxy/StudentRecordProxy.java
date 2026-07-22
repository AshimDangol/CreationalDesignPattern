package proxy;

// Proxy — controls access to RealStudentRecord based on the caller's role
// Only ADMIN role is allowed to view marks; STUDENT role is denied
public class StudentRecordProxy implements StudentRecord {
    private RealStudentRecord realRecord;
    private String role;

    public StudentRecordProxy(String studentName, String role) {
        this.realRecord = new RealStudentRecord(studentName);
        this.role = role;
    }

    @Override
    public void viewMarks() {
        if ("ADMIN".equalsIgnoreCase(role)) {
            realRecord.viewMarks();
        } else {
            System.out.println("Access denied: Only ADMIN can view marks.");
        }
    }
}
