package org.example.lesson12;

import java.util.Comparator;

public class Employee {

    private int employeeId;
    private String name;
    private int yearStarted;

    public Employee(int employeeId, String name, int yearStarted) {
        this.employeeId = employeeId;
        this.name = name;
        this.yearStarted = yearStarted;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", yearStarted=" + yearStarted +
                '}';
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public static class EmployeeComparator<T extends Employee> implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
//            return o1.name.compareTo(o2.name);
            return Integer.compare(o1.yearStarted, o2.yearStarted);
//            return o1.getName().compareTo(o2.getName()); no need to use getters
        }
    }
}
