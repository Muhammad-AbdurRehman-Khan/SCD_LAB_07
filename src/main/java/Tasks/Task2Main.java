package Tasks;

public class Task2Main {
    public static void main(String[] args) {
        System.out.println("=== Lab Task 2: Generic DataBox<T> ===\n");

        DataBox<String> nameBox = new DataBox<>("Muhammad Abdur Rehman Khan");
        DataBox<Integer> idBox = new DataBox<>(2024);

        String name = nameBox.getValue();   // no cast needed
        int id = idBox.getValue();          // no cast needed

        System.out.println("Student Name: " + name);
        System.out.println("Student ID  : " + id);

        // Compile-time safety demonstration:
        // Uncomment the line below and the compiler rejects it with:
        // "incompatible types: String cannot be converted to Integer"
        //
        // DataBox<Integer> wrongBox = new DataBox<>("Muhammad Abdur Rehman Khan");
        // DataBox<Integer> wrongBox2 = new DataBox<Integer>("Muhammad Abdur Rehman Khan");

        // System.out.println("\nStoring a String in DataBox<Integer> is rejected at compile time.");
    }
}
