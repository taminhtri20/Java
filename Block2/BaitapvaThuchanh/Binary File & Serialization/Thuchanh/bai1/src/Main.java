import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("person.dat");
        fos.write(5);
        fos.close();

        FileInputStream fis = new FileInputStream("person.dat");
        System.out.println(fis.read());
        fis.close();
    }
}