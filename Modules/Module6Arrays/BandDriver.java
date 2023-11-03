package Modules.Module6Arrays;

import java.util.*;

public class BandDriver {
    public static void main(String[] args) {
        ArrayList<BandBooster> bandBoosters = new ArrayList<BandBooster>();
        int choice = 0;
        Scanner scan = new Scanner(System.in);
        while (choice != 5) {
            System.out.println("\n\n\n");
            System.out.println("1. Add BandBooster");
            System.out.println("2. Add Sales");
            System.out.println("3. Print report");
            System.out.println("4. Delete Booster");
            System.out.println("5. Quit");
            System.out.print("> ");
            choice = scan.nextInt();
            scan.nextLine();
            
            if (choice == 1) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                bandBoosters.add(new BandBooster(name));
            } else if (choice == 2) {
                int i = 0;
                for (BandBooster booster: bandBoosters) {
                    System.out.println((i + 1) + ". " + booster);
                    i++;
                }

                System.out.print("Enter the number of the BandBooster you want to add sales to: ");
                int pony = scan.nextInt();

                BandBooster fire = bandBoosters.get(pony - 1);

                System.out.print("\n# of boxes to add: ");

                int boxes = scan.nextInt();
                fire.updateSales(boxes);
            } else if (choice == 3) {
                if (!(bandBoosters.size() == 0)) {                
                int i = 0;
                for (BandBooster booster: bandBoosters) {
                    System.out.println((i + 1) + ". " + booster);
                    i++;
                }
                } else {
                    System.out.println("No band boosters entered.");
                }

                System.out.println("\nPress enter to continue...");
                scan.nextLine();
            } else if (choice == 4) {
                int i = 0;
                for (BandBooster booster: bandBoosters) {
                    System.out.println((i + 1) + ". " + booster);
                    i++;
                }

                System.out.print("Enter the number of the BandBooster you want to delete: ");
                int pony = scan.nextInt();
                bandBoosters.remove(pony - 1);
            } else if (choice == 5) {
                scan.close();
                break;
            } else {
                System.out.println("Please enter a valid choice.");
            }
        }
        scan.close();
    }
}
