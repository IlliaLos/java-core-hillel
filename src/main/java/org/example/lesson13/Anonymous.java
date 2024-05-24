package org.example.lesson13;

import org.example.lesson12.Employee;
import org.example.lesson12.StoreEmployee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Anonymous {

    public static void main(String[] args) {
        var storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(10011, "Stepan", 2014, "ATB"),
                new StoreEmployee(10012, "Semen", 2015, "Silpo"),
                new StoreEmployee(10015, "Igor", 2019, "Varus"),
                new StoreEmployee(12311, "Ivan", 2022, "Le Silpo"),
                new StoreEmployee(10191, "Dmytro", 2024, "ATB")
        ));

        var comparator = new Employee.EmployeeComparator<>();
        var storeEmployeeComparator = new StoreEmployee().new StoreEmployeeComparator<>();

        sortAndPrint(storeEmployees, comparator);
        sortAndPrint(storeEmployees, storeEmployeeComparator);

        class IdSort<T> implements Comparator<StoreEmployee> {
            @Override
            public int compare(StoreEmployee o1, StoreEmployee o2) {
                return Integer.compare(o1.getEmployeeId(), o2.getEmployeeId());
            }
        }

        var comparatorThree = new IdSort<StoreEmployee>();

        sortAndPrint(storeEmployees, comparatorThree);

        var comparatorFour = new Comparator<StoreEmployee>() {
            @Override
            public int compare(StoreEmployee o1, StoreEmployee o2) {
                return Integer.compare(o1.getEmployeeId(), o2.getEmployeeId());
            }
        };
        sortAndPrint(storeEmployees, comparatorFour);


        /// Anonymous class without variable
        sortAndPrint(storeEmployees, new Comparator<StoreEmployee>() {
            @Override
            public int compare(StoreEmployee o1, StoreEmployee o2) {
                return Integer.compare(o1.getEmployeeId(), o2.getEmployeeId());
            }
        });
    }

    public static <T> void sortAndPrint(List<T> list, Comparator<? super T> comparator) {
        System.out.println("Sorting with comparator: " + comparator.toString());
        list.sort(comparator);
        for (var element : list) {
            System.out.println(element);
        }
    }


}
