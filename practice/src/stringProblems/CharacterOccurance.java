package stringProblems;

import java.util.Locale;

public class CharacterOccurance {

    // Can you convert stgring to lowercase without using inbuild functions
    public static String convertToLowerCase(String givenString) {
        String outputString = "";
        for(int i =0 ; i<givenString.length(); i++){
            char ch = givenString.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                outputString = outputString + (char)(ch+32);
            }
            else {
                outputString = outputString + ch;
            }
        }
        return outputString;
    }

    public static String convertToUpperCase(String givenString) {
        String outputString = "";
        for(int i =0 ; i<givenString.length(); i++){
            char ch = givenString.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                outputString = outputString + (char)(ch-32);
            }
            else {
                outputString = outputString + ch;
            }
        }
        return outputString;
    }



    public static void main(String[] args) {
        String str = "BunalBhaisare";

        str = convertToLowerCase(str);

        char ch = 'b';
        int count = 0;

        for(int i =0; i<str.length(); i++){
             if(str.charAt(i) == ch){
                 count++;
             }
        }
        System.out.println(count);
    }
}
