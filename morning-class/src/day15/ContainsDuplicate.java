package day15;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ContainsDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.addAll(List.of(1, 2, 3, 4));

        if(containsDuplicate(arr)){
            System.out.println("DUplicate is there");
        }
        else{
            System.out.println("Duplicate is not there");
        }
    }

    private static boolean containsDuplicate(ArrayList<Integer> arr) {
        for(int i =0;i<arr.size(); i++){
            for(int j =i+1 ;j<arr.size();j++){
                if(arr.get(i) == arr.get(j)){
                    return true;
                }
            }
        }
        return false;
    }

    // O(N) solution using Hashmap
    public static boolean containsDuplicate(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                return true;
            }
            else{
                map.put(arr[i], 1);
            }
        }
        return false;
    }
}
