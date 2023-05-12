import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("File.txt");
        if (file.exists()){
            System.out.println("file da ton tai");
        }else {
            System.out.println("file k ton tai");
        }
        if (file.isDirectory()){
            System.out.println("File la thu muc");
        }else {
            System.out.println("File k phai la thu muc");
        }
        System.out.println("duong dan cua file: "+file.getPath());
    }
}