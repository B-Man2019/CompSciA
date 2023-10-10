package Modules.Module3Loops.LevelOnePrograms;

import java.util.Scanner;

public class FactorsOf60 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean correctFactor = false;
    do {
      System.out.print("Enter a factor of 60: ");
      int userFactor = scan.nextInt();

      if (60 % userFactor == 0) {
        correctFactor = true;
      }
      else {
        System.out.println("That's not a factor of 60. Try again!");
      } 
    } while (!correctFactor);
    System.out.println("Nice job! You got it right!");

    scan.close();
  }
}