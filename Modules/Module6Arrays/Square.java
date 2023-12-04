import java.util.*;
import java.io.*;

public class Square
{
    int size;
    Scanner scan;
    int square[][];
    
    //--------------------------------------
    //create new square of given size
    //--------------------------------------
    public Square(int size)
    {
        square = new int[size][size];
    }


    //--------------------------------------
    //return the sum of the values in the given row
    //--------------------------------------
    public int sumRow(int row)
    {
        int sum = 0;

        for (int j = 0; j < square[0].length; j++) {
            sum += square[row][j];
        }
        return sum;
    }


    //--------------------------------------
    //return the sum of the values in the given column
    //--------------------------------------
    public int sumCol(int col)
    {
        int sum = 0;

        for (int j = 0; j < square.length; j++) {
            sum += square[j][col];
        }
        return sum;
    }

    //--------------------------------------
    //return the sum of the values in the main diagonal
    //--------------------------------------
    public int sumMainDiag()
    {
        int sum = 0;
        for (int i = 0, j = 0; i < square.length; j++, i++) {
            sum += square[i][j];
        }
        return sum;
    }

    //--------------------------------------
    //return the sum of the values in the other ("reverse") diagonal
    //--------------------------------------
    public int sumOtherDiag()
    {
        int sum = 0;

        for (int i = 0, j = square.length - 1; i < square.length; i++, j--) {
            sum += square[i][j];
        }
        return sum;
    }

    //--------------------------------------
    //return true if the square is magic (all rows, cols, and diags have
    //same sum), false otherwise
    //--------------------------------------
    public boolean magic()
    {
        int rowSum = 0;
        int count = 0;
        for (int i = 0; i < square.length - 1; i++) {
            count++;
            rowSum += sumRow(i);
        }

        int colSum = 0;
        for (int i = 0; i < square.length - 1; i++) {
            colSum += sumCol(i);
        }

        int majorDiagSum = sumMainDiag();
        majorDiagSum *= count;
        int minorDiagSum = sumOtherDiag();
        minorDiagSum *= count;

        boolean magic = rowSum == colSum && rowSum == majorDiagSum && rowSum == minorDiagSum;

        return magic;

    }

    //--------------------------------------
    //read info into the square from the standard input.
    //--------------------------------------
    public void readSquare() throws Exception
    {
        int count = 0;
        while (count < size * size) {

            for(int row = 0 ; row < size ; row++)
            {
                for(int col = 0; col < size; col++)
                {
                    square[row][col] = scan.nextInt();
                    count++;
                }
            }
        }

    }

    //--------------------------------------
    //print the contents of the square, neatly formatted
    //--------------------------------------
    public void printSquare()
    {
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                System.out.print(square[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public int getSize() {
        return scan.nextInt();
    }


    public static Scanner initScanner(Scanner scan) {
        try {
            scan = new Scanner(new File("MagicData.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("eeee");
            scan = new Scanner(System.in);
            System.out.println(e);
        }
        return scan;
    }

}
