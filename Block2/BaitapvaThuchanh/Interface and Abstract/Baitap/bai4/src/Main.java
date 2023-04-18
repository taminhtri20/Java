public class Main {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(3,4,2,2);
        moveablePoint.moveRight();
        moveablePoint.moveUp();
        System.out.println(moveablePoint.toString());
    }
}