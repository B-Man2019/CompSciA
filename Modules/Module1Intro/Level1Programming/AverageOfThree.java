package Module1Intro.Level1Programming;

import java.util.*;

public class AverageOfThree {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("--- Average of 3 Program ---");
    System.out.print("Enter the first number: ");

    double first = scan.nextDouble();

    System.out.print("\nEnter the second number: ");

    double second = scan.nextDouble();

    System.out.print("\nEnter the third number: ");

    double third = scan.nextDouble();

    double average = (first+second+third)/3;

    System.out.println("The average is " + average);
    
    scan.close();
  }
}
