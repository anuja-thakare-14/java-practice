package basicPrograms;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int sum =0;
//        for(int i = num; i > 0; i = i / 10) {
//            sum =  sum + (i%10
//            );
//        }

        while(num != 0) {
            System.out.println(num % 10);
            sum = sum + (num % 10);
            num =  num / 10;
        }

        System.out.println(sum);

    }
}
