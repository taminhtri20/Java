import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chuoi = "truong dai hoc thanh do";
        System.out.print("nhap ki tu: ");
        char kytu = scanner.next().charAt(0);
        int count=0;
        for (int i=0 ; i<chuoi.length() ; i++){
            if (kytu==chuoi.charAt(i)){
            count++;
            }
        }
        System.out.print("ki tu "+kytu+" xuat hien "+count+" lan trong chuoi");
    }
}
