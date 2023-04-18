public class Main {
    public static void main(String[] args) {
        People student = new StudentIMPL("tri",20,true);
        System.out.println(student.eat());
        System.out.println(student.sleep());
        System.out.println(student.study());
    }
}