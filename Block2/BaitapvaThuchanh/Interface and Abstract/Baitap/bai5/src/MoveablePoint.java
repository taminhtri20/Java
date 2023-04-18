public class MoveablePoint implements Moveable{
    int x, y, xSpeed, ySpeed;     // package access

    public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    @Override
    public String toString() {
        return String.format("MovablePoint (%1$d, %2$d) with xSpeed = %3$d and ySpeed = %4$d"
                , x, y, xSpeed, ySpeed);
    }
}
