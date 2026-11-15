package Tasks;

public class Task3Main {

    // Client code written against the Rectangle contract
    static void resize(Rectangle r, int w, int h) {
        r.setDimensions(w, h);
        System.out.println("Area = " + r.area());
    }

    public static void main(String[] args) {
        System.out.println("=== Lab Task 3: Liskov Substitution Principle ===\n");

        System.out.println("--- Part A: Violation (Square extends Rectangle) ---");
        Rectangle normal = new Rectangle();
        resize(normal, 5, 10);              // works fine

        try {
            Rectangle shape = new Square(); // Square treated as a Rectangle
            resize(shape, 5, 10);           // crashes: w != h
        } catch (IllegalArgumentException e) {
            System.out.println("CRASH: " + e.getMessage());
        }

        System.out.println("\n--- Part B: Fix (common Shape interface) ---");
        Shape[] shapes = { new FixedRectangle(5, 10), new FixedSquare(5) };
        for (Shape s : shapes) {
            System.out.println(s.getClass().getSimpleName() + " area = " + s.area());
        }
    }
}
