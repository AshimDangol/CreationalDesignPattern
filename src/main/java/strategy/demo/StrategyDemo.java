package strategy.demo;

import strategy.BankTransferPayment;
import strategy.ESewaPayment;
import strategy.KhaltiPayment;
import strategy.PaymentContext;

public class StrategyDemo {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new KhaltiPayment());
        context.executePayment(1500);

        context.setPaymentStrategy(new ESewaPayment());
        context.executePayment(2000);

        context.setPaymentStrategy(new BankTransferPayment());
        context.executePayment(5000);
    }
}
