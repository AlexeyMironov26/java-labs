import java.util.regex.*;

public class IP{
    public static void main(String[] args){
        try{
        String regex = "((25[0-5]|2[0-4][0-9]|[1]?[0-9]?[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|[1]?[0-9]?[0-9])";
        String IP = "0.199.24.255";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(IP);
        if (mat.matches()){
            System.out.println("valid IP");
        }else {
            System.out.println("invalid IP");
        }
    } catch (PatternSyntaxException p){
        System.out.println("Your regex pattern composed with some mistakes:/");
        p.printStackTrace();
    }
    }
}
