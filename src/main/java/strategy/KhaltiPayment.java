package strategy;

public class KhaltiPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid NPR " + amount + " via Khalti");
    }
}
