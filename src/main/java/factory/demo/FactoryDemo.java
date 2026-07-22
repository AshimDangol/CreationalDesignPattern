package factory.demo;

import factory.Notification;
import factory.NotificationFactory;

// Demo showing the Factory fix: creation logic is centralized in the factory
// Client code only depends on the Notification interface
public class FactoryDemo {
    public static void main(String[] args) {
        // Factory handles which concrete class to instantiate
        Notification email = NotificationFactory.createNotification("EMAIL");
        email.send("Assignment uploaded");

        Notification sms = NotificationFactory.createNotification("SMS");
        sms.send("Exam starts tomorrow");

        Notification push = NotificationFactory.createNotification("PUSH");
        push.send("New notice published");
    }
}
