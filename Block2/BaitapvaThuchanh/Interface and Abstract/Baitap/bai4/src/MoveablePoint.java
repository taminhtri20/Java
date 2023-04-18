import javax.print.DocFlavor;

public class MoveablePoint implements Moveable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    public MoveablePoint(int x,int y,int xSpeed,int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    @Override
    public void moveUp(){
        y -= ySpeed;
    }
    @Override
    public void moveDown(){
        y += ySpeed;
    }
    @Override
    public void moveLeft(){
        x -= xSpeed;
    }
    @Override
    public void moveRight(){
        x += xSpeed;
    }
    public String toString(){
        return "( "
                +getX()
                +","
                +getY()
                +" ) speed: "
                +"( "
                +getxSpeed()
                +","
                +getySpeed()
                +" )";
    }
}
