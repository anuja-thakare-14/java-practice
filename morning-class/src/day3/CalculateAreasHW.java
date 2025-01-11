package day3;

import java.util.Scanner;

public class CalculateAreasHW {

    public static int calculateArea(int l, int b) {

        return  l * b;
    }

    public static double calculateArea(double r) {
        return  2*3.14*r;
    }

    public static void main(String[] args) {

        System.out.println("Enter 1 for Area of Rectangle.\nEnter 2 for Area of Circle." );

        Scanner sc = new Scanner(System.in);
        String area = sc.nextLine();

        switch(area){

            case "1" :

                System.out.print("Enter the Length of Rectangle : ");
                int l = sc.nextInt();
                System.out.print("Enter the Breadth of Rectangle : ");
                int b = sc.nextInt();
                System.out.print("Area of Rectangle is : " + calculateArea(l, b));
                break;

            case "2" :

                System.out.print("Enter thr radius of Circle : ");
                double r = sc.nextDouble();
                System.out.print("Area of Circle is : " + calculateArea(r));
                break;

                default :
                    System.out.println("Does Not Exist");

        }

        System.out.println();


    }
}
