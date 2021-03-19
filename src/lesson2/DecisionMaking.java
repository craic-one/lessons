package lesson2;

import java.util.Scanner; // alt + enter на имени класса для импорта

public class DecisionMaking {
    public static void main(String[] args) {
        //консольный ввод
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер");
        int userNum = in.nextInt();
        System.out.println(userNum);

        // if
        int state = 0;
        if (state == 0) {
            System.out.println("Закрытие приложения");
        } else if (state == 1) {
            System.out.println("Открытие приложения");
        } else {
            System.out.println("Ошибка статуса");
        }

        int age = 90;
        int exp = 6;
        if (age > 100) {
            System.out.println("Мы вам перезвоним");
        } else if (exp < 5) {
            System.out.println("Вы подходите на должность стажера");
        } else {
            System.out.println("Вы подходите на должнсоть разработчика");
        }

        int sum = 1000, code = 5984;
        //4692 - 30 %
        //7024 , 5984 - 20%
        //1235, 7351, 9835 - 10%

        switch (code) {
            case 4692:
                System.out.println(sum - sum * 0.3);
                break;
            case 7024:
            case 5984:
                System.out.println(sum - sum * 0.2);
                break;
            case 1235:
            case 7351:
            case 9835:
                System.out.println(sum - sum * 0.1);
                break;
            default:
                System.out.println(sum);
        }
        int nomMes = 456;
        switch (nomMes) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Нет такого месяца");
        }
        while (true) {
            System.out.println("Введите число");
            int num = in.nextInt();
            System.out.println(num + 2);
            if (num == 0) break;
        }
        //вывести все четные от start до end
        int start = 1, end = 14;
        while (start <= end) {
            if (start % 2 == 0) System.out.println(start);
            start++;
        }

        //вывести все положительные элементы последовательности от 95 до 0
        for (int num = 95; num > 0; num -= 5)
            System.out.println(num);

        //вывести на экран первые 20 элементов последовательносьт 2 4 6 8
        for (int num = 2, i = 1; i <= 20; i++, num +=2){
            System.out.println(num);
        }
    }
}
