public class Point2d {
    public float x = 0.0f;
    public float y = 0.0f;
    public Point2d(){}
    public Point2d(float x,float y){
        this.x=x;
        this.y=y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
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
        return "X: "
                +getX()
                +" Y: "
                +getY();
    }
}
