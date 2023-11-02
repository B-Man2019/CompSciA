package Modules.Module6Arrays;

public class BandBooster {
    String name;
    int boxesSold;

    public BandBooster(String n) {
        name = n;
        boxesSold = 0;
    }

    public String getName() {
        return name;
    }

    public void updateSales(int num) {
        boxesSold += num;
    }

    public String toString() {
        return name + ": " + boxesSold + " boxes";
    }
}