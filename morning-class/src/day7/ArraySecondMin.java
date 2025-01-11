package day7;

public class ArraySecondMin {

    public static void main(String[] args) {

        int[] arr = {9,4,3,6,1};
        int min = arr[0];
        int secondMin = arr[0];

        for(int i=0; i<arr.length; i++){

            if(arr[i]<min){
                secondMin = min;
                min = arr[i];
            }
            else if(arr[i]>min && arr[i] <secondMin){
                secondMin = arr[i];
            }
        }
        System.out.println("Min Element : " + min);
        System.out.println("Second Min : " + secondMin);
    }
}
