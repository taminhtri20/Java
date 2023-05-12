import java.io.*;
import java.util.ArrayList;

public class Student implements Serializable {
    public int code;
    public String name;
    public int math;
    public int phisics;
    public int chemistry;

    public Student(){};
    public Student(int code,String name,int math,int phisics,int chemistry){
        this.code=code;
        this.name=name;
        this.math=math;
        this.phisics=phisics;
        this.chemistry=chemistry;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getChemistry() {
        return chemistry;
    }

    public int getCode() {
        return code;
    }

    public int getMath() {
        return math;
    }

    public int getPhisics() {
        return phisics;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMath(int math) {
        this.math=math;
    }

    public void setPhisics(int phisics) {
        this.phisics = phisics;
    }
    @Override
    public String toString(){
        return "Ma sinh vien: "
                +getCode()
                +", Ten sinh vien: "
                +getName()
                +", Diem toan: "
                +getMath()
                +", Diem ly: "
                +getPhisics()
                +", Diem hoa: "
                +getChemistry();
    }
    public boolean saveStudent(Student student,String filename){
        ArrayList<Student> listStudent = new ArrayList<>();
        try {
            FileOutputStream fileout = new FileOutputStream(filename);
            ObjectOutputStream objout = new ObjectOutputStream(fileout);
//            objout.writeObject(student);
//            while (student != null){
//                objout.writeObject(student);
//                listStudent.add(n,student);
//                n++;
//            }
//            listStudent.add(student);
//            listStudent.add(student);
//            objout.writeObject(listStudent);
            objout.writeObject(student);
            objout.close();
            fileout.close();
            return true;
        }catch (Exception e){
            return false;
        }
    }
    public ArrayList<Student> readStudent(String filename){
        ArrayList<Student> danhsachSV = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student student = (Student) ois.readObject();
//            while (student != null){
//                try {
//                    danhsachSV.add(student);
//                }catch (Exception e){
//                    continue;
//                }
//                danhsachSV.add(student);
//                student = (Student) ois.readObject();
//            }
            danhsachSV.add(student);
//            student = (Student) ois.readObject();
            ois.close();
            fis.close();
            return danhsachSV;
        }catch (Exception e){
            return null;
        }
    }
}
