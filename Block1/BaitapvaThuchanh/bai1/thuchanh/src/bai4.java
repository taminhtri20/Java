import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap nam:");
        int year = scanner.nextInt();
        if(year % 4 ==0){
            if (year % 100 == 0){
                if(year % 400 == 0) {
                    System.out.printf("nam nhuan");
                }else{
                    System.out.printf("khong phai nam nhuan");
                }
            }else{
                System.out.printf("nam nhuan");
            }
        }else {
            System.out.printf("khong phai nam nhuan");
        }
    }
}
