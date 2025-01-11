package day6;

public class ArrayMin {
    public static void main(String[] args){
        int[] arr = {2,9,5,1,4,7};
        int min = arr[0];

        for(int i =1; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];// we wrote this to update the minimum value whenever we find a minimum no. in array;
            }
        }
        System.out.println("Minimum Value : " + min);
    }
}
