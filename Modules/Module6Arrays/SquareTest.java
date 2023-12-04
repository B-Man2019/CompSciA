// ****************************************************************
// SquareTest.java
//
// Uses the Square class to read in square data and tell if 
// each square is magic.
//          
// **************************************  **************************
import java.util.*;
import java.io.*;

public class SquareTest
{
    public static void main(String[] args)
    {
    Scanner scan;
    try {
        scan = new Scanner(new File("MagicData.txt"));
    } catch (FileNotFoundException e) {
        e.printStackTrace();
        scan = new Scanner(System.in);
    }
    int count = 1;                 //count which square we're on
    int size = 0;                 //read size of next square
    Square.initScanner(scan);
    //Expecting -1 at bottom of input file
    while (size != -1)
        {
            System.out.println("INSIDE");

            //create a new Square of the given size
            Square square = new Square(size);

            try {
                System.out.println("READING SQUARE");
                square.readSquare();
                System.out.println("SQUARE READ");
            }
            catch (Exception e) {
                System.out.println(e);
            }



        //call its read method to read the values of the square

        System.out.println("\n******** Square " + count + " ********");
        //print the square

        // print the sums of its colums
        for (int i = 0; i < size; i++) {
            System.out.println(square.sumCol(i));
        }

        //print the sums of its columns

        //print the sum of the main diagonal

        //print the sum of the other diagonal

        //determine and print whether it is a magic square


        //get size of next square
        
        count++; // increase count of square
        
        size = square.getSize();
        System.out.println("NEW SIZE: " + size);
        }

   }
}
