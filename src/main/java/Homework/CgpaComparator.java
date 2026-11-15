package Homework;

import java.util.Comparator;

// External ordering rule: cgpa descending
public class CgpaComparator implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return Double.compare(b.getCgpa(), a.getCgpa());
    }
}
