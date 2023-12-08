package Module5Classes;

public class BankAccount {
    // Variable Fields
    private double money;
    private String name;
    // Static variables
    public static final double INTEREST_RATE = .05; // Final variable - cannot change/mutate
    private static int totalAccounts = 0;

    public BankAccount() {
        money = 0;
        name = "John Doe";
        totalAccounts++;
    }

    // Constructors
    public BankAccount(double blah, String ha) {
        money = blah;
        name = ha;
        totalAccounts++;    
    }

    public double calcInterest() {
        return money * INTEREST_RATE;
    }

    // Methods
    public void deposit(double amount) {
        money += amount;
    }

    public String withdraw(double amount) {
        if (amount <= money) {
            money -= amount;
            roundMoney();
            return "Withdraw complete.";
        } else {
            return "Withdraw failed.";
        }
    }

    // accessor methods - get variables
    public static int getTotalAccounts() { // class/static method
        return totalAccounts;
    }

    public double getBalance() {
        return money;
    }

    public String getName() {
        return name;
    }

    // modifier/mutator methods - set variables
    public void setMoney(double mon) {
        money = mon;    
    }

    public void setName(String n) {
        name = n;
    }

    // Support method
    private void roundMoney() {
        money = (int)(Math.round(money * 100)) / 100.0;
    }

    public void transfer(double amt, BankAccount acc) {
        this.withdraw(amt);
        acc.deposit(amt);
    }

    // Very special method that every class should have
    // If no toString method, one is provided for you
    public String toString() {
        return "Name: " + name + "\nMoney: " + money;
    }
}