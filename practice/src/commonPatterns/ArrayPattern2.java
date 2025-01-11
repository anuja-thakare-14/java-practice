package commonPatterns;

public class ArrayPattern2 {
    public static int findNumber(int target, int[] arr) {
        int index = -1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == target) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {9,3,5,1,2,7,8,6};
        int[] arr2 = {3,6,8,9,4};
        // Print index of array elements of array1 in array 2, if element is not found print -1

        for (int i = 0; i < arr.length; i++) {
            int target = arr[i]; // target is value to search in arr2[]. Here we are taking arr[i] that we will search in arr2
            int index = -1; // This is same as finding index of target in an array.
            for(int j=0;j<arr2.length;j++) {
                if(arr2[j] == target) {
                    index = j;
                }
            }
            System.out.println(target + " at index : "+index); //print the index of target , if not found -1 will be printed.
        }

        System.out.println("---------------------------------------------------------");

        //Find if an element is repeated in same array :
        for (int i = 0; i < arr.length; i++) {
            int target = arr[i];
            int index = -1;
            // int j = i+1 --------> it means ki arr me j jo hai vo 1 value chod kar uske next se chalu karega;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[j] == target) {
                    index = j;
                    break; // we got the first occurance , that means we dont want to go till end of the aray , thats why break.
                }
            }
            System.out.println(target + " at index : "+index);
        }

        System.out.println("---------------------------------------------------------");

        //Find the elements from arr2 jiski sum hogi target:
        int sum =12;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int target = sum - arr[i]; // to find element prest in arr2 , so that arr2[j] + arr[i] =12(sum).
            int index = -1;
            for(int j=0;j<arr2.length;j++) {
                if(arr2[j] == target) {
                    index = j;
                    break;
                }
            }
            if (index != -1) { // if the target element is in arr2, we got 2 elements from arr & arr2 whose sum is equal to 12
                System.out.println(arr[i] + " + " + target + " at index : " + index);
                count ++ ;
            }
        }

        System.out.println("Count of pairs : "+ count);

    }
}
