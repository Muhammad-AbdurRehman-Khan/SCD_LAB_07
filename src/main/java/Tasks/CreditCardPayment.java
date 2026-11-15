package Tasks;

public class CreditCardPayment implements PaymentMethod {
    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean pay(double amount) {
        if (amount <= 0) {
            System.out.println("[CreditCard] Invalid amount: " + amount);
            return false;
        }
        String masked = "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);
        System.out.println("[CreditCard] Paid Rs. " + amount + " using card " + masked);
        return true;
    }
}
