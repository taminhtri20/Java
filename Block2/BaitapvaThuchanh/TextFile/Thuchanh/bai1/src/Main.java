import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("tinhtong.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            int sum = 0;
            while ((line=br.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("tong la: "+sum);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e){
            System.out.println("File k ton tai hoac nhap sai");
        }
    }
}