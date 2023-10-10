package Modules.Module3Loops.LevelOnePrograms;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      System.out.print("Enter small number: ");
      int smallNum = scan.nextInt();
      System.out.print("Enter big number: ");
      int bigNum = scan.nextInt();

      while (smallNum <= bigNum) {
        if (smallNum != bigNum) {
          System.out.print(smallNum + ", ");
        }
        else {
          System.out.print(smallNum + "\n");
        }

        smallNum++;
      }
      scan.close();
    }
}
