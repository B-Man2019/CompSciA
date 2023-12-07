package TwoDFarm;
import java.text.NumberFormat;
import java.util.Locale;

public class Acre {
    String crop;
    double sellPrice;
    double growCost;
    int daysToHarvest;
    boolean growable;

    public Acre(String crop, double sellPrice, double growCost, int daysToHarvest, boolean growable) {
         this.crop = crop;
         this.sellPrice = sellPrice;
         this.growCost = growCost;
         this.daysToHarvest = daysToHarvest;
         this.growable = growable;
    }

    public Acre() {
        crop = "No Crops";
        sellPrice = 0;
        growCost = 0;
        daysToHarvest = 0;
        growable = false; 
    }

    public String getCrop() {
        return crop;
    }
    

    // *****************************************
    // PURPOSE:
    // Returns true if the crop has enough days to
    // harvest based on int days passed
    // *****************************************
    public boolean enoughDays(int days) {
        if (days > daysToHarvest && growable) {
            return true;
        }
        return false;
    }

    // *****************************************
    // PURPOSE:
    // Returns income based on sell price
    // minus grow price
    // *****************************************
    public double income() {
        return sellPrice - growCost; // $ from making crop - $ from growing = income
    }

    // *****************************************
    // PURPOSE:
    // Returns income based on number of days
    // passed in.
    // *****************************************
    public double income(int days) {
        int numberOfHarvests = days / daysToHarvest; // bascially a multiplier
        

        return Math.floor(((sellPrice - growCost) * (double)numberOfHarvests) * 100) / 100; // multiplies income from one
                                                          // harvest by # of harvests
    }

    public void setBad() {
        crop = "No Crops";
        sellPrice = 0;
        growCost = 0;
        daysToHarvest = 0;
        growable = false; 
    }

    // toString method
    public String toString() {
        if (growable) {
        // format money
        Locale locale = new Locale.Builder().setLanguage("en").setRegion("US").build();
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

        return "\tCrop: " + crop 
        + "\tSell price: " 
        + currencyFormatter.format(sellPrice) 
        + "\tCost: " + currencyFormatter.format(growCost) 
        + "\tDays to Harvest: " + daysToHarvest;
        } else {
            return "No Crops";
        }
    }
}
