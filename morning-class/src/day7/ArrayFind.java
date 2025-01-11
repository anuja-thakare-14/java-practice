package day7;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class ArrayFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,4,3,4,6,7};

        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        int print = -1;

        for(int i = 0; i<arr.length; i++) {
            if (num == arr[i]){
                System.out.println("Matched");
                print = i;
                break;
            }
        }

        if(print == -1){
            System.out.println("Not Matched");
        } else {
            System.out.println("Matched at index " + print);
        }

    }
}
