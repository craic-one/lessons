package com.ifmo.jjd.lesson9;

import com.ifmo.jjd.lesson6.Climber;

public class Application {
    public static void main(String[] args) {
        Object o = new Climber();

        Point a = new Point(45,12);
        Point b = new Point(45,12);
        System.out.println(a.equals(b)); //с помощью equals мы хотим сравнить a и b; false,
                                        // так как сравниваются просто ссылки, так как метод не переопределен
        Point c = a.clone();
        System.out.println(c == a); // false - сравниваем ссылки
        System.out.println(c.equals(a)); //true

        Figure first = new Figure(2);
        first.addPoint(a);
        first.addPoint(b);

        Figure second = first.clone();

    }

}
