package org.example.lesson13;

@FunctionalInterface
public interface Operation<T> {

    T operate(T value1, T value2);
}
