package day8;

public class StringReverse {
    public static void main(String[] args) {

        String name = "Anuja";

        String sum = " ";
        for(int i = 0; i<name.length(); i++){
            sum = sum + name.charAt(i);
        }
        System.out.println(sum);

        //REversing an StringArray.

        String sum2 = " ";
        for(int i = name.length()-1; i>=0; i--){
            sum2 = sum2 + name.charAt(i);
        }
        System.out.println(sum2);
    }
}
// WE can directly print like : sout(name.charAt(i));