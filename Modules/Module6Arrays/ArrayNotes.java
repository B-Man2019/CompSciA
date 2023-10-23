package Modules.Module6Arrays;

import java.util.*;

public class ArrayNotes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 2. Create an int array using an initializer list and put 5 ints in it
        int[] lenFive = {3,2,5,1,6};

        // 3. Write a loop to find the maximum number in the array and what index it is at
        int largest = Integer.MIN_VALUE;
        int largestIndex = 0;
        for (int i = 0; i < lenFive.length; i++) {
            if (lenFive[i] > largest) {
                largest = lenFive[i];
                largestIndex = i;
            }
        }
        System.out.println("Largest #: " + largest + "\nIndex: " + largestIndex);

        // 4. Do the same for the minimum number in the array
        int smallest = Integer.MAX_VALUE;
        int smallestIndex = 0;
        for (int i = 0 ; i < lenFive.length; i++) {
            if (lenFive[i] < smallest) {
                smallest = lenFive[i];
                largestIndex = i;
            }
        }
        System.out.println("Smallest #: " + smallest + "\nIndex: " + smallestIndex);

        // 5. Create a String array and let the user type in 6 Strings to fill the array
        String[] strArray = new String[6];

        for (int i = 0; i < strArray.length; i++) {
            System.out.print("\nEnter string #" + (i + 1) + ": ");
            String str = scan.nextLine();
            strArray[i] = str;
        }

        // 6. Print out how many of the Strings have a length > 4
        int greatCount = 0;
        for (int i = 0; i < strArray.length; i++) {
            int len = strArray[i].length();
            if (len > 4) {
                greatCount++;
            }
        }

        System.out.println(greatCount); // print output

        
        // 7. Shift each String 1 spot to the right and put the last String in the beginning (print)
        String[] tempArray = new String[strArray.length];

        for (int i = 0; i < strArray.length; i++) {
            tempArray[i] = strArray[i];
        } // Generating the temp array

        String lastString = tempArray[tempArray.length - 1]; // getting the last string

        for (int i = tempArray.length - 1; i > 0; i--) {
            tempArray[i] = tempArray[i - 1]; // shift
        } 

        tempArray[0] = lastString; // make the last string go to the front

        System.out.println("\n\nSHIFT ITEMS TO RIGHT: ");

        for (int i = 0; i < tempArray.length; i++) { // print out array
            System.out.println(tempArray[i]);
        }
        strArray = tempArray.clone();



        // 8. Shift each String 1 spot to the left and put the first String at the end (print)
        tempArray = new String[strArray.length];

        for (int i = 0; i < strArray.length; i++) {
            tempArray[i] = strArray[i];
        } // Generating the temp array

        String firstString = tempArray[0]; // getting the first string

        for (int i = 0; i < tempArray.length - 1; i++) {
            tempArray[i] = tempArray[i + 1]; // shift
        } 

        tempArray[tempArray.length - 1] = firstString; // make the first string go to the back

        System.out.println("\n\nSHIFT ITEMS TO LEFT: ");

        for (int i = 0; i < tempArray.length; i++) { // print out array
            System.out.println(tempArray[i]);
        }
        strArray = tempArray.clone();

        // 9. Reverse the order of the String array (swapping or new array?) (print)
        String[] reverseArray = new String[strArray.length];
        for (int i = strArray.length - 1, a = 0; i >= 0; i--) {
            reverseArray[i] = strArray[a];
            a++;
        }
        System.out.println("\n\nREVERSE ARRAY:");

        for (int i = 0; i < reverseArray.length; i++) { // print out array
            System.out.println(reverseArray[i]);
        }

        // 10. Sort both the int array and the String array using Arrays.sort()

        Arrays.sort(strArray);
        Arrays.sort(lenFive);

        // 11. Delete the String at the third index (print only the remaining items)

        strArray[3] = null;
        String temp = strArray[strArray.length - 1];
        strArray[strArray.length - 1] = null;
        strArray[3] = temp;

        System.out.println("\n\nDELETE INDEX 3 ARRAY: ");

        for (int i = 0; i < strArray.length; i++) { // print out array
            if (strArray[i] != null) {
                System.out.println(strArray[i]);
            }
        }

        // 12. Add 2 Strings to the array
        String[] biggerArray = new String[strArray.length + 1];

        for (int i = 0; i < strArray.length; i++) {
            biggerArray[i] = strArray[i];
        } // Generating the big array

        biggerArray[strArray.length - 1] = "dog";
        biggerArray[strArray.length] = "cat";
        System.out.println("\n\n+2 ARRAY: ");
        for (int i = 0; i < biggerArray.length; i++) { // print out array
            System.out.println(biggerArray[i]);
        }

        strArray = biggerArray;
        
        scan.close(); // <3
    }
}


