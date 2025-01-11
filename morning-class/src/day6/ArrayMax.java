package day6;

public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = {5,9,4,2,1};
        int max = arr[0]; // arr[0] is for first element. mens it will start from index 0.

        for(int i =1; i <arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum Value : " + max);
    }
}
