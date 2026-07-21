package factory;

// Demo showing the Factory fix: creation logic is centralized in the factory
public class FactoryDemo {
    public static void main(String[] args) {
        Notification email = NotificationFactory.createNotification("EMAIL");
        email.send("Assignment uploaded");

        Notification sms = NotificationFactory.createNotification("SMS");
        sms.send("Exam starts tomorrow");

        Notification push = NotificationFactory.createNotification("PUSH");
        push.send("New notice published");
    }
}
