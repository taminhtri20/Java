import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so");
        int number = scanner.nextInt();
        isOddEven(number);
    }
    public static boolean isOddEven(int number){
        if (number%2==0){
            System.out.println(number+ " la so chan");
            return true;
        }else {
            System.out.println(number+" la so le");
            return false;
        }
    }
}
