package org.example.lesson13;

public class OperationTest {

    public static void main(String[] args) {

        int result = calculator((a, b) -> a + b, 5, 6);
        System.out.println(result);
    }

    public static <T> T calculator(Operation<T> function, T value1, T value2) {
        return function.operate(value1, value2);
    }
}
