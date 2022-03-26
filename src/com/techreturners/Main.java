package com.techreturners;

import com.techreturners.introduction_to_oop.exercises.*;

public class Main {

    public static void main(String[] args) {
        Pigeon pippa = new Pigeon("Pippa", "Grey");
        pippa.speak();
        pippa.fly();
        pippa.eatPizza();

        Penguin pingu = new Penguin("Pingu", "Black & White");
        pingu.speak();
        pingu.fly();

        Parrot parrot = new Parrot("Polly", "Red");
        parrot.speak();
        parrot.fly();
    }
}
