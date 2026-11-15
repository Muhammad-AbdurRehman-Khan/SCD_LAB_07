package Tasks;

import java.util.ArrayList;
import java.util.List;

/**
 * The cart depends only on the PaymentMethod interface (dependency injection
 * through the constructor). It never knows which concrete payment type it uses.
 */
public class EcommerceCart {
    private final PaymentMethod paymentMethod;
    private final List<String> itemNames = new ArrayList<>();
    private final List<Double> itemPrices = new ArrayList<>();

    public EcommerceCart(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void addItem(String name, double price) {
        itemNames.add(name);
        itemPrices.add(price);
    }

    public double getTotal() {
        double total = 0;
        for (double p : itemPrices) {
            total += p;
        }
        return total;
    }

    public boolean checkout() {
        double total = getTotal();
        System.out.println("Items: " + itemNames + " | Total: Rs. " + total);
        boolean ok = paymentMethod.pay(total);
        System.out.println(ok ? "Checkout successful.\n" : "Checkout failed.\n");
        return ok;
    }
}
