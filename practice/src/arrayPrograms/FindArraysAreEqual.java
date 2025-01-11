package arrayPrograms;

import java.util.HashMap;

public class FindArraysAreEqual {
    public static boolean arrayEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for(int i =0; i<arr1.length; i++){
            int target = arr1[i];
            int index =-1;
            for(int j =0; j<arr2.length; j++){
                if(arr2[j] == target){
                    index = j; // because we are finding arr1 values in arr2 so thats why index =j
                }
            }
            // If target is not in arr2 , index will be -1. If index is -1, arr1 not equal to arr2.
            if(index == -1){
//                System.out.println("not equal");
                return false;
            }
        }
        return true;
    }


    public static boolean arrayEqualUsingMap(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <arr2.length; i++) {
            if (map.containsKey(arr2[i])) {
                int currVal = map.get(arr2[i]);
                currVal++;
                map.put(arr2[i], currVal);
            } else {
                map.put(arr2[i],1);
            }
        }

        for(int i =0; i<arr1.length; i++){
            int target = arr1[i];
            if( !map.containsKey(target) ){
//                System.out.println("not equal");
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        int[] arr1 = {1,3,4};
//        int[] arr2 = {4,3,1};

        int[] arr1 = {1,3,4};
        int[] arr2 = {4,2,1};
        if (arrayEqualUsingMap(arr1, arr2))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");


    }
}
