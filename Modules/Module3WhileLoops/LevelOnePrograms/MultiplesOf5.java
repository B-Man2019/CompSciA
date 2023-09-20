package LevelOnePrograms;

import java.util.Scanner;

public class MultiplesOf5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("-- Multiples of 5 --");
        System.out.print("How many multiples of 5 do you want? ");
        int numMultiples = scan.nextInt();
        int index = 0;
        int multiple = 0;
        while (index < numMultiples) {
            multiple = multiple + 5;
            System.out.println(multiple);
            index++;
        }
        scan.close();
    }
}
