package org.example.lesson12;

import java.util.Comparator;

public class StoreEmployee extends Employee {

    private String store;


    public StoreEmployee() {
        super(0, "genericName", 000); // just to create a comparator
    }

    public StoreEmployee(int employeeId, String name, int yearStarted, String store) {
        super(employeeId, name, yearStarted);
        this.store = store;
    }

    @Override
    public String toString() {
        return "%-10s%s".formatted(store, super.toString());
    }

    public String getStore() {
        return store;
    }

    public class StoreEmployeeComparator<T extends StoreEmployee> implements Comparator<StoreEmployee> {

        @Override
        public int compare(StoreEmployee o1, StoreEmployee o2) {
            int compareResult = o1.store.compareTo(o2.store);
            if (compareResult == 0) {
                return new Employee.EmployeeComparator<>().compare(o1, o2);
            }

            return compareResult;
        }
    }
}
