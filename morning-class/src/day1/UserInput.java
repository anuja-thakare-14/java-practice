package day1;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        //Take input from user for following types
        /*
            1. Byte
            2. Short
            3. Int
            4. Long
            5. Float
            6. Double
            7. Char
            8. Boolean
         */
       Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Byte:");
//         byte b = sc.nextByte();
//         System.out.println("Byte value b is = " + b);
//
//        System.out.println("Enter Short:");
//        short s = sc.nextShort();
//        System.out.println("Short value s is = " + s);
//
//        System.out.println("Enter Int:");
//        int i = sc.nextInt();
//        System.out.println("Integer value i = " + i);
//
//        System.out.println("Enter Long:");
//        long l = sc.nextLong();
//        System.out.println("Long value l is = " + l);
//
//        System.out.println("Enter Float:");
//        float f = sc.nextFloat();
//        System.out.println("Float value f is = " + f);
//
//        System.out.println("Enter Double:");
//        double d = sc.nextDouble();
//        System.out.println("Double value d is = " + d);
//
//        System.out.println("Enter Char:");
//        char c = sc.next().charAt(0);
//        System.out.println("Char ch value is = " + c);

//        System.out.println("Enter Boolean:");
//        boolean bool = sc.nextBoolean();
//        System.out.println("Boolean value bool is = " + bool);

        System.out.println("Enter String:");
        String str = sc.next();
        System.out.println("String val = " + str);

        // clear buffer
        String emptyString = sc.nextLine();
//        System.out.println("empty string = " + emptyString);


        System.out.println("Enter String1:");
        String str1 = sc.nextLine();
        System.out.println("String1 val = " + str1);
    }
}
