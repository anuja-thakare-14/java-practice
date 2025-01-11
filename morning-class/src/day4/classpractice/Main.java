package day4.classpractice;

public class Main {
    public static void main(String[] args) {
        // create an object of class
        // Scanner sc = new Scanner(System.in);

        ClassA c = new ClassA();

        System.out.println(c.getVar1());
        // setting var1 of c to 5
        c.setVar1(5);
        // after setting value
        System.out.println(c.getVar1());

    }
}
