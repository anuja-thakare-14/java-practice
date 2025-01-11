package day4.calci;

public class ArithmeticCalculator {
    // Two variables
    // Parametrized constructor - ArithmeticCalculator(int a, int b)
    // methods to return result of operations - printAddition()
    private int a;
    private int b;

    // Write getter and setter

    public ArithmeticCalculator() {
        a = 0;
        b = 1;
    }

    public ArithmeticCalculator(int a, int b) {
        // set a and b
    }

    public void printAddition() {
        System.out.println("Addition of "+a+", "+b+" = "+(a+b));
    }

    // write for substraction and other opertaions
}
