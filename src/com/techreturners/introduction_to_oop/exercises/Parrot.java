package com.techreturners.introduction_to_oop.exercises;

public class Parrot extends Bird{

    public Parrot(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.println("Aye! I'm " + name + " and I'm a clever " + color + " parrot ");
    }
}
