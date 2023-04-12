public class bai2 {
    public static void main(String[] args) {
        Point2d point2d = new Point2d(2.2f,3.3f);
        Point3d point3d = new Point3d(5.5f,6.6f,1.1f);
        System.out.println(point2d.toString());
        System.out.println(point3d.toString());
    }
}
class Point2d{
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
class Point3d extends Point2d{
    public float z = 0.0f;
    public Point3d(){}
    public Point3d(float x,float y,float z){
        super(x, y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public float[] getXYZ(){
        float[] xyz = {x,y,z};
        return xyz;
    }
    public String toString(){
        return super.toString()
                +" z: "
                +getZ();
    }
}
