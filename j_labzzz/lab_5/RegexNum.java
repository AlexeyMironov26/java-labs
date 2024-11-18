import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.regex.Matcher;
public class RegexNum{
    public static void main(String[] args) {
        try{
        //String text = "number 90 number $91 number $92.05 number 93.15";
        String text = "number";
        Pattern ptrn = Pattern.compile("(\\d+\\.\\d+)|\\d+");
        Matcher mtcr = ptrn.matcher(text);
        if (mtcr.find()==false){
            System.out.println("Oops, Ze r no any of numbers in da str:/");
        }
        while (mtcr.find()){
            System.out.println(mtcr.group());
        }
        } catch (PatternSyntaxException p){
        System.out.println("Your regex pattern composed with some mistakes:/");
        p.printStackTrace();
    }

}
}