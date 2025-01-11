package day4.bank;

public class Person {
    private String name;
    private  int age;
    private String dob;

    public Person(){
        name = "Unknown";
        age = 1;
        dob ="01/01/9999";
    }

    public Person(String name, int age, String dob){
        this.name = name;
        this.age = age;
        this.dob=dob;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getDob(){
        return dob;
    }
    public void setDob(String dob){
        this.dob = dob;
    }

    public void displayPersonInfo() {
        System.out.println("Name : " + this.getName() + " Age : " + this.getAge() + " DOB : " + this.getDob());
    }

}
