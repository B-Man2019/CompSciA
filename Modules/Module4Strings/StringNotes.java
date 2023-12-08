package Module4Strings;

import java.util.Scanner;

public class StringNotes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // int is a primitive data type
        // int dog = 32;

        // String is a class (not a primitive data type)
        String blah = new String("Hello World");
        System.out.print("Give me your name: ");
        String name = scan.nextLine();

        scan.close();
        name = name.toUpperCase();
        System.out.println(name);

        int theIndex = name.indexOf("THE");

        if (theIndex != -1) {
            System.out.println("You have the word THE in your name.");
        } else {
            System.out.println("You don't have the word THE in your name.");
        }


        if (name.equalsIgnoreCase("Brian")) {
            System.out.println("Great name!");
        } else {
            System.out.println("Boring name.");
        }

        // charAt is a method of the String class
        char cat = blah.charAt(2);
        System.out.println(cat);

        int pony = blah.length();
        System.out.println(pony);

        int i;

        System.out.println("\n\n");
        for (i = 0; i < blah.length(); i++) {
            System.out.println(blah.charAt(i));
        }

        // String frog = blah.substring(8, 11); // 8 is inclusive, 11 is exclusive
        // frog is now "rld"

        int nameLen = name.length();

        System.out.println(name.substring(nameLen-3, nameLen));
        System.out.println(name.substring((nameLen / 2) - 1, nameLen - (nameLen / 2) + 1));
    }
}
