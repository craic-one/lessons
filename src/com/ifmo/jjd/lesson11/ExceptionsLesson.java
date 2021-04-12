package com.ifmo.jjd.lesson11;

import java.io.IOException;

public class ExceptionsLesson {
    public static void main(String[] args) {
        int a = 33;
        int b = 0;
        // int res = a / b; // java.lang.ArithmeticException: / by zero

        int[] arr = new int[3];
        // arr[100] = 1; // javalang.ArrayIndexOutOfBoundsException: Index 100 out of bounds for length 3

        String string = null;
        // System.out.println(string.equals("exceptions")); //java.lang.NullPointerException

        Object data = "123";
        // Integer integer = (Integer) data; //java.lang.ClassCastException

        // обработка исключений

        Integer integer = null;
        try {
            integer = (Integer) data;
        } catch (ClassCastException e) {
            System.out.println("Обработка ClassCastException");
        }
        // объединение блоков catch
        try {
            if (System.currentTimeMillis() % 2 == 0) integer = (Integer) data;
            else arr[100] = 1;
        } catch (ClassCastException e) {
            System.out.println("Обработка ClassCastException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Обработка ArrayIndexOutOfBoundsException");
        }

        try {
            if (System.currentTimeMillis() % 2 == 0) integer = (Integer) data;
            else arr[100] = 1;
        } catch (ClassCastException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Обработка ClassCastException или ArrayIndexOutOfBoundsException");
        } finally { //идет как дополнение к try catch - необязательный, то что внутри выполнится в любом случае
            // закрытие ресурсов, открытых в try
            System.out.println("закрытие ресурсов, открытых в try");
        }

        try {
            if (System.currentTimeMillis() % 2 == 0) integer = (Integer) data;
            else arr[100] = 1;
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace(); // консольный вывод
            System.out.println("RuntimeException"); // весь блок ошибок таких данных обработка одинаково
        }

        try {
            if (System.currentTimeMillis() % 2 == 0) integer = (Integer) data;
            else arr[100] = 1;
        } catch (ClassCastException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Обработка ClassCastException или ArrayIndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException"); // родительский в самом низу
        }

        withUnCheckedException(34);
        try {
            withCheckedException("some.bin");
        } catch (IOException e) {
            e.printStackTrace();

        }

        Message message= new Message();
        try {
            message.setTitle("Срочное сообщение");
            message.setText("Т");
        } catch (AppException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Ошибка валидации", e);
        }

    }



    public static void withUnCheckedException(int age){ //необрабатываемые, неотслеживаемые
        if (age < 18){
            throw new IllegalArgumentException("age < 18");
        }
        System.out.println("age = " + age);
    }

    public static void withCheckedException(String fileName) throws IOException { // передача ответственности обработки
                                                                                // тому кто вызывает метод
        if (fileName.startsWith("txt")){
            throw new IOException("Ошибка файла");
        }
        System.out.println("fileName = " + fileName);
    }

}
