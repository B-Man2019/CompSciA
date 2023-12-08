package Module5Classes;

import java.util.Scanner;

public class BandDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the name of the first band booster: ");
        String name1 = scan.nextLine();

        System.out.println("Enter the name of the second band booster: ");
        String name2 = scan.nextLine();

        System.out.println("Enter the name of the third band booster: ");
        String name3 = scan.nextLine();

        BandBooster p1 = new BandBooster(name1);
        BandBooster p2 = new BandBooster(name2);
        BandBooster p3 = new BandBooster(name3);

        System.out.println("How many weeks do you want to enter?");
        int weeks = scan.nextInt();
        for (int i = 1; i <= weeks; i++) {
            System.out.print("\nEnter the number of boxes sold by " + name1 + " during week " + i + ": ");
            int boxes1 = scan.nextInt();
            p1.updateSales(boxes1);

            System.out.print("\nEnter the number of boxes sold by " + name2 + " during week " + i + ": ");
            int boxes2 = scan.nextInt();
            p2.updateSales(boxes2);

            System.out.print("\nEnter the number of boxes sold by " + name3 + " during week " + i + ": ");
            int boxes3 = scan.nextInt();
            p3.updateSales(boxes3);
        }
        
        System.out.println("\n\nTotals: \n" + p1 + "\n" + p2 + "\n" + p3);
        scan.close();
    }
}
