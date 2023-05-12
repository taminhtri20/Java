import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("FileWrter");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter br = new BufferedWriter(fw);

            br.write("bai tap");
            br.newLine();
            br.write("da xong");
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line= br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}