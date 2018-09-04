package org.itstep.qa.lesson;
import java.util.Scanner;
public class ZadachaNine {
    //Ввести катеты прямоугольного треугольника. Вывести его гипотенузу и площадь.
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        System.out.println("введите катеты прямоугольного треугольника");
        double a = inn.nextInt();
        double b = inn.nextInt();
        if (a > 0 & b >0) {
            double c = Math.sqrt((a * a) + (b *b));
            double s = (a * b)/2;
            System.out.println(c + "гипотенуза");
            System.out.println(s + "площадь треугольника");}
            else System.out.println("числа не подходят");
        }
    }
