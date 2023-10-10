package Modules.Module3Loops.ExtraCredit;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int userNum = scan.nextInt();
        int current = userNum;

        while (userNum >= 0) {
            while (current >= 1) {
                System.out.print(current + " ");
                current--;
            }
            System.out.println("\n");
            userNum--;
            current = userNum;
        }

        scan.close();
    }
}
