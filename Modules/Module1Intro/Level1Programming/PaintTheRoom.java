package Modules.Module1Intro.Level1Programming;

import java.util.Scanner;

public class PaintTheRoom {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("--- PaintTheRoom ---");
    System.out.print("Width of room (ft): ");
    
    double width = scan.nextInt();

    System.out.print("\nHeight of room (ft): ");

    double height = scan.nextInt();

    System.out.print("\nLength of room (ft): ");

    double length = scan.nextInt();

    double area = (2 * (height * length)) + (2 * (height * width));

    double gal = Math.ceil(area/350); // Ceiling method found from https://stackoverflow.com/questions/4540684/java-round-up-any-number

    System.out.println("Total gallons of paint needed (gal): " + gal);
    scan.close();
  }
}