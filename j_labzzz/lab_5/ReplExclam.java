import java.util.regex.*;
import java.util.ArrayList;
public class ReplExclam {
    public static void main(String[] args) {
        try{
        ArrayList<String> elemlist = new ArrayList<>();
        String regex = "[a-z][A-Z]";
        String text = "nUmberA mNi aM";
        Pattern ptrn = Pattern.compile(regex);
        Matcher mtcr = ptrn.matcher(text);
        //String curelem = "";
        while (mtcr.find()) {
            elemlist.add(mtcr.group());
           text = text.replaceFirst(regex, "*"); 
        }
        for (String elem : elemlist){
            text = text.replaceFirst("\\*", "!"+elem+"!");
        }
        System.out.println(text);
    } catch (PatternSyntaxException p){
        System.out.println("Your regex pattern composed with some mistakes:/");
        p.printStackTrace();
    }
    }
    
}
