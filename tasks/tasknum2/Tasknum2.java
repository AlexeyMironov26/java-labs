import java.util.Arrays;
// import java.util.Collections;
// import java.util.ArrayList;

public class Tasknum2{
    public static void main(String[] args){
        System.out.println("Part1");
        System.out.println(removeDuplChars("Barack", "Obama"));

        System.out.println("Part2");
        System.out.println(division3(new int[] {3,12,7,81,52}));

        System.out.println("Part3");
        System.out.println(iniOutput("simonov sergei evgenievich"));
        System.out.println(iniOutput("kozhevnikova tatiana vitalevna"));

        System.out.println("Part4");
        System.out.println(Arrays.toString(normalizer(new double[] {3.5, 7.0, 1.5, 9.0, 5.5})));
        System.out.println(Arrays.toString(normalizer(new double[] {10.0, 10.0, 10.0, 10.0})));

        System.out.println("Part5");
        System.out.println(compressNum(new double[] {1.6, 0, 212.3, 34.8, 0, 27.5}));

        System.out.println("Part6");
        System.out.println(flipFormat("helloWorld"));

        System.out.println("Part7");
        System.out.println(max2(new int[] {3, 5, 8, 1, 2, 4}));

        System.out.println("Part8");
        System.out.println(flipOver("baobab", 'b'));
        System.out.println(flipOver("Hello, I'm under the water, please help me", 'e'));


        System.out.println("Part9");
        System.out.println(amEqual(8, 1, 8));
        System.out.println(amEqual(5, 5, 5));
        System.out.println(amEqual(4, 9, 6));


        System.out.println("Part10");
        System.out.println(anagram("LISTEN", "silent"));
        System.out.println(anagram("Eleven plus two?", "Twelve plus one!"));
        System.out.println(anagram("hello", "world"));

        
        



    }
    
    public static String removeDuplChars(String lineA, String lineB){
        String lineA2 = lineA.toLowerCase();
        String lineB2 = lineB.toLowerCase();

        String originlet = "";
        for (int i=0; i<lineA2.length(); i++){
            if (lineB2.indexOf(String.valueOf(lineA2.charAt(i))) == -1){
                originlet += String.valueOf(lineA2.charAt(i));
            }
            else {
                continue;
            }
        }
        return originlet;
    }

    public static int division3(int[] list){
        int counter = 0;
        for (int i=0; i<list.length;i++){
            if ((list[i]%2!=0)&&(list[i]%3==0)){
                counter++;
            }
        }
        return counter;
    }
    public static String iniOutput(String fio){
        String result = "";
        String[] list = fio.split(" ");
        result+=list[0].substring(0,1).toUpperCase()+". ";
        result+=list[1].substring(0,1).toUpperCase()+". ";
        result+=list[2].substring(0,1).toUpperCase()+list[2].substring(1);
        
        return result;
    }

    public static double[] normalizer(double[] rlist){
        double[] result = new double[rlist.length];
        double[] rclist = Arrays.copyOf(rlist, rlist.length);
        Arrays.sort(rclist);
        double minel = rclist[0];
        double maxel = rclist[rlist.length-1];
        for (int i=0; i<rlist.length; i++){
            result[i] = (rlist[i] - minel)/(maxel-minel);
        }
        return result;
    }

    public static String compressNum(double[] list){
        int[] result = new int[0];
        for (int i=0;i<list.length;i++){
            if(list[i]!=0){
                result = Arrays.copyOf(result, result.length+1);
                result[result.length-1] = (int) list[i];
            }
        }
        Arrays.sort(result);
        return Arrays.toString(result);
    }

    public static String flipFormat(String line){
        for (int i=0; i<line.length();i++){
            if(Character.isUpperCase(line.charAt(i))){
                line = line.substring(0, i)+"_"+String.valueOf(line.charAt(i)).toLowerCase()+line.substring(i+1);
            }
        }
        return line;
    }
    public static int max2(int[] array){
        Arrays.sort(array);
        return array[array.length-2];
    }
    public static String flipOver(String line, char chr){
        boolean gateOpen = false;
        int mark = 0;
        for (int i=0;i<line.length();i++){
            if (line.charAt(i) != chr){
                continue;
            }
            gateOpen = !gateOpen;
            if (gateOpen == true){
                mark = i+1;
            }
            else{
                line = line.substring(0, mark)+new StringBuilder(line.substring(mark,i)).reverse().toString()+line.substring(i);
            }
        }
        return line;
    }
    public static int amEqual(int a, int  b, int c){
        int[] arr = {a, b, c};
        Arrays.sort(arr);
        if (arr[0]==arr[1] && arr[1]==arr[2]){
            return 3;
        }
        else if(arr[0]==arr[1]||arr[1]==arr[2]){
            return 2;
        }
        else{
            return 0;
        }

    }
    
    public static boolean anagram(String a, String b){
        String linea = a.toLowerCase();
        String lineb = b.toLowerCase();
        String[] arra = new String[0];
        String[] arrb = new String[0];
        for (int i=0;i<linea.length();i++){
            if (" .,!?".indexOf(lineb.charAt(i))== -1){
                arra = Arrays.copyOf(arra, arra.length+1);
                arra[arra.length-1] = String.valueOf(linea.charAt(i));
            }
        }
        for (int i=0;i<lineb.length();i++){
            if (" .,!?".indexOf(lineb.charAt(i))== -1){
                arrb = Arrays.copyOf(arrb, arrb.length+1);
                arrb[arrb.length-1] = String.valueOf(lineb.charAt(i));
            }
        }
        Arrays.sort(arra);
        Arrays.sort(arrb);
        return Arrays.equals(arra, arrb);
    }
}