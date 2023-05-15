import java.io.*;

public class StudentProcess {
    private Student[] students;
    private int count;
    public StudentProcess(){
        students = new Student[5];
        count = 0;
    }
    public boolean writeStudent(Student student,String filename) throws IOException {
        this.students[count++]=student;
        FileOutputStream fos = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(this.students);
        return true;
    }
    public Student[] readStudent(String filename) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(filename);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student[] listStudent = (Student[]) ois.readObject();
        return listStudent;
    }
}
