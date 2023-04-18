public class Rectangle implements GeometricObject{
    private double width;
    private double length;
    public Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea(){
        return width*length;
    }
    @Override
    public double getPerimeter(){
        return (width+length)*2;
    }
    public String toString(){
        return "A Rectangle with length: "
                +getLength()
                +", width: "
                +getWidth()
                +", Area: "
                +getArea()
                +", Perimeter: "
                +getPerimeter();
    }
}
