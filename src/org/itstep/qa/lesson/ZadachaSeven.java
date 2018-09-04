package org.itstep.qa.lesson;
import java.util.Scanner;
public class ZadachaSeven {
    //Ввести длину ребра куба. Вывести объем куба и площадь его боковой поверхности.
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        int l = inn.nextInt();
        int v = (l * l * l);
        System.out.println(v + "объём куба");
        int s = 4 * (l * l);
        System.out.println(s + "площадь боковой поверхности куба");
    }
}
