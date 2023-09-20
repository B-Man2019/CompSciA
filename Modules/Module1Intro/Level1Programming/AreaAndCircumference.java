package Modules.Module1Intro.Level1Programming;

import java.util.*;
import java.lang.Math;

public class AreaAndCircumference {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
  
    System.out.println("--- Area & Circumference Program ---");
    
    System.out.print("Enter radius: ");

    double radius = scan.nextDouble();

    // Pi and power of number examples found from https://codegym.cc/groups/posts/575-mathpi-in-java

    double circumferenceOfCircle = 2 * Math.PI * radius;

    System.out.println("Circumference: " + circumferenceOfCircle);

    double areaOfCircle = Math.PI * Math.pow(radius, 2);

    System.out.println("Area: " + areaOfCircle);
    
    scan.close();
  }
}
