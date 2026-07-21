package factory;

// Demo showing the problem: creation logic is scattered inside conditionals
public class FactoryBadDemo {

    public static void main(String[] args) {
        NotificationServiceBad service = new NotificationServiceBad();

        service.sendNotification("EMAIL", "Assignment uploaded");
        service.sendNotification("SMS", "Exam starts tomorrow");
        service.sendNotification("PUSH", "New notice published");
    }
}
