import java.util.Scanner;

public class TwoDFarmMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String menu = "1. Print all crops\n" + 
                    "2. Count acres of a crop\n" + 
                    "3. Change an acre to bad\n" +
                    "4. Check what crops will be harvested in a number of days\n" + 
                    "5. Income per harvest\n" +
                    "6. Total income per crop over a number of days\n" + 
                    "9. Quit"; 
        boolean exit = false;

        System.out.print("How many rows of acres in your farm: ");
        int rows = scan.nextInt();

        System.out.print("How many columns of acres in your farm: ");
        int columns = scan.nextInt();

        Farm farm = new Farm(rows, columns);
        farm.plant();
        while (!exit) {
            System.out.println(menu);
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(farm.toString());
                    break;

                case 2:
                    System.out.println("Corn is planted in " + farm.countCrops() + " acres.");
                    break;

                case 3:
                    farm.setAcreToBad();
                    break;

                case 4:
                    farm.cropsHarvestDays();
                    break;
                
                case 5:
                    farm.cropProfits();
                    break;

                case 6:
                    farm.cropProfitsWithDays();
                    break;
                
                case 9:
                    exit = true;
                    break;
                default:
                    System.out.println("Please enter a valid choice");
                    break;
            }
        }

        scan.close();
    }
}
