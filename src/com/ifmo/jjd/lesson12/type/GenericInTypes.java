package com.ifmo.jjd.lesson12.type;

public class GenericInTypes {
    public static void main(String[] args) {
        User<String> stringUser = new User<>("wqw12","qwerty","123");
        //указав тип данных Стринг мы получаем его свойства
        System.out.println(stringUser.getId().length());

        User<Integer> integerUser = new User<>(1111,"zzz", "12344");
        System.out.println(integerUser.getId().doubleValue());

        //PairContainer<T, K>
        PairContainer<String, Integer> container1 = new PairContainer<>("key",122);
        System.out.println(container1.getKey().compareTo("key1"));
        System.out.println(container1.getValue().byteValue());

        PairContainer<Double, User> container2 = new PairContainer<>(12.1, stringUser);
        // container2.getValue().getId(); //вернет Object потмоу что строкой выше мы ничего не указали
        container2.getValue().setId("123");
        container2.getValue().setId(234);
        container2.getValue().getId(); // Object

        PairContainer<Double, User<Integer>> container3 = new PairContainer<>(1.1, integerUser);
        container3.getValue().setId(2);
        System.out.println(container3.getValue().getId()); // id - Integer
    }
}
