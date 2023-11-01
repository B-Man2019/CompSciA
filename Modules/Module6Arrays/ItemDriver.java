package Modules.Module6Arrays;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ItemDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 0;
        System.out.println("Welcome to the store! Enter 0 at any time to stop adding items.\n");
        Item[] items = new Item[5];

        while (true) {
            if (i == items.length) {
                items = Arrays.copyOf(items, i + 1); // copyOf just automates making a temp array and "increases" the size of the array
                // from https://www.geeksforgeeks.org/arrays-copyof-in-java-with-examples/
            }
            
            System.out.println("\nItem #" + (i + 1));
            System.out.print("\nName of item: ");
            String name = scan.nextLine();

            if (name.equals("0")) {
                break;
            }

            System.out.print("\nPrice of item: ");
            double price = scan.nextDouble();

            if (price == 0) {
                break;
            }

            System.out.print("\nQuantity of item: ");
            int quantity = scan.nextInt();
            if (quantity == 0) {
                break;
            }
            scan.nextLine();

            items[i] = new Item(name, price, quantity);
            i++;

            double sum = 0;
            System.out.println();
            for (int a = 0; a < items.length; a++) {
                if (items[a] != null) {
                    System.out.println(items[a].toString());
                    sum += items[a].getPrice();
                }
            }
            System.out.println("\nTOTAL: " + NumberFormat.getCurrencyInstance(new Locale("en", "US"))
        .format(sum));
        }

        System.out.println("\n\nPLEASE PAY");

        double sum = 0;
        for (i = 0; i < items.length; i++) {
            if (items[i] != null) {
                sum += items[i].getPrice();
            }
        }
        System.out.println("\nPlease pay " + NumberFormat.getCurrencyInstance(new Locale("en", "US"))
        .format(sum));
    }
}