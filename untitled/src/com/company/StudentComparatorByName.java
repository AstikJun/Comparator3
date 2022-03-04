package com.company;

import java.util.Comparator;

public class StudentComparatorByName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int result = o1.name.compareToIgnoreCase(o2.name);
        if (result == 0) {
            return o1.surname.compareToIgnoreCase(o2.surname);
        }
        return result;
    }
}