public class bai1 {
    public static void main(String[] args) {
        Circle circle = new Circle(1.2,"blue");
        Cylinder cylinder = new Cylinder(1.2,"blue",2.3);
        System.out.println(cylinder);
        System.out.println(cylinder.getArea());
    }
}
class Circle{
    private double radius;
    private String color;
    public Circle(){
    }
    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    @Override
    public String toString(){
        return "A Circle with radius "
                +getRadius()
                +" color "
                +getColor()
                +" and area "
                +getArea();
    }
}
class Cylinder extends  Circle{
    private double height;
    public Cylinder(){}
    public Cylinder(double radius,String color,double height){
        super(radius,color);
        this.height=height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString(){
        return "A Cylinder with height "
                +getHeight()
                +", Which is a Subclass of "
                +super.toString();
    }
}