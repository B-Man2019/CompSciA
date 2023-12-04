// Notes on how to read from a file
import java.util.*;  // need this package for the Scanner class
import java.io.*;  // need this package for the File class

public class FileIONotes 
{ 
    /* need to put "throws Exception" after method header because the
    File class constructor throws an exception if it can't find the File*/
    public static void main(String[] args) throws Exception 
    { 
        // pass the path to the file as a parameter if not in same place as project
        //File file =  new File("C:\\Users\\pankaj\\Desktop\\test.txt"); 
        // If the text file is in the same folder as this project
        // then you can just pass the file name like this
        File file = new File("MagicData.txt");
        Scanner sc = new Scanner(file); 

        // This prints out the file one line at a time
        // while (sc.hasNextLine()) 
        // System.out.println(sc.nextLine()); 

        // This prints out the file one word at a time
        // The default delimiter is spaces
        while(sc.hasNext())
            System.out.println(sc.next());
        
        // If you know there are ints in the file you can read them like this
        // This is reading the magicdata.txt file from the Magic Square Assignment
        Scanner numbers = new Scanner(new File("MagicData.txt"));
        while(numbers.hasNext())
        {
            // We know the first number is the size of the 2D array of 
            // numbers to come next so we can use this number to control our loops
            int size = numbers.nextInt();
            for(int row = 0 ; row < size; row++)
            {
                for(int col =0; col<size; col++)
                {
                    System.out.print(numbers.nextInt() + "\t");
                }
                System.out.println();  
            }
        }
        sc.close();
    } 
} 

