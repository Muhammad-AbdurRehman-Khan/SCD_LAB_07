# Lab 07 - Construction for Reuse: Interfaces, Generics, and Contracts

**Course:** Software Construction & Development (SE-208L) | **Class:** 5th Semester Software Engineering
**University:** University of Engineering and Technology, Abbottabad Campus
**Instructor:** Engr. Rizwan Shah
**Student:** Muhammad Abdur Rehman Khan

## Objective
Apply software engineering principles by designing components capable of black-box reuse, generic type safety, and contract integrity.

## Project Structure

```
Lab07/
├── pom.xml
└── src/main/java/
    ├── Tasks/
    │   ├── PaymentMethod.java, CreditCardPayment.java, JazzCashPayment.java,
    │   │   EcommerceCart.java, Task1Main.java            (Task 1)
    │   ├── DataBox.java, Task2Main.java                  (Task 2)
    │   └── Rectangle.java, Square.java, Shape.java,
    │       FixedRectangle.java, FixedSquare.java,
    │       Task3Main.java                                (Task 3)
    └── Homework/
        ├── Student.java, CgpaComparator.java,
        └── HomeworkMain.java                             (Task 4)
```

## Task Descriptions

| Task | Description | Main class |
|---|---|---|
| **Task 1 - Black-Box Reuse** | `PaymentMethod` interface (`boolean pay(double amount)`) with `CreditCardPayment` and `JazzCashPayment`. `EcommerceCart` receives a `PaymentMethod` through its constructor (dependency injection / composition), so it can process payments without knowing the concrete type. | `Tasks.Task1Main` |
| **Task 2 - Generic Data Container** | Generic `DataBox<T>` with a private field, constructor and getter. `DataBox<String>` holds a student name and `DataBox<Integer>` holds a student ID. Storing a `String` in the `Integer` box is rejected at compile time. | `Tasks.Task2Main` |
| **Task 3 - Liskov Substitution Principle** | `Square extends Rectangle` throws an exception for `setDimensions(5, 10)` when used as a `Rectangle` (LSP violation). Fixed by removing the inheritance and using a common `Shape` interface (`FixedRectangle`, `FixedSquare`). | `Tasks.Task3Main` |
| **Task 4 (Homework) - Ordering Algorithms** | `Student` (`rollNo`, `cgpa`) implements `Comparable<Student>` (rollNo ascending). `CgpaComparator` implements `Comparator<Student>` (cgpa descending). Three students in an `ArrayList` are sorted both ways. | `Homework.HomeworkMain` |

## How to Run

### Option 1: NetBeans
1. Open **File > Open Project** and select the `Lab07` folder (Maven project).
2. Expand `Source Packages`, then `Tasks` or `Homework`.
3. Right-click the main class (`Task1Main`, `Task2Main`, `Task3Main` or `HomeworkMain`) and choose **Run File** (Shift+F6).

### Option 2: Command line
Requires JDK 17 or newer. From the repository root:

```bash
cd src/main/java
javac Tasks/*.java Homework/*.java

java Tasks.Task1Main
java Tasks.Task2Main
java Tasks.Task3Main
java Homework.HomeworkMain
```

### Task 2 compile-time safety demo
In `Task2Main.java`, uncomment the line
`DataBox<Integer> wrongBox = new DataBox<>("...");`
and build. The compiler reports `incompatible types: String cannot be converted to Integer`.
