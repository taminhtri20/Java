import java.io.BufferedWriter;

public class FileWriter {
    public boolean writeFile(String path,String data){
        try {
            BufferedWriter bw = new BufferedWriter(new java.io.FileWriter(path));
            bw.write(data);
            bw.close();
            return true;
        }catch (Exception e){
            System.out.println("file k ton tai");
        }
        return false;
    }
}
