package day4.bank;

public class BankAccount {
    private double balance;

    public BankAccount() {
        balance = 0;
    }
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount > 0) {
            balance = balance + amount;
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount) {
        if(amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Balance is insufficient");
        }
    }
}
