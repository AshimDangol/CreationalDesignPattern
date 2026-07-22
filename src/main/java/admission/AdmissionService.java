package admission;

import builder.Student;
import factory.Notification;
import factory.NotificationFactory;
import singleton.CollegeConfig;

// Integration service that demonstrates all three creational patterns together:
// Singleton (CollegeConfig), Builder (Student), and Factory (Notification)
public class AdmissionService {

    // Uses Singleton config, Builder for Student creation, and Factory for welcome notification
    public Student admitStudent(
            int studentId,
            String name,
            String email,
            String phoneNumber,
            String department,
            int semester,
            String address,
            String guardianName
    ) {
        // Retrieve singleton configuration instance
        CollegeConfig config = CollegeConfig.getInstance();
        System.out.println("College: " + config.getCollegeName());
        System.out.println("System Version: " + config.getSystemVersion());

        // Build a Student using the fluent Builder pattern
        Student student = new Student.Builder()
                .studentId(studentId)
                .name(name)
                .email(email)
                .phoneNumber(phoneNumber)
                .department(department)
                .semester(semester)
                .address(address)
                .guardianName(guardianName)
                .build();

        // Use the factory to create a notification without coupling to concrete classes
        Notification welcome = NotificationFactory.createNotification("EMAIL");
        welcome.send("Welcome " + name + "! You have been admitted to " + config.getCollegeName());

        return student;
    }
}
