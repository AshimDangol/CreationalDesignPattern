package factory;

// Demo showing the problem: instance creation and business logic are mixed together
// Adding a new type means editing NotificationServiceBad itself
public class FactoryBadDemo {

    public static void main(String[] args) {
        NotificationServiceBad service = new NotificationServiceBad();

        service.sendNotification("EMAIL", "Assignment uploaded");
        service.sendNotification("SMS", "Exam starts tomorrow");
        service.sendNotification("PUSH", "New notice published");
    }
}
