package strategy;

// Concrete strategy: processes fee payment through Khalti digital wallet
public class KhaltiPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid NPR " + amount + " via Khalti");
    }
}
