import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {


        // input the name of the student (They do it)
        System.out.println("Welcome to the Jedi Gradebook! What is your name?");
        Scanner scan = new Scanner(System.in);
        Student studentA = new Student("");
        studentA.studentName = scan.nextLine();
        System.out.println(studentA.studentName);
        System.out.println("Hello, " + studentA.studentName);

        //Print out course.
        Courses courseA = new Courses();
        //Make a while Loop here for Formatting
        System.out.println("Please enter grades for " + courseA.printCourse() + ":" +
                " Quiz, Exam, Homework, Project "); //needs system.out.print for method.

        //Input student grades (given by students)
        courseA.enterGrades(courseA.CourseAGrades);
        System.out.println("Your weighted average for " +  courseA.printCourse() + " is: ");
        System.out.println(courseA.gradeWeight(courseA.CourseAGrades));

        courseA.weight = courseA.gradeWeight(courseA.CourseAGrades);
        System.out.println(courseA.checkGrade(courseA.weight));
        studentA.putDataToAFile(courseA.weight);






    }
}
