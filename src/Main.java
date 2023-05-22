import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> ListofStudents = new ArrayList<>();
        int option;

        System.out.println("HELLO, WELCOME TO THE KNUST STUDENT MANAGEMENT SYSTEM.\nSELECT ONE OF THE FOLLOWING OPTIONS PLEASE ; ");
        System.out.println(" 1. Enter a new student.\n 2. Edit the details of an already existing student.\n 3. Delete a student.\n 4. Display all students.");
        option = scanner.nextInt();

        switch(option){
            case 1:
                ListofStudents.newStudent();

            case 2:

            case 3:

            case 4:
                System.out.println(ListofStudents);
            break;

        }
    }
}
