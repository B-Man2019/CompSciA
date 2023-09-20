package LevelFourConditionalPrograms;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("-- LeapYear --");

    System.out.print("\nEnter year: ");
    int year = scan.nextInt(); // Year should always be an int
    if ((year % 4) == 0) {
      if ((year % 100) == 0) {
        if ((year % 400) == 0) {
          System.out.println("Is a leap year.");
        }
        else {
          System.out.println("Is not a leap year.");
        }
      }
      else {
        System.out.println("Is a leap year.");
      }
    }
    else {
      System.out.println("Is not a leap year.");
    }
    scan.close();
  }
}

