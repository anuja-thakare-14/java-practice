package day2;

//Write a simple program that prints all numbers divisible by 3 between 1 and 20.
public class DivisibleByThree {
    public static void main(String[] args) {
        for(int i =1; i<=20; i++){
            if(i%3==0){
                System.out.println(i);
            }
        }
        return;
    }
}
