package LevelTwoConditionalPrograms;

import java.util.*;

public class VotingBooth { 
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("-- Voting Booth --");
    System.out.print("\nWhat is your age? ");
    int age = scan.nextInt();
    if (age >= 18) {
      System.out.println("You can vote!");
    }
    else {
      System.out.println("You can't vote.");
    }
    scan.close();
  }
}