package factory;

import java.util.Scanner;

public class NotificationFactoryTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== NotificationFactory Test ===");

        System.out.println("Enter notification types exactly: EMAIL, SMS, PUSH, or something invalid.\n");

        System.out.print("Enter type (EMAIL) to create EmailNotification: ");
        String emailType = scanner.nextLine();
        testEmailNotification(emailType);

        System.out.print("Enter type (SMS) to create SmsNotification: ");
        String smsType = scanner.nextLine();
        testSmsNotification(smsType);

        System.out.print("Enter type (PUSH) to create PushNotification: ");
        String pushType = scanner.nextLine();
        testPushNotification(pushType);

        System.out.print("Enter a valid type (EMAIL/SMS/PUSH) to verify non-null: ");
        String notNullType = scanner.nextLine();
        testNotificationNotNull(notNullType);

        System.out.print("Enter an invalid type (e.g. FAX) to test exception: ");
        String invalidType = scanner.nextLine();
        testInvalidTypeThrowsException(invalidType);

        scanner.close();
    }

    static void testEmailNotification(String type) {
        Notification notification = NotificationFactory.createNotification(type);
        if (notification instanceof EmailNotification) {
            System.out.println("PASS: " + type + " creates EmailNotification");
        } else {
            System.out.println("FAIL: " + type + " did not create EmailNotification");
        }
    }

    static void testSmsNotification(String type) {
        Notification notification = NotificationFactory.createNotification(type);
        if (notification instanceof SmsNotification) {
            System.out.println("PASS: " + type + " creates SmsNotification");
        } else {
            System.out.println("FAIL: " + type + " did not create SmsNotification");
        }
    }

    static void testPushNotification(String type) {
        Notification notification = NotificationFactory.createNotification(type);
        if (notification instanceof PushNotification) {
            System.out.println("PASS: " + type + " creates PushNotification");
        } else {
            System.out.println("FAIL: " + type + " did not create PushNotification");
        }
    }

    static void testNotificationNotNull(String type) {
        Notification notification = NotificationFactory.createNotification(type);
        if (notification != null) {
            System.out.println("PASS: Notification is not null for type " + type);
        } else {
            System.out.println("FAIL: Notification is null for type " + type);
        }
    }

    static void testInvalidTypeThrowsException(String type) {
        try {
            NotificationFactory.createNotification(type);
            System.out.println("FAIL: No exception thrown for invalid type " + type);
        } catch (IllegalArgumentException e) {
            System.out.println("PASS: Exception thrown for invalid type " + type);
        }
    }
}
