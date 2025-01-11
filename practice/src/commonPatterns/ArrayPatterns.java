package commonPatterns;

public class ArrayPatterns {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,7,3,5,2,1,1};

        // Accessing all elements
        System.out.print("ARRAY is :");

        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // printing even and odd
        System.out.print("EVEN NUMBERS FROM ARRAY : ");
        for(int i =0; i<arr.length; i++){
            if(arr[i] %2==0){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.print("ODD NUMBERS FROM ARRAY : ");
        for(int i = 0; i<arr.length; i++){
            if(arr[i] %2 !=0){
                System.out.print(arr[i] + " ");
            }
        }
        // Finding max and min
        int currentmax =Integer.MIN_VALUE;
        int currentmin = Integer.MAX_VALUE;
        int maxInx = -1;
        int minInx = -1;

        for(int i =0; i<arr.length; i++){
            if(arr[i]>currentmax){
                currentmax = arr[i];
                maxInx = i;
            }
            if(arr[i]<currentmin){
                currentmin = arr[i];
                minInx = i;
            }
        }
        System.out.println();
        System.out.println("Min : " + currentmin);
        System.out.println("MIN At : "+ minInx);
        System.out.println("Max : " + currentmax);
        System.out.println("MAX At : "+ maxInx);

        // Find last occurrence of target
        int target = 2;
        int index = -1;
        for(int i =0; i<arr.length; i++){
            if(arr[i] == target){
                index =i;
            }
        }
        System.out.println("Index of Target " + target+ " is : " + index);

        //Find First occurance :
        target = 8;
        index = -1;
        for(int i =0; i<arr.length; i++){
            if(arr[i] == target){
                index =i;
                break; // for first occurance ,we just need to add break so that it will take first value of element & stops the loop;
            }
        }
        System.out.println("Index of Target " + target+ " is : " + index);
    }
}
