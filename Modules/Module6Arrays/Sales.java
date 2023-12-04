

// ****************************************************************
// Sales.java
//
// Reads in and stores sales for each of x salespeople.  Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ****************************************************************
import java.util.*;

public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many salespersons do you want to enter? ");
        int len = scan.nextInt();

        final int SALESPEOPLE = len;
        int[] sales = new int[SALESPEOPLE]; // array of ints (1 per each salesperson)
        int sum;

        for (int i=0; i<sales.length; i++) // inputting sales per each person
        {
            System.out.print("Enter sales for salesperson " + i + ": ");
            sales[i] = scan.nextInt();
        }

        System.out.println("\nSalesperson   Sales"); // print out formatted sales 
        System.out.println("--------------------");

        sum = 0;
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        
        for (int i=0; i<sales.length; i++)
        {
            System.out.println("     " + i + "         " + sales[i]); 
            sum += sales[i];

            if (sales[i] > max) {
                max = sales[i];
                maxIndex = i;
            }
            if (sales[i] < min) {
                min = sales[i];
                minIndex = i;
            }
        }

        System.out.println("\nTotal sales: $" + sum);
        System.out.println("Average sales: $" + (sum / sales.length));
        System.out.println("Salesperson " + maxIndex + " had the highest sale with $" + sales[maxIndex]);
        System.out.println("Salesperson " + minIndex + " had the lowest sale with $" + sales[minIndex]);

        System.out.print("Enter the threshold for the sales: ");
        int threshold = scan.nextInt();
        int numExceeded = 0;
        System.out.println("\nSalesperson   Sales"); // print out formatted sales 
        System.out.println("--------------------");

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > threshold) {
                numExceeded++;
                System.out.println("     " + i + "         " + sales[i]);
            }
        }
        System.out.println(numExceeded + " people exceeded the threshold of $" + threshold);
        scan.close();
    }
}







