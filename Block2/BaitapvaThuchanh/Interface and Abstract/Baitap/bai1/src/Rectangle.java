public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;
    public Rectangle(){}
    public Rectangle(String color,boolean filled,double width,double length){
        super(color, filled);
        this.width=width;
        this.length=length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    @Override
    public double getArea(){
        return width*length;
    }
    @Override
    public double getPerimeter(){
        return (width+length)*2;
    }
    @Override
    public String toString(){
        return "A rectangle with length: "
                +getLength()
                +", width: "
                +getWidth()
                +", Area: "
                +getArea()
                +" and perimeter: "
                +getPerimeter()
                +" which is subclass of "
                +super.toString();
    }
}
