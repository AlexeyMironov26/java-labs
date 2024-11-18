import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.List;;

public class Tasknum4 {
    public static void main(String[] args) {
        System.out.println("T4 Bit 1");
        System.out.println(Rec4Cymb("abracadabra"));
        System.out.println(Rec4Cymb("abababcac"));
        System.out.println(Fourtoomuch("abracadabra"));
        System.out.println(Fourtoomuch("abababcac"));

        
        System.out.println("T4 Bit 2");
        System.out.println(specialCombos(1,5));
        System.out.println(specialCombos(2,2));
        System.out.println(specialCombos(5,3));

        System.out.println("T4 Bit 3");
        System.out.println(vernamEnc(new int[]{0, 31, 28, 10, 29},"MKIIT"));
        System.out.println(vernamDec("MTUCI","MKIIT").toString());

        System.out.println("T4 Bit 4");
        System.out.println(bracketDiv("()()()"));
        System.out.println(bracketDiv("((()))"));
        System.out.println(bracketDiv("((()))(())()()(()())"));
        System.out.println(bracketDiv("((())())(()(()()))"));

        System.out.println("T4 Bit 5");
        System.out.println(shortVersion("abbccc"));
        System.out.println(shortVersion("vvvvaajaaaaa"));

        
        System.out.println("T4 Bit 6");
        System.out.println(toRoman(8));
        System.out.println(toRoman(1234));
        System.out.println(toRoman(52));

        System.out.println("T4 Bit 7");
        System.out.println(evenIndex("31312131"));
        System.out.println(evenIndex("1111111"));
        System.out.println(evenIndex("12223234333"));

        

        System.out.println("T4 Bit 8");
		System.out.println(Arrays.toString(labirint( new int[][]
				{{ 1, 3, 1},
				 { 1,-1, 1},
				 { 4, 2, 1}})));
		System.out.println(Arrays.toString(labirint( new int[][]
				{{ 2,-7, 3},
				 {-4,-1, 8},
				 { 4, 5, 9}})));
		
            
        System.out.println("T4 Bit 9");
        System.out.println(orderByNum("t3o the5m 1One all6 r4ule ri2ng"));
        System.out.println(orderByNum("re6sponsibility Wit1h gr5eat power3 4comes g2reat"));
            
        System.out.println("T4 Bit 10");
        System.out.println(strFibanachi("CCCABDD"));
        System.out.println(strFibanachi("ABC"));
    }

