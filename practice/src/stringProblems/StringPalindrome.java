package stringProblems;

public class StringPalindrome {
    public static void main(String[] args) {

        // Method 1 : using StringBuilder
        String orig = "level";
      // String orig = "Level"; -----> not Palindrome cz of capital L.
        StringBuilder sb = new StringBuilder(orig);
        sb.reverse(); // here the string is reversed & stored in sb.
        // as orig is a String & sb is StringBuilder. So to convert StringBuilder to String , we used sb.toString().
        if(sb.toString().equals(orig)){
            System.out.println("Is Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }


        //  Method 2 :- Using String :
        String original = "civic";
        String reversed = "";
        for(int i = original.length() -1; i>=0; i--){
            reversed = reversed + original.charAt(i);
        }

        if(reversed.equals(original)){
            System.out.println("Given String is Palindrome");
        }
        else{
            System.out.println("Given String is not Palindrome");
        }
    }
    public static String reverseString(String original) {
        String reversed = "";
        for(int i = original.length() -1; i>=0; i--){
            reversed = reversed + original.charAt(i);
        }
        return reversed;
    }
}
