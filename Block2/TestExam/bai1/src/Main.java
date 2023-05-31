public class Main {
    public static void main(String[] args) {
        People people = new People("tri",19,true,1.7,6.0);
        Teacher teacher = new Teacher("tu anh",24,true,1.7,5.5,"dai hoc","sada","cntt");
        System.out.println(people.toString());
        System.out.println(teacher.toString());
    }
}