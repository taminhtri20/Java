import java.io.*;

public class TestIOText {
    public static void main(String[] args) throws IOException {
        File file = new File("list_song.txt");
        String[] arraySong = {"Hello califonia"
                ,"We don’t talk any more"
                , "Nắng ấm xa dần"
                , "Em của ngày hôm qua"
                , "Thất tình"};
//        writeDataToFileWithFileWriter("list_song.txt",arraySong);
//        readDataToFileWithFileReader("list_song.txt");
        writeDataToFileWithBufferWriter("list_song.txt",arraySong);
        readDataToFileWithBufferReader("list_song.txt");
    }
    public static void writeDataToFileWithFileWriter(String pathname,String[] arraySong) throws IOException {
        FileWriter fw = new FileWriter(pathname);
        for (String song : arraySong){
            fw.write(song+"\n");
        }
        fw.close();
    }
    public static void readDataToFileWithFileReader(String pathname) throws IOException {
        FileReader fr = new FileReader(pathname);
        int number;
        while ((number=fr.read()) != -1){
            System.out.print((char) number);
        }
        fr.close();
    }
    public static void writeDataToFileWithBufferWriter(String pathname,String[] arraySong) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(pathname));
        for (String song : arraySong){
            bw.write(song);
            bw.newLine();
        }
        bw.close();
    }
    public static void readDataToFileWithBufferReader(String pathname) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(pathname));
        String line ;
        while ((line= br.readLine()) != null){
            System.out.println(line);
        }
    }
}

