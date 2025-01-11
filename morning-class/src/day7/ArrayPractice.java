package day7;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] arr = {2,5,3,6,7,9};
//
//        for(int i=0; i <arr.length ; i ++){
//            System.out.println(arr[i]);
//        }


        //Reverse printing
//        for(int i = arr.length-1; i>=0; i--){
//            System.out.println(arr[i]);
//        }

        for(int i=0; i<arr.length; i++){
            int cind = arr.length-(i+1); // for reverse array without reversing for loop.
            System.out.println(arr[cind]);
        }
    }
}
