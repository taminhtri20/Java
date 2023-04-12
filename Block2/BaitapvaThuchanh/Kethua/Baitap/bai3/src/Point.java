public class Point {
    public float x = 0.0f;
    public float y = 0.0f;
    public Point(){}
    public Point(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float getY() {
        return y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float[] xy = {x,y};
        return xy;
    }
    public String toString(){
        return "x: "
                +getX()
                +" y: "
                +getY();
    }
}
