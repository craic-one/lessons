package lesson1;
//crtl + alt + L - выравнивание
//однострочный комментарий ctrl + /
/* ctrl + shift +/
 многостроный
 комментарий*/
public class FirstLesson {
//    точка входа psvm + Enter
    public static void main(String[] args) {
        //консольный вывод
        //sout + Enter
        System.out.println("консольный вывод");


        //объявление переменных типДанных имяПеременной;
        int count = 98234;
        int lenght = 122, width = 301, height = 501;
        int size, page;
        size = 20;
        page = 6;
        // обращение к переменной происходит по ее имени
        System.out.println(size);

        int bill = 1_000_000; //подчеркивания_ просто разделяют разряды для удобства

        float pi = 3.14f; //чтобы значение не расценивали как double надо поставить в конце f

        long veryBig = 67_000_000_00L; //чтобы числа правильно воспринимались вне диапозона int надо явно ука

        //деление на 0
        //целых чисел приведет к ошибке выполнения:
        //System.out.println(bill / 0);

        //чисел с плавающей точкой Infinity
        System.out.println(pi / 0);

        //Приведение типов
        double price = bill; //автоматическое приведение
        System.out.println(price);

        byte miniPrice = (byte) bill; //явное приведение
        System.out.println(miniPrice);

        byte a = 12 ,b = 90; //арифметические операции над byte и shot дают int
        byte ab = (byte) (a + b); //результат сложение явно привести к типу, то используем скобки для всего

        boolean isActive = false;
        boolean closed = true; //нельзя привести к 1 или 0, простоа фальш и правда

        // Операторы
        height = 9;
        width = 2;

        //взятие остатка % от деления
        System.out.println(height % width); //1

        height = 7;
        width = 4;
        System.out.println(height % width); //3

        height = 8;
        width = 2;
        System.out.println(height % width); //0


        //конкатенация строк
        System.out.println("слово" + "слова");

        //Присваивание (через := было в Паскале - надо забыть)
        height = height * 2; // height *= 2; - идентично
        System.out.println(height);

        width -= height; // уменьшаем width на height и результат присваиваем в width (width = width - height)
        System.out.println(width);

        // Операторы сравнения
        height = 8;
        width = 2;
        boolean res = height != width;
        System.out.println(height != width); //вернет true or false в консоль в виде boolean (true)
        System.out.println(height > width); // true
        System.out.println(height <= width); // false

        //Тернарный оператор ?
        // переменная = логическаое выражение/условие ? выражение1 : выражение2;

        double sum = bill > 1000 ? bill - bill *0.1 : bill;
        System.out.println(sum);

        //
        boolean cancelled = false;
        // || и
        System.out.println(bill > 0 || cancelled); // true

        //&& И
        int start = 3, end = 10;
        System.out.println(start < end && end < 100_000); // true

        // ! НЕ
        System.out.println(!cancelled);
        System.out.println(!(bill > 0 || cancelled)); //false

        // ^ исключающее ИЛИ (xor)
        System.out.println( bill > 0 ^ !cancelled); // false

        //инкремент ++ - увеличивает значение переменной на 1
        //декремент -- - уменьшает значение переменной на 1

        height = 2;
        int result = height++ - ++height + height-- - ++height * ++height + --height;
        // 2 - 4 + 4 -4 * 5 +4 = -14
        // --i сначала изменяет значение, потом возвращает ее значение
        // i-- сначала возвращает значение переменной, потом изменит
        System.out.println(result);


    }
}
