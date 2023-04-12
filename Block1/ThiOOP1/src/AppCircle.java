public class AppCircle {
    public static void main(String[] args) {
        Circle circle0 = new Circle();
        Circle circle = new Circle(2,2,2.5,"red");
        circle0.setColor("green");
        circle.setColor("white");
        System.out.println("toa do x="+circle0.getX()+" y="+circle0.getY());
        System.out.println("toa do x="+circle.getX()+" y="+circle.getY());
        System.out.println("dien tich: "+circle0.calArea());
        System.out.println("dien tich: "+circle.calArea());
        System.out.println(circle0.render());
        System.out.println(circle.render());
    }
}
