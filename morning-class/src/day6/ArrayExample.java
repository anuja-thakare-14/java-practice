package day6;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
//        Integer [] number = new Integer[5];
////         number[0] = 2;
////         number[1] = 4;
////         number[2] = 6;
////         number[3] = 8;
////         number[4] = 10;
//
//        System.out.println(number[0] + " " + number[4]);
//        System.out.println(number.length);
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[5];


        for(int i = 0; i<arr.length; i++){
            // Take input from user
           System.out.println("Enter the number " + (i+1) + " :");
            arr[i] = sc.nextInt();
        }

//        System.out.println(arr[0]);

//        System.out.println();
//        for(int i =0; i<arr.length; i++){
//            arr[i] = arr[i] + 5;
//        }
//
//        for(int i = 0; i<arr.length; i++){
////            if(arr[i]%2 !=0){
////                System.out.print(arr[i]+" ");
////            }
//
//        }

        // Take input from usert what number to seartch in arrat and print index of the number if found
        System.out.print("Enter the number to search : ");
        int searchNum = sc.nextInt();

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == searchNum){
                System.out.println(arr[i]+" at index "+i);
            }

        }

       // Print the array in reverse order - Done

        // Find first and last occurrence of a number in array
        // break;

        // Find maximum from the array
        // Find minimum from the array

        // Find 2nd maximum from array
        // Find 2nd minimum from array

        // find 2nd occurrence of number in an array


    }
}
