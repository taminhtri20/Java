public class bai4 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("blue",1.5,2,3);
        System.out.println(triangle.toString());
    }
}
class Shape{
    public String color;
    public Shape(){}
    public Shape(String color){
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return "A Triangle with color: "
                +getColor();
    }
}
class Triangle extends Shape{
    public double side1 = 1.0;
    public double side2 = 1.0;
    public double side3 = 1.0;
    public Triangle(){}
    public Triangle(String color,double side1,double side2,double side3){
        super(color);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea(){
        return 0.25*Math.sqrt((side1+side2+side3)*(side1+side2-side3)*(side2+side3-side1)*(side3+side1-side2));
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }
    public String toString(){
        return  super.toString()
                +" with Area: "
                +getArea()
                +" and Perimeter: "
                +getPerimeter();
    }
}