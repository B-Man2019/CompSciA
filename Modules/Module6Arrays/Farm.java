import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Farm {
    Scanner scan = new Scanner(System.in);

    // format money stuff
    Locale locale = new Locale.Builder().setLanguage("en").setRegion("US").build();
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

    Acre[][] acres;

    // Make main menu
    String menu = "1. Corn\n" +
                "2. Potatoes\n" + 
                "3. Soybeans\n" + 
                "4. Wheat\n" +
                "5. Tree Nuts\n" +
                "0. Not an area we can grow crops\n";

    public Farm(int rows, int columns) {
        acres = new Acre[rows][columns];
    }

    // *****************************************
    // PURPOSE:
    // Outputs a menu and takes in input for
    // which crops to plant where
    // *****************************************

    public void plant() {


        System.out.print(menu);
        // Read in all crops
        for (int r = 0; r < acres.length; r++) {
            for (int c = 0; c < acres[0].length; c++) {
                boolean validAnswer = false;
                System.out.print("What would you like to grow in row " + (r + 1) + ", column " + (c + 1) + ": ");
                int choice = scan.nextInt();
                // display menu
                while (!validAnswer) {
                    switch (choice) {
                        case 1: // corn
                            acres[r][c] = new Acre(
                                "Corn", 
                                153, 
                                103, 
                                60, 
                                true
                            );
                            validAnswer = true;
                            break;
                        
                        case 2: // potatoes
                            acres[r][c] = new Acre(
                                "Potatoes",
                                485,
                                336,
                                70,
                                true
                            );
                            validAnswer = true;
                            break;
                        
                        case 3: // soybeans
                            acres[r][c] = new Acre(
                                "Soybeans",
                                485,
                                336,
                                70,
                                true
                            );
                            validAnswer = true;
                            break;

                        case 4: // wheat
                            acres[r][c] = new Acre(
                                "Wheat",
                                827,
                                170,
                                240,
                                true
                            );
                            validAnswer = true;
                            break;
                        
                        case 5: // tree nuts
                            acres[r][c] = new Acre(
                                "Tree Nuts",
                                7200,
                                5800,
                                365,
                                true
                            );
                            validAnswer = true;
                            break;
                        case 0: // nothing
                            acres[r][c] = new Acre();
                            validAnswer = true;
                            break;

                        default:
                            System.out.println("Please choose a valid choice.");
                            System.out.print("> ");
                            choice = scan.nextInt();
                            
                    }
                }
            }
        }
    }

    // *****************************************
    // PURPOSE:
    // Takes user input and counts the # of crop
    // specified by the user
    // *****************************************
    public int countCrops() {
        boolean valid = false;
        String crop = "";
        int count = 0;

        while (!valid) {
            System.out.print(menu);
            System.out.print("\n\nWhich crop would you like to count: ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    valid = true;
                    crop = "corn";
                    break;
                
                case 2:
                    valid = true;
                    crop = "potatoes";
                    break;

                case 3:
                    valid = true;
                    crop = "soybeans";
                    break;
                
                case 4:
                    valid = true;
                    crop = "wheat";
                    break;

                case 5:
                    valid = true;
                    crop = "tree nuts";
                    break;
                
                case 0:
                    valid = true;
                    crop = "no crops";
                    break;
                default:
                    System.out.println("Enter a valid choice.");
                    break;
            }

            for (int r = 0; r < acres.length; r++) {
                for (int c = 0; c < acres[0].length; c++) {
                    if (acres[r][c].getCrop().toLowerCase().equals(crop)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    // *****************************************
    // PURPOSE:
    // Takes input from user and changes the 
    // specified acre to bad
    // *****************************************

    public void setAcreToBad() {
        System.out.println(toString());
        System.out.println("Which row went bad?");

        System.out.print("Row: ");
        int row = scan.nextInt();

        System.out.print("Column: ");
        int column = scan.nextInt();
        
        acres[row - 1][column - 1].setBad();
    }

    // *****************************************
    // PURPOSE:
    // Takes input from user and prints what 
    // crops will harvest in x days
    // *****************************************

    public void cropsHarvestDays() {
        System.out.print("How many days: ");
        int days = scan.nextInt();

        for (int r = 0; r < acres.length; r++) {
            for (int c = 0; c < acres[0].length; c++) {
                boolean harvestable = acres[r][c].enoughDays(days);
                System.out.print("Row: " + (r + 1) + " Column: " + (c + 1) + "\t");
                if (harvestable) {
                    System.out.print(acres[r][c].getCrop() + " will harvest in " + days + " days.\n");
                } else {
                    System.out.print(acres[r][c].getCrop() + " will NOT harvest in " + days + " days.\n");
                }
            }
        }
    }
    
    // *****************************************
    // PURPOSE:
    // Prints out all of the crops and 
    // how much money they will each make
    // *****************************************

    public void cropProfits() {
        for (int r = 0; r < acres.length; r++) {
            for (int c = 0; c < acres[0].length; c++) {
                System.out.print("Row: " + (r + 1) + " Column: " + (c + 1) + "\t");
                System.out.print(acres[r][c].getCrop() + " will make " + currencyFormatter.format(acres[r][c].income())+ "\n");
            }
        }
    }

    public void cropProfitsWithDays() {
        System.out.print("How many days: ");
        int days = scan.nextInt();

        for (int r = 0; r < acres.length; r++) {
            for (int c = 0; c < acres[0].length; c++) {
                System.out.print("\t" + acres[r][c].getCrop() + " will make " + currencyFormatter.format(acres[r][c].income(days)) + "\n");
            }
        }
    }

    // toString method
    public String toString() {
        String str = "";
        for (int r = 0; r < acres.length; r++) {
            for (int c = 0; c < acres[0].length; c++) {
                str += "Row: " + (r + 1) + " Column: " + (c + 1) + "\t" + acres[r][c].toString() + "\n";
            }
        }
        return str;
    }
}
