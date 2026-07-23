package strategy;

// Concrete strategy: processes fee payment through direct bank transfer
public class BankTransferPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid NPR " + amount + " via Bank Transfer");
    }
}
