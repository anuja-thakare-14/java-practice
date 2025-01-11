package day16;
//Find all the repeating elements in a given array:

public class FindRepeatingElementsInArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,3,4,4,4};
//        int count =0;
//        int duplicate=1;

        for(int i =0 ; i<arr.length-1; i++){
            for(int j =i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
//                    count = count+1;
//                    duplicate(i) = arr[i];
                   // duplicate[count++] = arr[i];
                }
            }
        }

    }
}
