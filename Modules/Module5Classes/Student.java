package Modules.Module5Classes;

public class Student {
    private String name;
    private int year;
    private double gpa;

    public Student(String n, int y, double g) {
        name = n;
        year = y;
        gpa = g;
    }

    public void incrementYear() {
        year++;
    }

    public int getYear() {
        return year;
    }

    public void changeName(String n) {
        name = n;
    }

    public String toString() {
        return "Name: " + name + "\nYear: " + year + "\nGPA: " + gpa;
    }
}
