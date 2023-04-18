public class Main {
    public static void main(String[] args) {
        MoveableCircle moveableCircle = new MoveableCircle(3,4,4,4,6);
        moveableCircle.moveDown();
        moveableCircle.moveRight();
        System.out.println(moveableCircle.toString());
    }
}