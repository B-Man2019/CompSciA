package Module5Classes;

public class DiceDriver {
    public static void main(String[] args) {
        Dice die = new Dice();
        int oneCount = 0;
        for (int i = 1; i <= 30; i++) {
            int roll = die.roll();
            System.out.println("Roll " + i + ": " + roll);
            if (roll == 1) {
                oneCount++;
            }
        }
        System.out.println("One was rolled " + oneCount + " times. It was rolled " + ((double)oneCount / 30 * 100) + " percent of the total rolls.");

        die.setSides(4);
        int fourRoll = die.roll();
        System.out.println("Die with 4 sides roll: " + fourRoll);

        Dice hot = new Dice(10);
        Dice horse = new Dice(10);

        int sumTenCount = 0;

        for (int i = 1; i <= 10; i++) {
            int hotRoll = hot.roll();
            int horseRoll = horse.roll();

            if (hotRoll + horseRoll == 10) {
                sumTenCount++;
            }
        }
        System.out.println("A sum of ten was rolled " + sumTenCount + " times.");
            
        

    }
}
