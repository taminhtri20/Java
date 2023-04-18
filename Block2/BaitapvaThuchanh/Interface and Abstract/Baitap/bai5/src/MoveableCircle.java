public class MoveableCircle implements Moveable{
    private MoveablePoint    center;
    private int             radius;

    public MoveableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center      = new MoveablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public void moveUp() {
        center.y -= center.ySpeed;
    }

    public void moveDown() {
        center.y += center.ySpeed;
    }

    public void moveLeft() {
        center.x -= center.xSpeed;
    }

    public void moveRight() {
        center.x += center.xSpeed;
    }

    public String toString() {
        return String.format("MovableCircle at point %1$s with radius = %2$d"
                , center.toString(), radius);
    }
}
