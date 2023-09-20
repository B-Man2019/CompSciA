package LevelThreeConditionalPrograms;

import java.util.Scanner;

public class DataPlan {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int amountOwed;

    System.out.println("-- DataPlan --");
    System.out.print("How much data have you used (GB)? ");
    double usedData = scan.nextDouble();

    if (usedData <= 2) {
      amountOwed = 20;
    }
    else {
      usedData = Math.ceil(usedData);
      amountOwed = (((int)usedData - 2) * 5) + 20;
    }
    System.out.println("You owe: $" + amountOwed);
    scan.close();
  }
}