package day15;

import java.util.*;

public class CheckAnagram {
    public static String sortString(String inputString)
    {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();

        // Sorting temp array using
        Arrays.sort(tempArray);

        // Returning new sorted string
        return new String(tempArray);
    }

    public static boolean checkHashMap(HashMap<String, Integer> map) {
        List<String> keyList = new ArrayList<>(map.keySet());

        for (int i = 0; i < keyList.size(); i++) {
            if (map.get(keyList.get(i)) != 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String a = "Palxndrome";
        String b = "ealindromP";

        System.out.println("Input String : " + a);
        System.out.println("Output String : " + sortString(a));

        System.out.println("Input String : " + b);
        System.out.println("Output String : " + sortString(b));

        String x = sortString(a);
        String y = sortString(b);

        if (x.equals(y)) {
            System.out.println("is Anagram");
        } else {
            System.out.println(" not anagram");
        }
    }
}
