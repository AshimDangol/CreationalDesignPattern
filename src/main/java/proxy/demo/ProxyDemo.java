package proxy.demo;

import proxy.StudentRecord;
import proxy.StudentRecordProxy;

// Demo showing the Proxy fix: access control is centralized in StudentRecordProxy
// Client code depends only on StudentRecord interface — no role-checking clutter
public class ProxyDemo {
    public static void main(String[] args) {
        StudentRecord adminView = new StudentRecordProxy("Ram", "ADMIN");
        adminView.viewMarks();

        StudentRecord studentView = new StudentRecordProxy("Ram", "STUDENT");
        studentView.viewMarks();
    }
}
