package basicPrograms;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENter the number : ");
        int num = sc.nextInt();

        float fact = 1;
        for(int i =1; i<=num; i++){
            fact = fact*i;
        }
        System.out.println("The factorial of a number " + num + " is " + fact );
    }
}
