package stringProblems;

public class RemoveWhitespaces {
    public static String removeSpace(String str) {
        String result = ""; // to store the end result
        for(int i = 0 ; i <str.length(); i++){
            if (str.charAt(i) != ' ') {
                result = result + str.charAt(i);
            }
        }
        return result;
    }

    public static String removeChar(String str, char ch) {
        String result = ""; // to store the end result
        for(int i = 0 ; i <str.length(); i++){
            if (str.charAt(i) != ch) {
                result = result + str.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "I am a good girl";

//        String result = ""; // to store the end result
//        for(int i = 0 ; i <str.length(); i++){
//            if (str.charAt(i) != ' ') {
//                result = result + str.charAt(i);
//            }
//        }
//        System.out.println(result);
        // by stingBuilder will be very hard . so do with String...
        System.out.println(removeSpace(str));
        System.out.println(removeChar(str, ' '));



    }
}
