package org.itstep.qa.lesson;
import java.util.Scanner;
public class ZadachaTwo {
    //Пользователь вводит целое число. Если число чётное, то к нему прибавить 2, а если нечётное, то 1. Вывести результат.
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        int a = inn.nextInt();
        if (a % 2 == 0) {
            System.out.println(a + 2);}
            else System.out.println(a + 1);
    }
}