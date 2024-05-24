package org.example.lesson11;

public class ObjectHolder<T> {

    private T object;

    public ObjectHolder(T s) {
        this.object = s;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
