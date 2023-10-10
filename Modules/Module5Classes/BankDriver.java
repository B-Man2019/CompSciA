package Modules.Module5Classes;

public class BankDriver {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.setMoney(27.37);

        BankAccount b2 = new BankAccount();
        b2.setMoney(100);

        b1.setName("Brian");
        b2.setName("Julie");

        System.out.println(b1.toString());
        System.out.println(b2.toString() + "\n");

        BankAccount cool = new BankAccount(47.23, "Barney");
        System.out.println("Original value: \n" + cool.toString() + "\n"); 

        cool.deposit(100);
        System.out.println("After deposit: \n" + cool.toString() + "\n");

        
        System.out.println(cool.withdrawl(1000));
        System.out.println("After withdrawl: \n" + cool.toString() + "\n");
    }
}
