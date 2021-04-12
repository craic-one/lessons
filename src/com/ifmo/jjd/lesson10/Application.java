package com.ifmo.jjd.lesson10;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Article auArticle = new Article("Про Австралию");
        auArticle.setText("В Австралии едят кенгуру");

        auArticle.setCountry(Article.Country.AUSTRALIA);

        Article ukArticle = new Article("Про Британию");
        ukArticle.setText("Британцы ненавидят Guinness");
        ukArticle.setCountry(Article.Country.UK);

        // методы enum
        // массив элементов перечисления
        Article.Country[] countries = Article.Country.values(); //методж values возвращает массив с перечислением
        System.out.println(Arrays.toString(countries)); //порядок согласно Class'у

        // индекс элемента перечисления
        System.out.println(Article.Country.USA.ordinal()); // метод вернет индек в массиве перечисления - 2for

        for (Article.Country country : countries) { //передается ссылка на элемент массива
            System.out.println(country.ordinal() + " " + country.name());

        }

        System.out.println(Article.Country.valueOf("USA")); // принимает СТРОКУ и возвращает
                                                            // соответствующий ОБЪЕКТ перечисления

        Article.Country usa = Article.Country.valueOf("USA");
        System.out.println(usa); //USA

        Priority priority = Priority.HIGH; //это обращение к существующему объекту, а не создание
        priority.setCode(100);
        System.out.println(priority.getCode()); //обращение через переменную

        Priority.MIDDLE.setCode(50); //обращение напрямую через объект
        System.out.println(Priority.MIDDLE.getCode());
                            // [HIGH, MIDDLE, LOW]
        for (Priority elem : Priority.values()) { //в elem получаем значение массива
            System.out.println(elem.name() + " " + elem.getCode());
        }

        if (priority == Priority.HIGH){ //сравнение Перечисление не через equals, а через == (равно)
            System.out.println("Сообщение важное");
        }else if (priority == Priority.LOW){
            System.out.println("Не очень важное сообщение");
        }

        Operation sum = Operation.SUM; //идентично
        System.out.println(sum.action(5,5));

        System.out.println(Operation.MULTI.action(5,5));

        //создать enum который перечисляет планеты солнечной системы
        //должна быть реалтизована возможность узнать массу и радиус кажддлой планеты
        //значения вывести в цикле



    }
}
