public class Circle {
    private int x;
    private int y;
    private double radius;
    private  String color;
    public Circle(){
        this.x=0;
        this.y=0;
        this.radius=1;
    }
    public Circle(int x,int y){
        this();
        this.x=x;
        this.y=y;
    }
    public Circle(int x,int y,double radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    public Circle(int x,int y,double radius,String color){
        this.x=x;
        this.y=y;
        this.radius=radius;
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public String render(){
        return "A Circle with x="
                +getX()
                +" y="
                +getY()
                +", radius="
                +getRadius()
                +" and color "
                +getColor();
    }
    public double calArea(){
        return Math.PI*radius*radius;
    }
}
