// EWallet.java (Supports OVO, GoPay via factory design pattern)
public class EWallet implements PaymentProcessor {
    private String walletType;

    public EWallet(String walletType) {
        this.walletType = walletType;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing " + walletType + " payment for $" + amount);
        System.out.println("Payment successful!");
    }
}