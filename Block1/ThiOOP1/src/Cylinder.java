public class Cylinder  extends  Circle{
    private double height;
    public Cylinder(int x,int y,double radius,String color,double height){
        super(x,y,radius,color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return calArea()*height;
    }
}
