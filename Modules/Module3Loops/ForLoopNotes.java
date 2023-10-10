package Modules.Module3Loops;

public class ForLoopNotes {
    public static void main(String[] args) {

        // While Loop

        int x = 2;
        while(x <= 8) {
            System.out.println(x);
            x++;
        }

        // For Loop
        
        for(int y = 2; y <= 8; y++) {
            System.out.println(y);
        }

        // For Loop without initialization (bad code)

        int z = 2;
        for(; z <= 8; z++) {
            System.out.println(z);
        }

        // For Loop with multiple variables
        for(int a = 2, b = 3; a <= 8 && b > 1; a++, b--) {
            System.out.println(a);
        }
    }
}
