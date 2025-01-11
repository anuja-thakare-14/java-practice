package stringProblems;
// To count Vowel and consonent .

public class StringVowelCons {
    public static void main(String[] args) {
        String str = "Paranormalieu";

        int count = 0;
        int concount =0;
        for(int i =0; i< str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'
                    || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U'){
                count = count +1;
            }
            else{
                concount = concount +1; // to store the count of consonent.
            }
        }
        System.out.println(count);
        System.out.println(concount);

    }

}
