package org.example.homework10.employeeProcessing;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeProcessing {

    public static void main(String[] args) {
        Employee e1 = new Employee("Minnie", "Mouse", "01/02/2015");
        Employee e2 = new Employee("Mickey", "Mouse", "05/08/2000");
        Employee e3 = new Employee("Daffy", "Duck", "11/02/2011");
        Employee e4 = new Employee("Daisy", "Duck", "05/03/2013");
        Employee e5 = new Employee("Goofy", "Dog", "23/07/2020");

        List<Employee> list = new ArrayList<>(Arrays.asList(e1, e2, e3, e4, e5));

        printOrderedList(list, "name");
        System.out.println();
        printOrderedList(list, "year");
    }

    public static void printOrderedList(List<Employee> employees, String sortBy) {
        if (sortBy.equals("name")) {
            Collections.sort(employees, new Comparator<Employee>() {
                @Override
                public int compare(Employee emp1, Employee emp2) {
                    return emp1.firstName().compareTo(emp2.firstName());
                }
            });
        } else if (sortBy.equals("year")) {
            Collections.sort(employees, new Comparator<Employee>() {
                @Override
                public int compare(Employee emp1, Employee emp2) {
                    return Integer.compare(getYearsWorked(emp1), getYearsWorked(emp2));
                }
            });
        }

        for (Employee emp : employees) {
            System.out.println("Full Name: " + emp.firstName() + " " + emp.lastName() +
                    ", Years Worked: " + getYearsWorked(emp));
        }
    }

    private static int getYearsWorked(Employee emp) {
        int currentYear = LocalDate.now().getYear();
        int hireYear = Integer.parseInt(emp.hireDate().split("/")[2]);
        return currentYear - hireYear;
    }
}