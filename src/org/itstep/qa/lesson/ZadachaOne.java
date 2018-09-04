package org.itstep.qa.lesson;
import java.util.Scanner;
public class ZadachaOne {
    //Составить программу для ввода с консоли возраста человека и вывода на консоль строки вида: «Вам NN лет».
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        int n = inn.nextInt();
        if (n > 0) {
            System.out.println("Вам" +n+ "лет");}
        else System.out.println("значение введено не верно");
        }
    }


