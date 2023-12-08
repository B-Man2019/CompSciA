package Module5Classes;

public class MStudentDriver {
    public static void main(String[] args) {
        MStudent stu1 = new MStudent("Smith", "Amy", 3, 3.7, "CLS");
        MStudent stu2 = new MStudent();

        System.out.println(stu1.toString());
        System.out.println(stu2.toString());

        stu1.incrementYear(1);
        stu2.gpaAdd(MStudent.COVID_GPA_BUMP);

        System.out.println(MStudent.getTotalStudents());

        stu1.marry(stu2);

        System.out.println(stu1.toString());
        System.out.println(stu2);
    };

    
}
