package Tasks;

public class Task1Main {
    public static void main(String[] args) {
        System.out.println("=== Lab Task 1: Black-Box Reuse ===\n");

        // Cart 1 uses a credit card
        EcommerceCart cart1 = new EcommerceCart(new CreditCardPayment("8654609421935462"));
        cart1.addItem("Laptop Bag", 4499.99);
        cart1.addItem("Mouse", 1199.99);
        cart1.checkout();

        // Cart 2 uses JazzCash - same EcommerceCart class, no changes needed
        EcommerceCart cart2 = new EcommerceCart(new JazzCashPayment("03001234567"));
        cart2.addItem("Notebook", 349.99);
        cart2.addItem("Pen Set", 145.50);
        cart2.checkout();

        // Cart 3 swaps in an anonymous implementation to prove true black-box reuse
        EcommerceCart cart3 = new EcommerceCart(amount -> {
            System.out.println("[Custom] Paid Rs. " + amount + " via a brand new payment type");
            return true;
        });
        cart3.addItem("Headphones", 3499.99);
        cart3.checkout();
    }
}
