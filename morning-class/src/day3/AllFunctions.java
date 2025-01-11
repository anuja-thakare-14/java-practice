package day3;

import java.util.Scanner;

public class AllFunctions {
    // for 2 comparision : Add , Sub, Mutip, Div.
    // for 1 no : even/odd, prime or not, positive/-ve/Zero

    public static void operators(int n1, int n2){
        
    }

    // evenOdd:
    public static void  evenOdd(int e){
        if(e%2==0){
            System.out.println("Given number is Even.");
        }
        else{
            System.out.println("Given number is Odd.");
        }
    }

    // checkPrime:
    public static boolean checkPrime(int num) {

        if(num<=1){
            return false;
        }

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    //checkNumber:
    public static void checkNumber(double a){
        if(a<0){
            System.out.println("Given number is Negative");
        }
        else if(a>0){
            System.out.println("Given number is Positive");
        }
        else if(a==0){
            System.out.println("Given number is Zero");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("i) To check Even/Odd - Enter 1\nii) To check Prime or not - Enter 2\niii) To check +ve/-ve?Zero - Enter 3 \n");
        String choice = sc.nextLine();

        switch(choice){

            // evenodd.
            case "1" :
                System.out.print("Enter the Number : ");
                int e = sc.nextInt();
                evenOdd(e);
                break;

             // checkPrime
            case "2" :
                System.out.print("Enter the Number : ");
                int num = sc.nextInt();

                // why checkPrime??
                if(checkPrime(num)){
                    System.out.println(num + " is a Prime number");
                }
                else{
                    System.out.println(num + " is not a Prime Number");
                }
                break;

            case "3" :

                System.out.println("Enter the number : ");
                double a = sc.nextDouble();
                checkNumber(a);
                break;
        }

    }
}
