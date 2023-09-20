package LevelFourConditionalPrograms;

import java.util.Scanner;

public class LargestOfThree {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("-- LargestOfThree --");

    System.out.print("\nEnter first number: ");
    double first = scan.nextDouble();
    System.out.print("\nEnter second number: ");
    double second = scan.nextDouble();
    System.out.print("\nEnter third number: ");
    double third = scan.nextDouble();

    if (first > second) {
      if (first > third) {
        System.out.println(first + " is the biggest number.");
      }
      else {
        System.out.println(third + " is the biggest number.");
      }
    }
      
    else {
      if (second > third) {
        System.out.println(second + " is the biggest number.");
      }
      else {
        System.out.println(third + " is the biggest number.");
      }
    }
    scan.close();
  }
}

 

 

 