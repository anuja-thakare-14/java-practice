package day6;

public class ReverseArray {
    // Print the array in reverse order
    public static void main(String[] args) {


        int [] arr = new int[5];
         arr[0] = 2;
         arr[1] = 4;
         arr[2] = 6;
         arr[3] = 8;
         arr[4] = 10;

// for looping
        for(int i= arr.length-1; i>0; i--){
            System.out.println(arr[i]); // always - ....println(____[]);
        }
    }
}
