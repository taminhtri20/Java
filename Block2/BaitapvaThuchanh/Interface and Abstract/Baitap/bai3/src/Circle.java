public class Circle implements GeometricObject{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
    @Override
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    public String toString(){
        return "A Circle with radius: "
                +getRadius();
    }
}
