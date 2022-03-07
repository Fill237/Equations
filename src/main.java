package src;

import java.nio.charset.CharsetEncoder;
import java.time.temporal.ChronoField;
import java.util.Scanner;

public class main {

    private static final Scanner src = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Введите простое уравние вида x-3=4 или х+2=6");
    String str = src.nextLine();
    char[] new_str = str.toCharArray();
//        System.out.println(new_str[0]);
//        System.out.println(new_str[1]);
//        System.out.println(new_str[2]);
//        System.out.println(new_str[3]);
//        System.out.println(new_str[4]);
        if (new_str[0] =='x'){
            int i = Character.getNumericValue(new_str[2]);
            int b = Character.getNumericValue(new_str[4]);
                if (new_str[1] =='-'){
                    System.out.println("Ответ: " + (i + b));
                } else
                    System.out.println("Ответ:" + (b - i));
        }

        if (new_str[2] == 'x'){
            int i = Character.getNumericValue(new_str[0]);
            int b = Character.getNumericValue(new_str[4]);
                if (new_str[1] == '+'){
                    System.out.println("Ответ:" + (b - i));
                } else
                    System.out.println("Ответ:" + (i - b));
        }

        if (new_str[4] == 'x'){
            int i = Character.getNumericValue(new_str[0]);
            int b = Character.getNumericValue(new_str[2]);
                if (new_str[1] == '-'){
                    System.out.println("Ответ:" + (i - b));
                } else
                    System.out.println("Ответ:" + (i + b));
        }

    }
}

/* Напишите программу, которая позволит решить простое уравнение относительно x. Программа принимает на вход строку длиной 5 символов.
   Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
   Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке.
   Нужно найти неизвестное.
        Пример для теста работы программы:
        - Ввод: x+5=7
        - Вывод: 2
        - Ввод: 3-x=9
        - Вывод: -6
        - Ввод: 3-3=x
        - Вывод: 0 */