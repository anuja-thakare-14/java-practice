package arrayPrograms;

import java.util.Scanner;

public class ArrayDivisibleBy2 {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
        int[] arr = {2,6,9,7,4,1};

        int count =0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 2 ==0){
                count = count +1;
                System.out.print(arr[i]);
            }

        }
        System.out.println(count);
    }

}
