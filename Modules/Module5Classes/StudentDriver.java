package Modules.Module5Classes;

public class StudentDriver {
    public static void main(String[] args) {
        Student a = new Student("John Doe", 2025, 4.2);
        Student b = new Student("Jane Doe", 2026, 3.9);

        System.out.println(a.toString() + "\n" + b.toString() + "\n");

        a.incrementYear();
        System.out.println(a.getYear());

        b.changeName("Jessica Doe");
        
        System.out.println(a.toString() + "\n" + b.toString() + "\n");
    }

}
