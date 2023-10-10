package Modules.Module5Classes;

public class BankAccount {
    // Variable Fields
    private double money;
    private String name;

    // Methods
    public BankAccount() {
        money = 0;
        name = "John Doe";
    } // Default Constructor

    public BankAccount(double m, String n) {
        money = m;
        name = n;
    }

    public void deposit(double amount) {
        money += amount;
    }

    public String withdrawl(double amount) {
        if (amount <= money) {
            money -= amount;
            return "Withdrawl complete.";
        } else {
            return "Withdrawl failed.";
        }
    }

    // accessor method - get variables
    public double getBalance() {
        return money;
    }

    public String getName() {
        return name;
    }

    // mutator methods - set variables
    public void setMoney(double mon) {
        money = mon;    
    }

    public void setName(String n) {
        name = n;
    }

    public String toString() {
        return "Name: " + name + "\nMoney: " + money;
    }
}