public class Shape {
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
