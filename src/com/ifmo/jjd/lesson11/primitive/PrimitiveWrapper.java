package com.ifmo.jjd.lesson11.primitive;

public class PrimitiveWrapper {
    public static void main(String[] args) {
        // short - class Short
        // byte - class Byte
        // int  - class Integer
        // long - class Long
        // boolean - class Boolean
        // float - class Float
        // double - class Double
        // char - class Character
        // у каждого примитива есь соответствующий класс обертки,
        // используют их если использование примитивов невозможно
        // когда надо воспользоваться методами этих классов

        int count = 3421; // примитив
        Integer age = 56; //ссылочный тип, new Integer(56) - устаревший метод

        // автоупаковка и автораспаковка - не работает с массивами
        // автоупаковка
        Integer i = 50342; // Integer i = count;
        // 50342
        // i [value = 50342];

        // автораспаковка
        Double d = 67.9;
        double price = d;
        // price = d.value


        // автоупаковка - Не будет работать если примитив соответсвует классу обертки
        byte byteVar = 1;
        // Integer integerVar = byteVar; ошибка типа данных примитива
        // не соответствует типу данных обертки
        Integer integerVar = (int) byteVar;
        // на автораспаковку данное правило не растространяется

        // сравнение целочисленных значений
        // значения [-127: 128]
        Long first = 45L;
        Long second = 45L;
        System.out.println(first == second); // потому что в диапозоне [-127: 128]
        System.out.println(first.equals(second)); // true потому что equals

        Long third = 200L;
        Long fourth = 200L;
        System.out.println(third == fourth); // false потмоу что ссылочный тип
        System.out.println(third.equals(fourth)); //объекты сравниваем через equals

        Integer a = 78;
        Integer b = 78;
        System.out.println(a.compareTo(b));
        System.out.println(Integer.compare(a, b));

        System.out.println(Integer.hashCode(a)); // hashCode само число 78

        // методы Byte, Short, Integer, Long и тд
        // возвращают примтивы
        System.out.println(a.longValue()); // Value возвращают примити
        System.out.println(a.intValue());

        // преобразованя строки с числом к числу
        //методы статик, поэтому не надо создавать объект
        // parseXXX(строка_с_числом); XXX-тип данных; возвращают примитив
        // valueOf(строка_с_числом); возвращают объект

        long l = Long.parseLong("45");
        System.out.println(l);
        Short s = Short.valueOf("22");
        Float f = Float.valueOf("113.76");
        System.out.println(f);
       // NumberFormatException, если строка содержит не только число

        System.out.println(Integer.max(4,90));
        System.out.println(Integer.min(4,90));
        System.out.println(Integer.sum(6,78));

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.isInfinite(9/0)); // и для дабли и для фло
        System.out.println(Double.isInfinite(9/0));

    }


}

