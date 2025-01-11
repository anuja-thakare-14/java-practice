package day7;

import java.util.Scanner;

public class ArraySecondOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,4,3,4,6,4};

        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        int print = -1;
        int occurrence = 0;
        for(int i = 0; i<arr.length; i++) {
            if (num == arr[i]){
                System.out.println("Matched");
                print = i;
                occurrence++;
                if (occurrence == 1) {
                    break;
                }
            }
        }

        System.out.println("Occurrence of "+ num + " : "+occurrence);
        if(print == -1){
            System.out.println("Not Matched");
        } else {
            System.out.println("Matched at index " + print);
        }

    }
}
