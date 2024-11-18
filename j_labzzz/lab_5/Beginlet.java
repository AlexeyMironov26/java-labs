import java.util.regex.*;

public class Beginlet{
    public static void main(String[] args){
        try{
        String keylet = "T";
        String text = "Table stand in the ceter of Tom's room for long time";
        String regex = "\\b"+keylet+"\\S*\\b";
        Pattern pat = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher mat = pat.matcher(text);
        while (mat.find()){
            System.out.println(mat.group());
        }
    } catch (PatternSyntaxException p){
        System.out.println("Your regex pattern composed with some mistakes:/");
        p.printStackTrace();
    }
    }
}
