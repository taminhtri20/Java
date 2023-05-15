import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student(1,"tri",19,"12a1");
        Student student1 = new Student(2,"anh",19,"12a1");
        Student student2 = new Student(3,"minh",19,"12a1");
        Student student3 = new Student(4,"hung",19,"12a1");
        Student student4 = new Student(5,"vinh",19,"12a1");

        StudentProcess studentProcess = new StudentProcess();
        studentProcess.writeStudent(student,"ListStudent.txt");
        studentProcess.writeStudent(student1,"ListStudent.txt");
        studentProcess.writeStudent(student2,"ListStudent.txt");
        studentProcess.writeStudent(student3,"ListStudent.txt");
        studentProcess.writeStudent(student4,"ListStudent.txt");

        Student[] listStudent = studentProcess.readStudent("ListStudent.txt");
        System.out.println(Arrays.toString(listStudent));
    }
}