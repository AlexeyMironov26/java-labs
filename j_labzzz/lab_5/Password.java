import java.util.regex.*;
public class Password {
public static void main(String[] args) {
    try{
    String text = "HIkidAAAAAAAAAAAAAAAsss1205";
    Pattern pat = Pattern.compile("(?=.*[A-Z])(?=.*\\d)[A-Za-z0-9]{8,16}");
    Matcher mat = pat.matcher(text);

    if (mat.matches()){
        System.out.println("Valid password");
    } else {
        System.out.println("password pattern's not correct, try again");

    }
} catch (PatternSyntaxException p){
    System.out.println("Your regex pattern composed with some mistakes:/");
    p.printStackTrace();
}
    
}
}