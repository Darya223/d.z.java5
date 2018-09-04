package org.itstep.qa.lesson;
public class ZadachaThree {
    //Составить программу, которая поменяет местами значения двух переменных и выведет результат до замены и после замены .
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        System.out.println(a);
        System.out.println(b);
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);
    }
}