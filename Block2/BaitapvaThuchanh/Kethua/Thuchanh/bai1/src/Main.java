public class Main {
    public static void main(String[] args) {
        People people = new People("tri",true,20);
        Student student = new Student();
        Employee employee = new Employee();
        System.out.println(people.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
    }
}