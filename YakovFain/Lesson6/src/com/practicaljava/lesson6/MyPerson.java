package com.practicaljava.lesson6;

/**
 * Created by Andrei on 013 13.01.17.
 */
public abstract class MyPerson {

    private String name;
    private int age;
    final int MAX_PERCENT = 20;

    MyPerson(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void GiveDayOff() { }

    public void Promote(int percent) {
        GiveDayOff();
        IncreasePay(percent);
    }

    public abstract void IncreasePay(int percent);
}
