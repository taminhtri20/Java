public class Square extends Rectangle {
    private double side;
    public Square(){}
    public Square(double side){
        this.side=side;
    }
    public Square(String color,boolean filled,double width,double length,double side){
        super(color, filled, width, length);
        this.side=side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public void setWidth(double side){
        this.setWidth(side);
    }
    public void setLength(double side){
        this.setLength(side);
    }
    public String toString(){
        return "A square with side: "
                +getSide()
                +" which is subclass off "
                +super.toString();
    }
}
