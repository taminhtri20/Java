public class Point3d extends Point2d{
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
