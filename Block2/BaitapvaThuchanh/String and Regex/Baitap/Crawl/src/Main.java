import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
//            String[] arrTagA = new String[1000];
            ArrayList<String> arrTagA = new ArrayList<>();
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();
            content = content.replaceAll("\\n+", "");
            Pattern p = Pattern.compile("article-title\">(.*?)</h3>");
            Matcher matcher = p.matcher(content);
            while (matcher.find()){
                arrTagA.add(matcher.group(1));
            }

            Pattern p1 = Pattern.compile("\">(.*?)</a>");

            for (String tag : arrTagA){
                Matcher matcher1 = p1.matcher(tag);
                while (matcher1.find()){
                    System.out.println(matcher1.group(1));
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}