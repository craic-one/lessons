package lesson5;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class StringsLesson {
    public static void main(String[] args) {
        // char 16 бит - символ Unicode
        // от 0 до 65536 от '\u0000 до '\uffff

        char char1 = 'J'; // символ в одинарныз кавычках
        char char2 = 74; // номер символа, отрицательных не бывает
        char char3 = '\u0044'; //шестнадцатиричное представление в escape последовательнсти

        System.out.print(char1); //J
        System.out.print(char2); //J
        System.out.print(char3); //D

        // java.lang.String
        //строки задаются в двойных кавычках: "строка" - ПРИОРИТЕТ
        // либо с использованием одного из конструкторов
        // и оператора new: new String() - этот способ используется только, если создание через "" невозможно

        // СОздание строки из char
        char[] jjdChars = {'\u004A', '\u004A', '\u0044'};
        String jjdString = new String(jjdChars);
        System.out.println(jjdString); // JJD
        jjdString = "\u004A\u004A\u0044";
        System.out.println(jjdString);

        // размер строки
        System.out.println(jjdString.length()); // 3
        System.out.println(jjdString.codePoints().count()); // 3

        char[] frogChars = {'\uD83D', '\uDC38'};
        String frogString = new String(frogChars);
        System.out.println(frogString);
        System.out.println(frogString.length()); //🐸 - 2 -символ Юникода представлен парой charов - это сурогатная пара
        System.out.println(frogString.codePoints().count()); // 1 - этот вернет количество именно символов с экрана

        // Пул строк - хранилище строк cоздаyных через"двойные кавычки" для оптимизации памяти
        String course1 = "Java"; //
        String course2 = "Java"; // объект один, лишь назваие ссылок разное
        String course3 = new String("Java");

        // сравнение ссылок
        System.out.println(course1 == course2); // true
        System.out.println(course1 == course3); // false

        course1 = "Java junior Developer";
        course2 = "Java junior DEVELOPER";

        System.out.println(course1.equals(course2)); // возвращает булевое (true/false) значение, чувствителен к регистру
        System.out.println(course1.equalsIgnoreCase(course2)); // все приводит к одному регистру, потом посимвольное сравнение
        System.out.println(course1.compareTo(course2)); //32 = 101 - 69 сравнивается номера в юникоде и вычитаются на первом несовпадении
        System.out.println(course1.compareToIgnoreCase(course2)); // 0 compareTo возвращают int, 0 если равны
        //помимо 0 можем получить + и -; + если первая строка больше, - если наоборот

        String userData = null;
        String exit = "exit";
        // userData = "exit";
        // ошибка времени выполнения Exception in thread "main" java.lang.NullPointerException
        //System.out.println(userData.equals("exit")); // остановка программы
        System.out.println("exit".equals(userData)); // false

        // вычисление строки во время компиляции
        String name1 = "Строки в Java";
        String name2 = "Строки" + " " + "в" + " " + "Java"; //Строки в Java
        System.out.println(name1 == name2); //true

        // вычисление в момент выполнения
        name1 = "Строки ";
        name2 = "в Java";
        System.out.println(name1 + name2 == name1 + name2); //false если строка собирается через переменные,
        // то это две разхные строки - два разных объекта


        String start = "start"; // + в цикле нельзя использовать, потмоу что создаются новые объекты, что загружает ПК
        for (int i = 0; i < 4; i++) {
            start += " " + i;
        }
        System.out.println(start);

        // StringBuilder - работает быстрее второго, для однопоточных программ
        //StringBuffer - можно использовать если несколько потоков ображщаются к объекту, для многопоточных

        StringBuilder sb = new StringBuilder(); //для объединения из переменных
        sb.append(name1).append(name2);
        String res = sb.toString(); //создание объекта типа java.lang.String
        System.out.println(res);

        sb = new StringBuilder("Start");
        for (int i = 0; i < 4; i++) {
            sb.append(" ").append(i);
        }
        res = sb.toString();
        System.out.println(start);

        String[] animals = {"кот", "пес", "мышь"};
        // создать новый массив, размер которого будет в два раза больше, чем у animals

        String[] newAnimals = new String[animals.length *2];
        //[null, null, null, null, null, null]

        // в цикле заполнить новый массив рандомными значениями из массива animals
        //Math.random()

        for (int i = 0; i < newAnimals.length; i++) {
            newAnimals[i] = animals[(int)(Math.random() * animals.length)];
        }
        System.out.println(Arrays.toString(newAnimals));

        //убрать пробелы: начала, конец строки
        //trim() убирает пространство меньше или равно u0020 - возвращает строку без пробелов
        String someStr = " Строка ";
        someStr = someStr.trim();

        //Java11: убирает любое пространство, например u3000
        //strip() - с двух сторон
        //stripLeading() - с начала строки;
        //stripTrailing - с конца строки;

        // получить массив символов из строки
        char[] formStr = someStr.toCharArray();
        System.out.println(Arrays.toString(formStr));

        // из строки в массив .split
        String names = "Java, Kotlin, Python";
        String[] nameArr = names.split(", ");
        System.out.println(Arrays.toString(nameArr));

        //из массива в строчку .join
        names = String.join("! ", nameArr);
        //name = String.join
        System.out.println(names);




    }
}
