import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Student {
    //Student name.
    String studentName;

    //Object of Course class
    //Courses course = new Courses();

    //Default Constructor 1.
    Student (String name) throws IOException {}

    protected void putDataToAFile(double weight) throws IOException {
        File studentInfo = new File("src/studentInfo.txt");
        if (!studentInfo.exists()) {
            studentInfo.createNewFile();
        }
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(studentInfo, true));
            writer.write(studentName + " " + weight);
            writer.close();
        } catch (IOException writerEX) {
            System.out.println("Cannot write to file: permission issue: " + writerEX.getStackTrace());
        }

    }

}



