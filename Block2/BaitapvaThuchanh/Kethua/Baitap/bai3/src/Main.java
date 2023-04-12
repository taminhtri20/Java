public class Main {
    public static void main(String[] args) {
        Movablepoint movablepoint = new Movablepoint(2.3f,3.5f,6.6f,7.7f);
        System.out.println(movablepoint.toString());
        movablepoint.move();
        System.out.println(movablepoint.toString());
    }
}