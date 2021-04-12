package com.ifmo.jjd.lesson100;

public enum Planet {
    //объекты - список планет
    MERCURY(12,45),
    VENUS(45,65),
    EARTH(87,56),
    MARS(23,65),
    JUPITER(65,98),
    SATURN(56,23),
    URANUS(123,654),
    NEPTUNE(3,5);

    private int mass;
    private int radius;

    Planet(int mass, int radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}


