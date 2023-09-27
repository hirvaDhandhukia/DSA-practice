import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("hirva", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Hirva Codes");

        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Not found");
        }
    }
}
