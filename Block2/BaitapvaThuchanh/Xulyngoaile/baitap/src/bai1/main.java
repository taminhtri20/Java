package bai1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckTriangle checkTriangle = new CheckTriangle();

        try {
            System.out.println("Nhap canh a: ");
            int a = scanner.nextInt();

            System.out.println("Nhap canh b: ");
            int b = scanner.nextInt();

            System.out.println("Nhap canh c: ");
            int c = scanner.nextInt();

            try {
                checkTriangle.checkTriangle(a,b,c);
            } catch (TriangleException e) {
                System.out.println(e.getMessage());
            }
        }catch (Exception e){
            System.out.println("sai!");
        }
    }
}
