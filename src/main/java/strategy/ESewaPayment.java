package strategy;

// Concrete strategy: processes fee payment through eSewa digital wallet
public class ESewaPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid NPR " + amount + " via eSewa");
    }
}
