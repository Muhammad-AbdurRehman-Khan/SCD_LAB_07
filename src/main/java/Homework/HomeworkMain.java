package Homework;

import java.util.ArrayList;
import java.util.Collections;

public class HomeworkMain {
    public static void main(String[] args) {
        System.out.println("=== Lab Task 4: Reusable Ordering Algorithms ===\n");

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(103, 3.50));
        students.add(new Student(101, 3.20));
        students.add(new Student(102, 3.85));

        System.out.println("Original order:");
        students.forEach(System.out::println);

        Collections.sort(students); // Comparable: rollNo ascending
        System.out.println("\nSorted by rollNo (ascending, Comparable):");
        students.forEach(System.out::println);

        Collections.sort(students, new CgpaComparator()); // Comparator: cgpa descending
        System.out.println("\nSorted by cgpa (descending, CgpaComparator):");
        students.forEach(System.out::println);
    }
}
