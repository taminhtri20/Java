public abstract class Shape {
    private String color = "red";
    private boolean filled = true;
    public Shape(){}
    public Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString(){
        return "Shape with color: "
                +getColor()
                +" and filled: "
                +isFilled();
    }
}
