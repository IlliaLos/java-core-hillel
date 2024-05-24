package org.example.lesson12;

import java.util.Comparator;

public class Student implements Comparable<Student> {

    private String name;
    protected int id;

    public Student(String name) {
        this.name = name;
        this.id = (int) (Math.random() * 12345);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }
}

class StudentIdComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.id, o2.id);
    }
}
