package day2;

public class SumOfAllEvenNumbers {
    public static void main(String[] args) {
        int evensum = 0;
        int oddsum = 0;
        for (int i = 1; i<=100; i++) {
            if (i % 2 == 0) {
                evensum = evensum + i;
            } else {
                oddsum = oddsum + i;
            }

        }
        System.out.println("even sum is : " + evensum);
        System.out.println("odd sum is : " + oddsum);
    }
}
