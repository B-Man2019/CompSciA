package Module5Classes;

public class BankDriver {
    public static void main(String[] args) {
        // Build an object of the BankAccount class (calling the constructor)
        BankAccount b1 = new BankAccount(25.15, "Billy");
        b1.getBalance();
        b1.setMoney(27.37);

        BankAccount b2 = new BankAccount(30, "Julie"); 
        b2.setMoney(100);

        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
        System.out.println("Interest rate is: " + BankAccount.INTEREST_RATE);

        b1.setName("Brian");
        b2.setName("Julie");

        System.out.println(b1.toString()); // explicit call to toString
        System.out.println(b2 + "\n"); // toString is called automatically - implicit call
        double interest = b2.calcInterest();
        System.out.println("Interest: " + interest);

        // BankAccount cool = new BankAccount(47.23, "Barney");
        // System.out.println("Original value: \n" + cool.toString() + "\n"); 

        // cool.deposit(100);
        // System.out.println("After deposit: \n" + cool.toString() + "\n");

        
        // System.out.println(cool.withdraw(1000));
        // System.out.println("After withdrawl: \n" + cool.toString() + "\n");
    }
}
