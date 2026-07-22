package adapter;

import java.util.Scanner;

public class AdapterTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Adapter Test ===");
        testAdapterObjectCreated();
        testAdapterNotNull();

        System.out.print("Enter message to send via adapter: ");
        String message = scanner.nextLine();
        testAdapterDelegatesCorrectly(message);

        testAdapterImplementsNotification();

        scanner.close();
    }

    static void testAdapterObjectCreated() {
        LegacyEmailService oldService = new LegacyEmailService();
        Notification adapter = new EmailAdapter(oldService);
        if (adapter != null) {
            System.out.println("PASS: Adapter object created");
        } else {
            System.out.println("FAIL: Adapter is null");
        }
    }

    static void testAdapterDelegatesCorrectly(String message) {
        LegacyEmailService oldService = new LegacyEmailService();
        EmailAdapter adapter = new EmailAdapter(oldService);
        try {
            adapter.sendNotification(message);
            System.out.println("PASS: Notification sent successfully");
        } catch (Exception e) {
            System.out.println("FAIL: Exception thrown - " + e.getMessage());
        }
    }

    static void testAdapterImplementsNotification() {
        LegacyEmailService oldService = new LegacyEmailService();
        Notification adapter = new EmailAdapter(oldService);
        if (adapter instanceof Notification) {
            System.out.println("PASS: Adapter implements Notification interface");
        } else {
            System.out.println("FAIL: Adapter does not implement Notification");
        }
    }

    static void testAdapterNotNull() {
        LegacyEmailService oldService = new LegacyEmailService();
        EmailAdapter adapter = new EmailAdapter(oldService);
        if (adapter != null) {
            System.out.println("PASS: Adapter is not null");
        } else {
            System.out.println("FAIL: Adapter is null");
        }
    }
}
