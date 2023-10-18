package Modules.Module5Classes;

public class MStudent {
    private String lastName, firstName;
    private String school;
    private int year;
    private double gpa;
    public static final double COVID_GPA_BUMP = 0.3;
    private static int numStudents = 0;

    public MStudent(String lastName, String firstName, int year, double gpa, String school) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.year = year;
        this.gpa = gpa;
        this.school = school;
        numStudents++;
    }

    public MStudent() {
        lastName = "Doe";
        firstName = "John";
        year = 1;
        gpa = 0.0;
        school = "CLC";
        numStudents++;
    }

    public void incrementYear() {
        year++;
        resetYear();
    }

    public void incrementYear(int num) {
        year += num;
        resetYear();
    }

    public int getYear() {
        return year;
    }

    public static int getTotalStudents() {
        return numStudents;
    }

    public void changeName(String lN, String fN) {
        lastName = lN;
        firstName = fN;
    }

    public void gpaAdd(double amt) {
        gpa += amt;
    }

    public void marry(MStudent student) {
        String origLN = this.lastName;
        this.lastName = this.lastName + "-" + student.lastName;
        student.lastName = origLN + "-" + student.lastName;
    }

    public String getSchool() {
        return school;
    }

    // support methods
    private void resetYear() {
        if (this.year > 12) {
            this.year = 0;
        }
    }

    public String toString() {
        return "Last, First Name: " + lastName + ", " + firstName + "\nYear: " + year + "\nGPA: " + gpa;
    }
}
