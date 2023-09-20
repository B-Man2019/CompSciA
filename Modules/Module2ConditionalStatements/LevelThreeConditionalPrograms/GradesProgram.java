package LevelThreeConditionalPrograms;

import java.util.*;

public class GradesProgram {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("-- GradesProgram --");
    System.out.print("\nHow many points was the test worth? ");
    double pointsWorth = scan.nextDouble();
    System.out.print("\nHow many points did you recieve? ");
    double pointsRecieved = scan.nextDouble();

    double percentage = (pointsRecieved/pointsWorth)*100;
    System.out.println("Percentage: " + percentage + "%");

    if (percentage >= 90) {
      System.out.println("You recieved an A");
    }
    else if (percentage >= 80) {
      System.out.println("You recieved a B");
    }
    else if (percentage >= 70) {
      System.out.println("You recieved a C");
    }
    else if (percentage >= 60) {
      System.out.println("You recieved a D");
    }
    else if (percentage < 60) {
      System.out.println("You recieved a F");
    }
    scan.close();
  }
}

 