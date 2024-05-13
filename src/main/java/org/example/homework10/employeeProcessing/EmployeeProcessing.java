package org.example.homework10.employeeProcessing;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

    public class EmployeeProcessing {
        record Employee(String firstName, String lastName, String hireDate) {
        }

        public static void main(String[] args) {
            Employee e1 = new Employee("Мінні", "Маус", "01/02/2015");
            Employee e2 = new Employee("Міккі", "Маус", "05/08/2000");
            Employee e3 = new Employee("Даффі", "Дак", "11/02/2011");
            Employee e4 = new Employee("Дейзі", "Дак", "05/03/2013");
            Employee e5 = new Employee("Гуфі", "Дог", "23/07/2020");

            List<Employee> list = new ArrayList<>(Arrays.asList(e1, e2, e3, e4, e5));
            printOrderedList(list, "ім'я");
            System.out.println();
            printOrderedList(list, "рік");

            Collections.sort(list, new Comparator<Employee>() {
                @Override
                public int compare(Employee emp1, Employee emp2) {
                    String fullName1 = emp1.firstName() + " " + emp1.lastName();
                    String fullName2 = emp2.firstName() + " " + emp2.lastName();
                    return fullName1.compareTo(fullName2);
                }
            });

            Collections.sort(list, new Comparator<Employee>() {
                @Override
                public int compare(Employee emp1, Employee emp2) {
                    int yearsWorked1 = LocalDate.now().getYear() - Integer.parseInt(emp1.hireDate().split("/")[2]);
                    int yearsWorked2 = LocalDate.now().getYear() - Integer.parseInt(emp2.hireDate().split("/")[2]);
                    return Integer.compare(yearsWorked1, yearsWorked2);
                }
            });

        }

        private static void printOrderedList(List<Employee> employees, String sortBy) {
            System.out.println("Відсортовано за " + sortBy + ":");
            for (Employee emp : employees) {
                int yearsWorked = LocalDate.now().getYear() - Integer.parseInt(emp.hireDate().split("/")[2]);
                System.out.println(emp.firstName() + " " + emp.lastName() + " (" + yearsWorked + " років)");
            }
        }
    }