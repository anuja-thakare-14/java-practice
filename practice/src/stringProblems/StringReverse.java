package stringProblems;

public class StringReverse {
    public static void main(String[] args){

        //Method 1 : to use reverse() with string builder.
        String givestring = "String";
        String reverseString = new StringBuilder(givestring).reverse().toString();
        System.out.println("Reversed String by Method1 = " + reverseString);

        //Method 2 : to use reverse() after string builder.
        String str1 = "Poision";
        StringBuilder sb = new StringBuilder(str1);
        sb.reverse();
        System.out.println( "Rev String by Method2 = " + sb.toString());

        //Method 3 : using without StringBuilder. Using for loop.
        String str2 = "Valu able";
        String reversed = "";
        for(int i=str2.length()-1; i>=0; i--){
            reversed = reversed + str2.charAt(i);
        }
        System.out.println("Method 3 , Using String = " + reversed);

    }
}
