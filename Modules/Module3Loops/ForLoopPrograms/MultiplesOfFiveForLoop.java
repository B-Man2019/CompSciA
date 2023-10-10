package Modules.Module3Loops.ForLoopPrograms;

import java.util.Scanner;

public class MultiplesOfFiveForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many multiples of 5 do you want? ");
        int numMultiples = scan.nextInt();

        for (int i = 1; i <= numMultiples; i++) {
            System.out.print(i * 5 + "\t");
        }
    }
}
