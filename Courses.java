import java.util.ArrayList;
import java.util.Scanner;

public class Courses {

    //Class fields
    double quiz = 0.20;
    double exam = 0.30;
    double homework = 0.25;
    double project = 0.25;
    double weight;


    Scanner scanner = new Scanner (System.in);

    //public static String[] Courses = {"Force Training", "Lightsaber Creation", "Padawan Training", "Fleet Control"}
    //course 1.
    public String course = "Force Training";

    //ArrayList for storing grades. (Quiz, Exam, Homework, Project)
    ArrayList<Double> CourseAGrades = new ArrayList<>();

    //Method for storing grades.
    protected void enterGrades(ArrayList<Double> CourseAGrades) {
        for (int i=0; i < 4; i++) {
            CourseAGrades.add(scanner.nextDouble());
        }
        System.out.println("Your Grades:");
        System.out.println(CourseAGrades.toString());
    }

    //Method for course(s)
    public String printCourse() {
        return course;
    }

    protected double gradeWeight(ArrayList<Double> CourseAGrades) {
        ArrayList<Double> gradeWeight2;
        gradeWeight2 = CourseAGrades;

        double weight = (quiz * gradeWeight2.get(0)) + (exam * gradeWeight2.get(1)) + (homework * gradeWeight2.get(2)) +
                (project * gradeWeight2.get(3));
        return weight;

    }

    protected String checkGrade(double weight) {
        if (weight > 89) {
            return "Congratulations my padawan you got an A";
        }
        else if (weight > 79 && weight < 89){
            return "You did good my young apprentice but could do better you got a B";
        }
        else if (weight > 69 && weight < 79){
            return "You passed padawan but need to improve you got a  C";
        }
        else if (weight > 59 && weight < 69){
            return "You will not become a Jedi Knight at this rate you got a D";
        }
        else{
            return "NOT ACCEPTABLE PADAWAN YOU GOT AN F";
        }
    }
}
