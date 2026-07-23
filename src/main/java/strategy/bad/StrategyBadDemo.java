package strategy.bad;

public class StrategyBadDemo {
    public static void main(String[] args) {
        FeeProcessorBad processor = new FeeProcessorBad();
        processor.processFee("KHALTI", 1500);
        processor.processFee("ESEWA", 2000);
        processor.processFee("BANK", 5000);
    }
}
