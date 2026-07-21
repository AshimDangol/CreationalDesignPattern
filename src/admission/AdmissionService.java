package admission;

import builder.Student;
import factory.Notification;
import factory.NotificationFactory;
import singleton.CollegeConfig;

public class AdmissionService {

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
        CollegeConfig config = CollegeConfig.getInstance();
        System.out.println("College: " + config.getCollegeName());
        System.out.println("System Version: " + config.getSystemVersion());

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

        Notification welcome = NotificationFactory.createNotification("EMAIL");
        welcome.send("Welcome " + name + "! You have been admitted to " + config.getCollegeName());

        return student;
    }
}
