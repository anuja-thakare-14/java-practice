package stringProblems;
// I am a girl is written. If girl type kela tr tyacha starting index print jhala pahije;

public class StingPractice {
    public static void main(String[] args) {

        String str = "gggxg";
        String pattern = "ggxg";
        int j = 0;
        int i = 0;

        while(i<str.length()){
            if(str.charAt(i) == pattern.charAt(j)){
                j++; // if matched . we want to search for next character of pattern.
            } else{
//                i = 1; // reset i to 1 here... why1 because we stareted from 0 and now we want to start angainn from (0+1)
                // matched pattern till now is gg and j is at index 2 and i is at index 2 we want = i to be  minus by characters matchjed
                i = i -j;
                j = 0; // if not matched we want to search from  start of pattern again.
            }

            //to check if the pattern is completed or nit.
            if(j== pattern.length()){
                System.out.println("Matched");
                break ;
            }

            i++;
        }
    }
}
