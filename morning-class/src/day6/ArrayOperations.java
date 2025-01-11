package day6;

public class ArrayOperations {
    public static int findMax(int a, int b){
        if(a>b){
            return a;
        }
        else if(b>a){
            return b;
        }

        return a;
    }

    public static void main(String[] args) {
//        currMax = number[0];
//        number[0] = 2; -> currMax = findMax(currMax, number[0]); ->> currMax = 2
//        number[1] = 4; -> currMax = findMax(currMax, number[1]); ->> currMax = 4
//        number[2] = 6;
//        number[3] = 8;
//        number[4] = 10;
//        print currMax as solution;
    }
}
