package org.example.lesson11.pojo_record;

public class Main {

    public static void main(String[] args) {
        Student student = new Student(12345667, "Harry", "06.07.1999", "Hillel Java Course");
        System.out.println(student);

        StudentRecord studentRecord = new StudentRecord(12345667, "Harry", "06.07.1999", "Hillel Java Course");
        System.out.println(studentRecord);
    }
}
