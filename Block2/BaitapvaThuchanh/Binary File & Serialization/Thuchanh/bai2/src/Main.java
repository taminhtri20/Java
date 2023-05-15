import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.writeData("abc","data.dat");

        System.out.println(main.readData("data.dat"));
    }
    public boolean writeData(String data,String filename) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("data.dat");
        try {
            fos.write(data.getBytes());
            fos.close();
            return  true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String readData(String filename) throws IOException {
        FileInputStream fis = new FileInputStream(filename);
        fis.close();
        return String.valueOf(fis.read());
    }

}