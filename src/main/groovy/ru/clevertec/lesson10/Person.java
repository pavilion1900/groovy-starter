package ru.clevertec.lesson10;

public class Person {
    private final int id;

    public Person(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public boolean isCase(Object switchValue) {
        System.out.println("invoke isCase: " + switchValue);
        return false;
    }

    public boolean asBoolean() {
        return id > 10;
    }
}
