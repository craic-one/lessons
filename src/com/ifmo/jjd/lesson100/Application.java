package com.ifmo.jjd.lesson100;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Planet planet = Planet.EARTH;


        for (Planet value : Planet.values()) {
            System.out.println(value.ordinal() + " " + value.name());
        }

        System.out.println(Planet.MARS);


    }
}
