import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameExemple {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String CLASSNAME_REGEX = "^[C|A|P]{1}[0-9]{4}[G|H|I|K]{1}";
    public ClassNameExemple(){
        pattern = Pattern.compile(CLASSNAME_REGEX);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
