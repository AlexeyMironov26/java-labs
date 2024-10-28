import java.util.Arrays;
public class Tasknum4 {
    public static void main(String[] args) {
        System.out.println("T4 Bit 1");
        System.out.println(Fourtoomuch("abracadabra"));
        System.out.println(Fourtoomuch("abababcac"));

        
        System.out.println("T4 Bit 2");
        System.out.println();

        System.out.println("T4 Bit 3");
        System.out.println();
            
        System.out.println("T4 Bit 4");
        System.out.println();
            
        System.out.println("T4 Bit 5");
        System.out.println();
            
        System.out.println("T4 Bit 6");
        System.out.println();
            
        System.out.println("T4 Bit 7");
        System.out.println();
            
        System.out.println("T4 Bit 8");
        System.out.println();
            
        System.out.println("T4 Bit 9");
        System.out.println();
            
        System.out.println("T4 Bit 10");
        System.out.println();
            

    }

    public static String Fourtoomuch(String str){
        int count3 = 0;
        char curchar = str.charAt(0);
        for (int i=0; i<str.length(); i++ ){
            for (int j=0; j<str.length(); j++){
                if (str.charAt(j)!=curchar){
                    continue;
                }
                count3+=1;
                if (count3>3){
                    str = str.replace(String.valueOf(str.charAt(j)), "");
                    count3 = 0;
                }
            }
            curchar = str.charAt(i);
            count3=0;
        }
        return str;
    }

    public static String allCombos(int len, int power){
        //int[] allc = new int[0];
        int[] alfabet = new int[0];

        for (int i=0; i<power;i++){
            alfabet = Arrays.copyOf(alfabet, alfabet.length+1);
            alfabet[alfabet.length-1] = i;
        }
        for (int i=0; i<alfabet.length;i++){

        }
        return "smth";

    }
}