    public static String Rec4Cymb(String str){
        String lstr = str.toLowerCase();
        for (int i=0; i<lstr.length();i++){
            String curchar = ""+lstr.charAt(i);
            String c_temp = lstr.replace(curchar,"");
            if (lstr.length()-c_temp.length()>3){
                return Rec4Cymb(c_temp);
            }
        }
        return lstr;
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


    public static ArrayList<String> allCombos(String word){
        ArrayList<String> list_c = new ArrayList<String>();
        if (word.length()==0){
            list_c.add("");
            return list_c;
        }

        for (int i=0; i<word.length();i++){
            char curchar = word.charAt(i);
            String subleft = word.substring(0, i)+word.substring(i+1);
            ArrayList<String> sub_c = allCombos(subleft);
            for (String sub_1c : sub_c){
                list_c.add(curchar+sub_1c);
            }
        }
        return list_c;
    }

    public static String specialCombos(int len, int power){
        String s = "";
        if (len>power){
            return Arrays.toString(new String[0]);
        }
        for (int i=0; i<power;i++){
            s+=i;
        }
        ArrayList<String> list_c = allCombos(s);
        for (int i = 0; i <list_c.size(); i++) {
            list_c.set(i, list_c.get(i).substring(0,list_c.get(i).length()-(power-len)));
        }
        ArrayList<String> n_list_c = new ArrayList<>();
        for (String str_l : list_c){
            if (!n_list_c.contains(str_l)){
                n_list_c.add(str_l);
            }
            
        } 
    return n_list_c.toString();      
    }

    public static ArrayList<Integer> vernamDec(String str, String key){
        ArrayList<Integer> list_num = new ArrayList<Integer>();
        for (int i=0; i<str.length();i++){
            int cypher = (int) str.charAt(i) ^ (int) key.charAt(i);
            list_num.add(cypher);
        }
        
        return list_num;
    }

    public static String vernamEnc(int[] arrnum, String key){
    String ini_str = "";
        for (int i=0; i<key.length();i++){
            ini_str+= (char) (arrnum[i] ^ (int) key.charAt(i));
        }
        return ini_str;
    }
    
    public static String bracketDiv(String cluster){
        int b_count = 0;
        ArrayList<String> res = new ArrayList<>();
        String b_temp = "";
        for (int i=0;i<cluster.length();i++){
            if (cluster.charAt(i)=='('){
                b_temp+=cluster.charAt(i);
                b_count++;
            } else{
                b_temp+=cluster.charAt(i);
                b_count--; 
            }
            if (b_count==0){
                res.add(b_temp);
                b_temp = "";
                
            }
        }
        return res.toString();
    }
    public static String shortVersion(String str){
        int count_r = 1;
        String res = "";
        for (int i=0; i<str.length();i++){
            try{
                if (str.charAt(i)==str.charAt(i+1)){
                    count_r+=1;
                } else{
                    if(count_r==1){
                        res+=str.charAt(i);
                    } else{
                        res+=str.charAt(i)+"*"+count_r;
                        count_r = 1;
                    }
                }
            } catch(StringIndexOutOfBoundsException e){
                if(count_r==1){
                    res+=str.charAt(i);
                } else{
                    res+=str.charAt(i)+"*"+count_r;
                }
            }
            
        }
        return res;
    }
    public static String toRoman(int num){
        int[] arabnum = new int[]{1000,500,100,50,10,5,1};
        String romanum = "";
        Map<Integer,Character> dict = Map.of(
        1, 'I',  
        5, 'V', 
        10, 'X', 
        50, 'L',
        100, 'C', 
        500, 'D', 
        1000, 'M'
    );
    while (num>0){
        for (int p_num: arabnum){
            while (num>=p_num){
                romanum += dict.get(p_num);
                num-=p_num;   
            }
        }
    }
    String new_roma = romanum;
    if (romanum.length()>=5){
    for (int i=romanum.length()-1; i>=4; i--){
        for (int j=arabnum.length-1;j>=0;j--){
            if (romanum.charAt(i)==romanum.charAt(i-1) && 
            romanum.charAt(i-1)==romanum.charAt(i-2) &&
            romanum.charAt(i-2)==romanum.charAt(i-3)){
                if (dict.get(arabnum[j])==romanum.charAt(i)){
                    if(!(romanum.charAt(i-4)==dict.get(arabnum[j-1]))){
                        new_roma = new_roma.replaceAll(romanum.charAt(i)+"{"+4+"}",
                     romanum.charAt(i)+""+dict.get(arabnum[j-1]));         
                    }else{
                        new_roma = new_roma.replaceAll(romanum.charAt(i-4)+"",
                     "");
                        new_roma = new_roma.replaceAll(romanum.charAt(i)+"{4}",
                     romanum.charAt(i)+""+dict.get(arabnum[j-2]));        
                        }
                    } 
                }
            }
        }
    } else if(new_roma.length()==4){
        for (int j=arabnum.length-1;j>=0;j--){
            if (dict.get(arabnum[j])==romanum.charAt(0)){
                new_roma=new_roma.replaceAll(new_roma.charAt(0)+"{4}",
                 new_roma.charAt(0)+""+dict.get(arabnum[j-1]));
            }
        }
    }
    return new_roma;
    }

    public static String evenIndex(String str){
    int count = 0;
    char chr = '.';
    String res = "чет";
    for (int i=0; i<str.length();i++){
        int in_count = 0;
        for (int j=0; j<str.length();j++){
            if (str.charAt(i)==str.charAt(j)){
                in_count++;
            }
        }
        if (in_count>count){
            count = in_count;
            chr = str.charAt(i);
        }
    }
    if (str.lastIndexOf(chr)%2!=0){
        res="нечет";
    }
    return res;
}

public static String orderByNum(String str){
    String[] arr_s = str.split(" ");
    String new_str = "";
    HashMap<Integer,String> r_ord = new HashMap<>();

    for (String str1 : arr_s){
        for(int i=0; i<10;i++){
            if (str1.indexOf(""+i)!=-1){
                r_ord.put(Integer.parseInt(""+str1.charAt(str1.indexOf(""+i))), 
                str1.replaceAll("[0-9]",""));
            }
        
        }
    }
    for (int i=1; i<r_ord.size();i++){
        new_str+=r_ord.get(i)+" ";  
    }
    return new_str;
}
public static boolean strFibanachi(String str){
    ArrayList<Integer> fibnum = new ArrayList<>(List.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,233,377,610,987));
    ArrayList<Integer> ims_am = new ArrayList<>();
    boolean mark = true;
    String nstr = str;
    for (int i=0; i<str.length();i++){
        int count = 0;
        for (int j=0; j<nstr.length();j++){
            if (str.charAt(i)==nstr.charAt(j)){
                count++;
                }
            }
        nstr = nstr.replace(""+str.charAt(i),"");
        if (count!=0){
            ims_am.add(count);
        }
        }
        for (Integer ints : ims_am ){
            if (fibnum.contains(ints)){
               fibnum.remove(ints);
            } else{
                mark = false;
            }
        }
        return mark;
    }
    private static String labinavNext(String a) {
		char[] ws = a.toCharArray();

		for (int i = 0; i < ws.length; i++) {
			if (ws[i] == 'l') {
				ws[i] = 'r';
				break;
			}
			ws[i] = 'l';
		}
		
		return String.valueOf(ws);
	}

    private static String[] labirint(int[][] m) {
		String[] out = {"", ""}; // {log, sum}
		int matSize = m.length;
		int pathLength = matSize * 2;
		int minLen = Integer.MAX_VALUE; 
		String movLog = "";
		for (int i = 0; i < pathLength; i++) movLog += "l";
		for (int i = 0; i < Math.pow(2, pathLength); i++) {
			int x = matSize-1;
			int y = matSize-1;
			boolean solved = false;
			
			String curLog = String.valueOf(m[y][x]);
			int curLen = m[y][x];
			
			for(int j = 0; j < pathLength; j++) {
				if (movLog.charAt(j) == 'l') x-=1;
				else y-=1;
				if (x < 0 || y < 0 || m[x][y] < 0) break;
				curLog += "-" + String.valueOf(m[y][x]);
				curLen +=m[y][x];
				if (x == 0 && y == 0) solved = true;
			}
			
			if (solved && minLen > curLen) {
				minLen = curLen;
				out[0] = curLog;
				out[1] = String.valueOf(minLen);
			}
			movLog = labinavNext(movLog);
		}
		
		if (out[1] == "") return new String[] {"the way haven't been found"};
		return out;
	}

    // public static String labirint1(int[][] mat){
    //     String res = "";
    //     int sum = 0;
        


    //     return res;
    // }
}