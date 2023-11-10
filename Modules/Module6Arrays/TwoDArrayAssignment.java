package Modules.Module6Arrays;

import java.util.Scanner;

public class TwoDArrayAssignment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // ****************************************************************
        // Brennan Reinhard
        // brennan.reinhard27@d155.org
        // AP CSA
        // 2DArrayAssignment
        // ****************************************************************
        
        // 1. Make a 2D array with 2 rows and 3 columns that can store integers.
        int[][] array = new int[2][3];
        array[0][0] = 5; // 2a. Put the number 5 into the top left corner of the array
        array[0][2] = 12; // 2b. Put the number 12 into the last spot of the first row
        array[1][1] = 20; // 2c. Put the number 20 in the middle spot of the second row
        array[1][2] = 100; // 2d. Put the number 100 in the last spot of the 2D array
        System.out.println();
        int sum = 0;
        
        // 3. Write a for loop that will print the array in matrix form separated by tabs
        // 4. Write a loop that will find the sum of the numbers in the array
        System.out.println("2D Int Array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
                sum += array[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum: " + sum + "\n");

        // 5. Make a 2D array with 3 rows and 2 columns that can store Strings
        String[][] strArray = new String[3][2];

        // 6. Write a loop that will allow the user to put something in each spot of the array with a name
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray[i].length; j++) {
                System.out.print("\nEnter name at index: (" + i + ", " + j + "): ");
                strArray[i][j] = scan.nextLine();
            }
        }

        // 7. Print the 2D array using a loop
        System.out.println("\n2D String Array: ");
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray[i].length; j++) {
                System.out.print(strArray[i][j] + "\t");
            }
            System.out.println();
        }

        // 8. Write a loop that will find the name that is the longest.  Print the name and the location of where it is in the array.
        int max = Integer.MIN_VALUE;
        int[] index = new int[2];
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray[i].length; j++) {
                if (strArray[i][j].length() > max) {
                    max = strArray[i][j].length();
                    index[0] = i;
                    index[1] = j;
                }
            }
        }
        System.out.println("Longest name: " + strArray[index[0]][index[1]] + "\nIndex: (" + index[0] + ", " + index[1] + ")");
        
        // 9. Make a 2D array of doubles with 2 rows and 4 columns and use an initializer list to put the following values in the array  2.5, 3.7, 4.8, 1.2, 4, 7, 12, 15
        double[][] doubleArray = {{2.5, 3.7, 4.8, 1.2}, {4, 7, 12, 15}};
        
        // 10. Write a loop that will calculate the average of the numbers in the 2D array.
        double average = 0;
        int count = 0;
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                average += doubleArray[i][j];
                count++;
            }
        }
        System.out.println("\nAverage: " + (average / (double)count) + "\n");

        // 11. Make a 2D int array with 5 rows and 5 columns. 
        int[][] intArray = new int[5][5];
        
        // 11a.  Write a loop that will put random integers between 1 and 10 in each spot.
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                int rand = (int)(Math.random()*10 + 1);
                intArray[i][j] = rand;
            }
        }

        // 11b. Write a loop that will print the array in a matrix format
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.print(intArray[i][j] + "\t"); 
            }
            System.out.println();
        }

        // 11c. Write a loop that calculates how many rows have a sum greater than 30
        int rowSum = 0;
        count = 0;

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
               rowSum += intArray[i][j];
            }
            if (rowSum > 30) {
                count++;
            }
            rowSum = 0;
        }

        System.out.println("\nRows greater than 30: " + count);

        
        // 11d. Write a loop that calculates how many columns have a sum greater than 30

        int columnSum = 0;
        count = 0;
        for (int j = 0; j< intArray[0].length; j++){
            for (int i = 0; i<intArray.length; i++){
                columnSum += intArray[i][j]; 
            }
            if (columnSum > 30) {
                count++;
            }
            columnSum = 0;
        }


        System.out.println("\nColumns greater than 30: " + count);

        // 11e. Determine how many of the diagonals have a sum greater than 30
        int diagOne = 0;
        count = 0;
        for (int i = 0, j = 0; i < intArray.length; j++, i++) {
            diagOne += intArray[i][j];

        }

        if (diagOne > 30) {
            count++;
        }

        int diagTwo = 0;

        for (int i = 0, j = 4; i < intArray.length; i++, j--) {
            diagTwo += intArray[i][j];
        }

        if (diagTwo > 30) {
            count++;
        }

        System.out.println("\nDiagonals greater than 30: " + count);
    }
}