package adapter;

// Adapter — wraps the legacy service to match the Notification interface
// Translates sendNotification() calls into sendMail() without modifying LegacyEmailService
public class EmailAdapter implements Notification {
    private LegacyEmailService legacyEmailService;

    public EmailAdapter(LegacyEmailService legacyEmailService) {
        this.legacyEmailService = legacyEmailService;
    }

    @Override
    public void sendNotification(String message) {
        legacyEmailService.sendMail(message);
    }
}
