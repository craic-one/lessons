package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysLesson {
    public static void main(String[] args) {
        System.out.println("Массивы");

        //элементы массива типа int
        int len = 10;
        int[] ints = new int[len]; //[] - это обозначение массива, ints - название массива,
        // [длинна массива, возможно извне через переменную выше]
        int[] ints1 = new int[4];
        int[] ins2 = new int[len + 2];
        int[] ints3 = {12, 67, -90, 1421, 6832, 0}; //длинна высчитывается автоматически
        ints3 = new int[]{89, 12, -9}; //это безымянный массив, для переписания элементов массива

        //вывод массива в консоль
//        System.out.println(ints3); //так не работает, это хэш-код массива, сборщик все потрет
        System.out.println(Arrays.toString(ints3)); // "89" + "12" + "-9" склеивает все элементы массива

        //доступ к элементам массива
        int elem = ints3[1]; //[указываем номер индекса, которых хотим получить] можно через выражение как с длинной
        System.out.println(elem); // выведет 12

        ints3[0] = 13009; //присваеваем другое значение элементу в массиве
        System.out.println(Arrays.toString(ints3));

        //обращение к несуществующему элементу массива
        //java.lang.ArrayIndexOutOfBoundsException - частая ошибка, обнаружить можно только при выполнении
        //System.out.println(ints3[10]);

        //объявление многомерных массивов - "элементы массива - другие массивы"
        int[][] ints4 = new int[3][4]; // внутри ТРЕХ массивов, массивы по ЧЕТЫРЕ элемента - размер статичен
        //[[0,0,0,0], [0,0,90,0], [0,0,0,-4021]]
        //пример доступа к элементам ногомерного массива
        ints4[1][2] = 90; //внесли значение 90 в массив
        ints4[2][3] = -4021;
        //вывод в консоль многомерного массива
        System.out.println(Arrays.deepToString(ints4));

        int[][] ints5 = new int[4][]; // размер вложенных массивов может отличаться
        //[null, null, null, null]
        ints5[0] = new int[1]; //[[0], null, null, null]
        ints5[1] = new int[2]; //[[0], [0, 0], null, null]
        ints5[2] = new int[3]; //[[0], [0, 0], [0, 0, 0], null]
        ints5[3] = new int[4]; //[[0], [0, 0], [0, 0, 0], [0, 0, 0, 0]]
        ints5[2][0] = 991; //присоведение значения вложенному масиву
        System.out.println(Arrays.deepToString(ints5));

        // ==
        // ints5[0] == null - проверка на наличие элементов в массиве

        //перебор элементов массивов
        int[] ints6 = {45, 90, 1, -32, 100};

        //цикл for - позволяет изменить значение элементов массива - fori - hot-key
        //fori + enter
        //length - тут хранится размер массива, который мы хотим узнать, только чтение размера массива
        for (int i = 0; i < ints6.length; i++) {
            ints6[i] += 10; //увеличили все значения массива на 10
        }
        System.out.println(Arrays.toString(ints6));

        //foreach не имеет доступа к индексам, не позволяет изменить значение элементов массива
        //можем прочитать, выполнить инструкции, НО не менять
        //iter int [] ints6 = {55, 100, 11, -22, 110}
        for (int arrElem : ints6) {
            //ints6 - что мы перебираем
            // при каждой итерации в arrElem копируется значение элемента
            System.out.println(arrElem);

        }
        //объявить массив типа double на 7 элементов
        //заполнить его в цикле рандомными значениями (3, 100)
        //найти минимальное знгачение в массиве - double min = Double.MIN_VALUE or max
        //Math.random() * 97 + 3

        double min = Double.MIN_VALUE;
        double max = Double.MAX_VALUE;


        double[] ints7 = new double[7];
        for (int i = 0; i < ints7.length; i++) {
            ints7[i] = Math.random() * 97 + 3;
            if (ints7[i] < max) max = ints7[i];
        }
        System.out.println(Arrays.toString(ints7));
        System.out.println("Минимальное значение в массиве: " + max);

        int[] ints8 = {90, 12, 67, -100, 56, 32};

        //foreach
        // найти сумму значений элементов массива foreach
        int a = 0;
        for (int i : ints8) {
            a = a + i; // a +=i
        }
        System.out.println(a);

        //for
        //если значение элемента массива попадает
        //в диапазон (12, 60), то меняем это значение
        // на значение по умолчанию (for)
        for (int i = 0; i < ints8.length; i++) {
            if (ints8[i] > 12 && ints8[i] < 60) ints8[i] = 0;
        }
        System.out.println(Arrays.toString(ints8));

        //binarySearch(int[] a, int key)
        //Arrays.binarySearch(ints, 23);

        //сравнение массивов
        int[] b = {34, 78, 10};
        int[] c = {34, 78, 10};
        System.out.println(b == c); //false
        System.out.println(b.equals(c)); //false идентично ==
        System.out.println(Arrays.equals(b,c)); //true

        // сортировка массива
        //алгоритм быстрой сортировки - почитать, чтобы воткнуть в голове
        Arrays.sort(b);
        Arrays.parallelSort(b); //для гигантских массиовов
        System.out.println(Arrays.toString(b));

        // копирование массива
        b = new int[]{34 ,90 ,-1};
        int[] newInt = b; //создание дополнительной ссылки

        int[] cloneArr = b.clone(); //создание ПОЛНОЙ копии массива

        int[] copyArr = new int[10];
        //из которого массива копируем , с какого элемента копируем, КУДА копируем, с какой позиции, сколько копируеем
        System.arraycopy(b,1, copyArr, 4, 2); //необходимо два массива, откуда и куда копируем,
                                                                // второй создать руками
        System.out.println(Arrays.toString(copyArr)); //[0, 0, 0, 0, 90, -1, 0, 0, 0, 0]

        //Arrays.copyOf()

        b = new int[]{34, 90, -1, 200, -12};

        //метод бинарного поиска в массиве
        //алгоритм бинарного поиска - почитать!!!!
        Arrays.sort(b); //для корректного поиска в массиве нужна сортировка [-12, -1, 34, 90, 200]
        int res = Arrays.binarySearch(b, -1); //вернет индекс этого элемента 1
        System.out.println(res);
        res = Arrays.binarySearch(b, 35); //-4 - если результат отрицательный, то его нет в массиве (3+1(его возможное место)
        System.out.println(res);



    }
}
