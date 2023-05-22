import java.util.Scanner;

public class Student {
    Scanner scanner = new Scanner(System.in);

    private String name;
    private int level;
    private  String course;
    private int indexNo;
    private int studentID;

    public Student(String name, int level, String course, int indexNo, int studentID) {
        this.name = name;
        this.level = level;
        this.course = course;
        this.indexNo = indexNo;
        this.studentID = studentID;
    }

    public void newStudent(){
        name = scanner.nextLine();
        level = scanner.nextInt();
        course = scanner.nextLine();
        indexNo = scanner.nextInt();
        studentID = scanner.nextInt();

        System.out.println("A new student has been added :)");
        System.out.println("Name = " + name);
        System.out.println("Level = " + level);
        System.out.println("Course = " + course);
        System.out.println("Index Number = " + indexNo);
        System.out.println("Student ID = " + studentID);
    }

}
