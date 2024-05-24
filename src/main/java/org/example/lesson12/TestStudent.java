package org.example.lesson12;

import java.util.ArrayList;
import java.util.Arrays;

public class TestStudent {

    public static void main(String[] args) {
        Student tim = new Student("Tim");

        Student[] students = {new Student("John"), new Student("Paul"), new Student("Ann")};

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));



    }

    public void myNonStaticMethod() {
        var list = new ArrayList<String>();
        GenericsExample.testList(list);
    }
}
