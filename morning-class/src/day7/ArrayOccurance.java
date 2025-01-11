package day7;

public class ArrayOccurance {
//    public static void main(String[] args) {
//        int[] arr = {2,3,4,3,1};
//        int[] hash = new int[100]; //Values from Array is an Index for Hash.
//
//        // To cal occurance , iterate an array;
//        for(int i =0; i<arr.length; i++){
//            hash[arr[i]]++; //increment the occurance of array of i.
//        }
//        //print occurances . for that iterte hash.
//        for(int i =0; i < hash.length; i++){
//            if(hash[i] > 0)
//                System.out.println("Occurance of "+i+" :" + hash[i]);
//        }
//    }

    public static void main(String[] args) {
        int[] arr = {2,9 ,9,4,2,2,2};
        int[] hash = new int[100];

        for(int i =0; i<arr.length;i++){
            hash[arr[i]]++;
        }

        for(int i=0; i<hash.length; i++){
            if(hash[i]>0){
                System.out.println("Ocurance of " + i +" is : " + hash[i]);
            }
        }
    }
}
