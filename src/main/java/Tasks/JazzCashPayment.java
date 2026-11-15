package Tasks;

public class JazzCashPayment implements PaymentMethod {
    private final String mobileNumber;

    public JazzCashPayment(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public boolean pay(double amount) {
        if (amount <= 0) {
            System.out.println("[JazzCash] Invalid amount: " + amount);
            return false;
        }
        System.out.println("[JazzCash] Paid Rs. " + amount + " from account " + mobileNumber);
        return true;
    }
}
