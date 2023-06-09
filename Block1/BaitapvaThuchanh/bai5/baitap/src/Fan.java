public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private String color = "blue";
    private double radius = 5;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public boolean isOn() {
        return on;
    }

    public int getFAST() {
        return FAST;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getSpeed() {
        return speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public Fan(){}
    public Fan(String color, int speed, double radius, boolean on){
        this.color=color;
        this.speed=speed;
        this.radius=radius;
        this.on=on;
    }
    public String toString(){
        String state = "";
        if (this.isOn()) {
            state += ("Fan is on\n");
            state += ("Speed: " + this.speed + "\n");
        } else {
            state += ("Fan is off");
        }
        state += ("Color: " + this.color + "\n");
        state += ("Radius: " + this.radius + "\n");
        return state;
    }
}
class stringFan{
    public static void main(String[] args) {
        Fan fan1 =new Fan("yellow",3,10,true);
        Fan fan2 =new Fan("blue",2,5,false);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
