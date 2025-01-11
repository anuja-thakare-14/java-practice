package day8;

public class StringOperations {
    public static void main(String[] args) {

        //initialization of String.
        String str = "Minimum";

        //to find length of String
        System.out.println(str.length());

        // to find character in the string.
        System.out.println(str.charAt(2));

        // to replace a character from string :
        System.out.println(str.replace('M','S')); // replaced O char with A.
        //What if i want to replace

        // to replace all characters from string:
        System.out.println(str.replaceAll("i","x")); // replacing all i to x from string.

        // defining substring :
//        System.out.println(str.substring(start, end));
        System.out.println(str.substring(0,3)); // here we can start and end from any char. Depends upon our requirement.
        //OR
        System.out.println(str.substring(2)); // can be written like this also.

        // defining index of Characters :
        System.out.println(str.indexOf('u'));

        System.out.println();

        String str1 = "Anuja";
        String str2 = "Anuja";
        String str3 = "Anu";
        str3 = str3.concat("ja")
        ;


        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        System.out.println();

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));
        System.out.println();
        System.out.println(str3.equals(str1));
        System.out.println(str3.equals(str2));


        System.out.println();

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str2.equalsIgnoreCase(str3));
        System.out.println();
        System.out.println(str3.equalsIgnoreCase(str1));
        System.out.println(str3.equalsIgnoreCase(str2));;
    }
}
