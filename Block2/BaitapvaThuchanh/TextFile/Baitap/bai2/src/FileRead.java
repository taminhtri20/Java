import java.io.BufferedReader;
import java.io.FileReader;

public class FileRead {
    public String readFile(String path){
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            while ((line= br.readLine()) != null){
                sb.append(line);
                sb.append(System.lineSeparator());
            }
        }catch (Exception e){
            System.out.println("file k ton tai");
        }
        return sb.toString();
    }
}
