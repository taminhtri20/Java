public class Main {
    public static void main(String[] args) {
        Mobile iphone = new Iphone();
        Mobile samsung = new Samsung();
        System.out.println(iphone.dowloadApp());
        System.out.println(samsung.dowloadApp());
    }
}