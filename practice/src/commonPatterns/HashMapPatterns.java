package commonPatterns;

import java.util.HashMap;

public class HashMapPatterns {
    public static void main(String[] args) {
        int[] arr = {9,3,5,1,2,7,8,6};
        int[] arr2 = {3,6,8,9,4,3,6};


        // Calculation of freq of elements in an array
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr2.length; i++) {
            int key = arr2[i];
//            int currentCount = map.getOrDefault(key,0);
//            currentCount++;
//            map.put(key, currentCount);
            if(map.containsKey(key)) {
                int currValue = map.get(key); // Take out current value of arr2[i]
                currValue++; // Increment the value
                map.put(key, currValue); // Update the value of arr2[i]
            } else {
                map.put(key, 1);
            }
        }
        System.out.println(map);
        // Element from arr is present in arr2 or not
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
//            System.out.println(key + " : " + map.get(key));
            System.out.println(key + " is present ? " + map.containsKey(key));
        }
// Two sum :
        int sum =12;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int target = sum - arr[i]; // to find element prest in arr2 , so that arr2[j] + arr[i] =12(sum).
            if (map.containsKey(target)) { // if the target element is in arr2, we got 2 elements from arr & arr2 whose sum is equal to 12
                System.out.println(arr[i] + " + " + target);
                count ++ ;
            }
        }

        System.out.println("Count of pairs : "+ count);



    }
}