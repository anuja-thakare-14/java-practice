package day3;

import java.util.Scanner;

public class AddNum {

    public static int addNumber(int a, int b) {
        return a + b;
    }

    public static double addNumber(double a, double b) {
        return a + b;
    }

    public static float addNumber(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int a = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int b = sc.nextInt();

        int sum = addNumber(a, b);
        System.out.println(sum);

        System.out.println("Enter number 1 : ");
        double c = sc.nextDouble();
        System.out.println("Enter number 2 : ");
        double d = sc.nextDouble();
        double sumd = addNumber(c, d);
        System.out.println(sumd);

        System.out.println("Enter number 1 : ");
        float e = sc.nextFloat();
        System.out.println("Enter number 2 : ");
        float f = sc.nextFloat();

        float sumf = addNumber(e, f);
        System.out.println(sumf);
    }
}
