package bai2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int[] arr = arrayExample.createRoom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so bat ky: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Gia tri cua "+x+" o vi tri "+arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("chi so vuot gioi han mang");
        }
    }
}
