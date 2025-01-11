package stringProblems;
// to count vowels and consonents in a diffrent way:
public class CountVowelCons {
    public static void main(String[] args) {

        String str = "1234";

        int countSmall = 0;
        int countCapital = 0;

        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch >= 'A' && ch <= 'Z'){
                countCapital++;
            } else if (ch >= 'a' && ch <= 'z') {
                countSmall++;
            }
        }
        System.out.println(countCapital);
        System.out.println(countSmall);

        for (char ch = 'A'; ch <= 'Z'; ch++) {
//            char x = (char) (ch + 1);
            System.out.print((char)(ch + 32) + " ");
        }
        System.out.println();
        for (char ch = 'a'; ch <= 'z'; ch++) {
//            char x = (char) (ch + 1);
            System.out.print((char)(ch - 32) + " ");
        }

        System.out.println();

        //New Problem : Convert capital to smaal and small to capital in a string .

        String givenString = "aBcDeFg12345";
        String outputString = "";

        for(int i =0 ; i<givenString.length(); i++){
            char ch = givenString.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                outputString = outputString + (char)(ch+32);
            }
            else
                if(ch >='a' && ch<='z'){
                outputString = outputString + (char)(ch -32);
            }
            else {
                outputString = outputString + ch;
            }
        }
        System.out.println(outputString);

    }
}
