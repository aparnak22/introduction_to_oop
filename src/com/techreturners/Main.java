package com.techreturners;

import com.techreturners.introduction_to_oop.exercise2.Bird;
import com.techreturners.introduction_to_oop.exercise3.Pigeon;

public class Main {

    public static void main(String[] args) {
        Pigeon pippa = new Pigeon("Pippa", "Grey");
        pippa.speak();
        pippa.fly();
        pippa.eatPizza();
        pippa.sleep();


    }
}
