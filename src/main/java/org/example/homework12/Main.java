package org.example.homework12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Mykyta Vovk", 19, 87));
        students.add(new Student("Mykola Tyschenko", 20, 63));
        students.add(new Student("Vadym Krupka", 22, 95));
        students.add(new Student("Olena Stetsura", 17, 91));
        students.add(new Student("Galyna Pryhodko", 19, 72));
        students.add(new Student("Prohor Hlushko", 18, 58));
        students.add(new Student("Larysa Tertiy", 21, 69));

        System.out.println("All names of the students:");
        printAllStudentNames(students);
        System.out.println("-".repeat(30));

        System.out.println("The names of students who are older than 20 years:");
        printStudentOlderAge(students);
        System.out.println("-".repeat(30));

        System.out.println("The names of students who have scored an A grade (grade >= 90):");
        printStudentGrandes(students);
        System.out.println("-".repeat(30));

        System.out.println("The average grade of all students: " + (int)calculateAverageGrande(students));
        System.out.println("-".repeat(30));

        System.out.println("the student with the highest grade: " + findTheStudentWithTheHighestGrade(students));
        System.out.println("-".repeat(30));

        System.out.println("The number of students with a grade below 60: " + calculateStuentsWithGrande(students));
    }

    private static void printAllStudentNames(List<Student> students){
        students.stream()
                .map(Student::getName)
                .forEach(System.out::println);
    }

    private static void printStudentOlderAge(List<Student> students){
        students.stream()
                .filter(student -> student.getAge() >= 20)
                .map(Student::getName)
                .forEach(System.out::println);
    }
    private static void printStudentGrandes(List<Student> students){
        students.stream()
                .filter(student -> student.getGrade() >= 90)
                .map(Student::getName)
                .forEach(System.out::println);
    }

    private static double calculateAverageGrande(List<Student> students){
        return students.stream()
                .mapToInt(Student::getGrade)
                .average()
                .orElse(0.0);
    }

    private static Student findTheStudentWithTheHighestGrade(List<Student> students){
        return students.stream()
                .max(Comparator.comparingInt(Student::getGrade))
                .orElse(null);
    }

    private static long calculateStuentsWithGrande(List<Student> students){
        return students.stream()
                .filter(student -> student.getGrade() < 60)
                .count();
    }
}
