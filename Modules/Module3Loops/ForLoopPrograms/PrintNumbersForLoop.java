package Module3Loops.ForLoopPrograms;

import java.util.Scanner;

public class PrintNumbersForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter small number: ");
        int smallNum = scan.nextInt();
        System.out.print("Enter big number: ");
        int bigNum = scan.nextInt();

        for(int index = smallNum; index <= bigNum; index++) {
            if (index != bigNum) {
                System.out.print(index + ", ");
        }

        else {
            System.out.print(index + "\n");
        }
      }
      scan.close();
    }
}
