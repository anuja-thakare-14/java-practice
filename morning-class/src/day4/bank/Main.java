package day4.bank;

/**
 * I want to store person details like name, dob and some more information that you like
 * Use Person clas to do it
 * Use default constructor, setter, getter to set and display values
 * Use parameterised constructor and getter no setter should be user in the Main class.
 **/
public class Main {

    public static void main(String[] args) {
        Person a = new Person("Anuja", 24, "March 14");
        Person k = new Person("Kunal", 28, "August 9");

        a.displayPersonInfo();
        k.displayPersonInfo();


//        p.setName("Anuja");
//        p.setAge(24);
//        p.setDob("14/03/2000");
//
//        k.setName("Kunal");
//        k.setAge(28);
//        k.setDob("09/08/1997");
    }
}