package org.itstep.qa.lesson;

public class ZadachaFive {
    //Составить программу вычисления площади треугольника, заданного длинами своих сторон (по формуле Герона).
    public static void main(String[] args) {
        double a = 2;
        double b = 6;
        double c = 5;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        double p = (a + b + c)/2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println(p + "полупериметр треугольника");
        System.out.println(s + "площадь треугольника");
    }
}
