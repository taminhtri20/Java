import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("FileWriter");
        File file1 = new File("tinhtong.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("bai tap");
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader fr = new FileReader(file1);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line=br.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}