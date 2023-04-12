public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1.2,"blue",true);
        Rectangle rectangle = new Rectangle(1.3,1.4,"blue",true);
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
    }
}