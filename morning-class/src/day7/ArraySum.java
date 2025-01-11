package day7;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {3,2,4,1};
// for addition:
        int sum =0; //for declaring the initial value.

        for(int i = 0; i<arr.length; i++){
            sum = sum +arr[i];
        }
        System.out.println("Sum of Array is : " + sum);

// for multiplication:

        int mul = 1;
        for(int i = 0; i<arr.length; i++){
            mul = mul * arr[i];
        }
        System.out.println("Product of Array is : " + mul);
    }
}
