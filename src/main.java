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