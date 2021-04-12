package com.ifmo.jjd.lesson12.methods;

public class GeneticUtils {
    // public static boolean inArray (String [] arr, String elem) { }
    // public static boolean inArray (int [] arr, int elem) { }

    public static <T> boolean inArray(T[] arr, T elem){ // одинаковая буква значит один тип данных,
                                                        // <T> - обозначение дженерик типа
        //только методы Object
        for (T t : arr) {
            if (t.equals(elem)) return true;
        }
        return false;
    }

    public static <T extends Number,K extends Number> int compareNumberHashCode (T first, K second){ //ограничение только Цифры и его потомки
        //можно вызывать методы которые доступны классу Намбер и Object
        return Integer.compare(first.hashCode(), second.hashCode());

    }

}
