package strategy;

public class BankTransferPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid NPR " + amount + " via Bank Transfer");
    }
}
