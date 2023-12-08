package Module5Classes;

public class Dice {
    private int sides;
    private int roll;

    public Dice(int s) {
        sides = s;
    }

    public Dice() {
        sides = 6;
    }

    public int roll() {
        roll = (int) (Math.random() * sides) + 1;
        return roll;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int s) {
        sides = s;
    }

    public int getRoll() {
        return roll;
    }

    public String toString() {
        return "Sides: " + sides + "\nPrevious roll: " + roll;
    }

}