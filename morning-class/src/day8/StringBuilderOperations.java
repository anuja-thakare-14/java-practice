package day8;

import java.sql.SQLOutput;

public class StringBuilderOperations {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hi ");
        sb.append("Hello");
        sb.append(" ");
        sb.append("People");
        System.out.println("1. String is : " + sb.toString());
        sb.insert(9, "Beautiful ");
        System.out.println("2. String is : " + sb.toString());
//        StringBuilder  strReturn = sb.replace(3,4,"B");
        StringBuilder  strReturn = sb.replace(9,19,"Exc");
        System.out.println("3. REplaced String : " + strReturn.toString());

        StringBuilder delete  = sb.delete(4,7);
        System.out.println("4. Delete string : " + delete.toString());

        sb.deleteCharAt(8);
        System.out.println("5. DeleteChar : " + sb.toString());

        sb.reverse();
        System.out.println("6. Reverse String : " + sb.toString());

        sb.setCharAt(7, 'Q');
        System.out.println("7. setCharacterr : " + sb.toString());

        char ch = sb.charAt(8);
        System.out.println("8. Rerturn Character -" + sb.charAt(5));

        String sub = sb.substring(3,10);
        System.out.println("9. Substring : " + sub.toString());

        int idx = sb.indexOf("oh");
        System.out.println("10. Index : " + idx);

        int idx1 = sb.lastIndexOf("H");
        System.out.println("11. LastIndex : " + idx1);

    }
}
