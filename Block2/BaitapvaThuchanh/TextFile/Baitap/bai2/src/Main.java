import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileWriter fileWriter = new FileWriter();
        FileRead fileRead = new FileRead();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap du lieu:");
        String data = scanner.nextLine();
        fileWriter.writeFile("FileWrter",data);
        System.out.println("Output:");
        System.out.println(fileRead.readFile("FileWrter"));
    }
}