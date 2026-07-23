package strategy.demo;

import strategy.BankTransferPayment;
import strategy.ESewaPayment;
import strategy.KhaltiPayment;
import strategy.PaymentContext;

// Demo showing the Strategy pattern: payment method is selected at runtime
// Each strategy encapsulates a different payment algorithm
public class StrategyDemo {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Switch between payment strategies at runtime
        context.setPaymentStrategy(new KhaltiPayment());
        context.executePayment(1500);

        context.setPaymentStrategy(new ESewaPayment());
        context.executePayment(2000);

        context.setPaymentStrategy(new BankTransferPayment());
        context.executePayment(5000);
    }
}
