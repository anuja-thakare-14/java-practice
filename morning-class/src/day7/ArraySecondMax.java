package day7;

public class ArraySecondMax {
    public static void main(String[] args) {
        int[] arr = {6,8,5,2,9};

        int max = arr[0];
        int secondMax = arr[0];

//tis for loop is for printing the maximum element of all .
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            } else if(arr[i] < max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        System.out.println("Max Element is : " + max);
        System.out.println("2nd Max Element is : " + secondMax);
    }
}
