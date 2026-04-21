// BankTransfer.java
public class BankTransfer implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Bank Transfer for $" + amount);
        System.out.println("Payment successful!");
    }
}