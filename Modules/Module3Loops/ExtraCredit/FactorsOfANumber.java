package Module3Loops.ExtraCredit;

import java.util.Scanner;

public class FactorsOfANumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean positiveInt;
        int index = 1;
        
        int userNum;

        do {
            System.out.print("Enter a positive interger: ");
            userNum = scan.nextInt();

            positiveInt = userNum >= 0;
            if (!positiveInt) {
                System.out.println("Please enter a positive interger");
            }
        } while (!positiveInt);

        while (index <= userNum) {
            if (index == userNum) {
                System.out.print(userNum);
                System.out.print(" are all factors of " + userNum + " \n");
            }
            else if (userNum % index == 0) {
                System.out.print(index + ", ");
            }
            index++;
        }

        scan.close();
    }
}