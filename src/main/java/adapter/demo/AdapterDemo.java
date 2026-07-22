package adapter.demo;

import adapter.EmailAdapter;
import adapter.LegacyEmailService;
import adapter.Notification;

// Demo showing the Adapter fix: EmailAdapter bridges the incompatible interface
// Client code calls sendNotification() — the adapter translates it to sendMail()
public class AdapterDemo {
    public static void main(String[] args) {
        LegacyEmailService oldService = new LegacyEmailService();
        Notification notif = new EmailAdapter(oldService);
        notif.sendNotification("Welcome to PCPS College");
    }
}
