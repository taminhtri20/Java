import java.io.File;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(01,"taminhtri",9,9,9);
//        Student student1 = new Student(02,"taminhtri",8,8,8);
        student.saveStudent(student,"Student");
//        student1.saveStudent(student1,"Student");
        System.out.println(student.readStudent("Student"));
    }
}