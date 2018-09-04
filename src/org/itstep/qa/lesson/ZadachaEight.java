package org.itstep.qa.lesson;
import java.util.Scanner;
public class ZadachaEight {
    //Ввести два действительных положительных числа. Вывести среднее арифметическое и среднее геометрическое этих чисел.
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        double a;
        double b;
        a = inn.nextInt();
        b = inn.nextInt();
        if (a > 0 & b >0) {
        double c = (a + b) / 2;;
        double d = Math.sqrt(a * b);
        System.out.println(c + "среднее арифметическое этих чисел");
        System.out.println(d + "среднее геометрическое этих чисел");}
        else System.out.println("числа не подходят");
    }
}
