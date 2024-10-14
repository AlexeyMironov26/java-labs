import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class Tasknum3 {

    public static void main(String[] Args){
        System.out.println("T3 Bit 1");
        System.out.println(freakyCouple("ratio", "orator"));

        System.out.println("T3 Bit 2");
        HashMap<String,Integer> PattMap = new HashMap<String,Integer>();
        PattMap.put("Laptop", 124200);
        PattMap.put("Phone", 51450);
        PattMap.put("Headphones", 13800);
        System.out.println(goodsList(PattMap, 25));

        System.out.println("T3 Bit 3");
        System.out.println(Aiming(0, 0, 5, 2, 2));
        System.out.println(Aiming(-2, -3, 4, 5, -6));

        System.out.println("T3 Bit 4");
        System.out.println(sumSameEven(243));
        System.out.println(sumSameEven(12));
        System.out.println(sumSameEven(3));

        System.out.println("T3 Bit 5");
        System.out.println(rps("rock", "paper"));
        System.out.println(rps("paper", "rock"));
        System.out.println(rps("paper", "scissors"));
        System.out.println(rps("scissors", "scissors"));
        System.out.println(rps("scissors", "paper"));

        System.out.println("T3 Bit 6");
        System.out.println(multiConst(39));
        System.out.println(multiConst(999));
        System.out.println(multiConst(4));



        System.out.println("T3 Bit 7");
        List<Object[]> list1 = List.of( new Object[]{"Скакалка", 550, 8}, 
        new Object[]{"Шлем", 3750, 4},
        new Object[]{"Мяч", 2900, 10});
        System.out.println(higherPrice(list1));

        System.out.println("T3 Bit 8");
        System.out.println(uniqueSub("abcab"));
        System.out.println(uniqueSub("bbb"));

        System.out.println("T3 Bit 9");
        System.out.println(isPref("automation", "auto-")); 
        System.out.println(isSuff("arachnophobia", "-phobia")); 
        System.out.println(isPref("retrospect", "sub-")); 
        System.out.println(isSuff("vocation", "-logy")); 

        System.out.println("T3 Bit 10");
        System.out.println(apprBrick(1, 1, 1, 1, 1)); 
        System.out.println(apprBrick(1, 2, 1, 1, 1)); 
        System.out.println(apprBrick(1, 2, 2, 1, 1)); 
    }


        public static boolean freakyCouple(String line1, String line2){
            if (line1.length()>0 && line2.length()>0 &&
            (line1.charAt(0) == line2.charAt(line2.length()-1))
             && (line1.charAt(line1.length()-1) == line2.charAt(0)) ){
                return true;
            } else {
                return false;
            }

    }

        public static boolean Aiming(int centX, int centY, int rad, int shotX, int shotY){
            if (Math.pow((Math.pow((shotX - centX), 2)+Math.pow((shotY-centY),2)), 0.5)<=rad){
                return true;
            }else {
                return false;
            }
            
        }
    
        public static HashMap<String,Integer> goodsList(HashMap<String,Integer> Prodlist, double discount){
            HashMap<String,Integer> res = new HashMap<String,Integer>(Prodlist);
            double offTheDisc = 1 - discount/100.0;
            for (String s: res.keySet()){
                if (res.get(s)*offTheDisc<1){
                    res.put(s, 1);
                }
                res.put(s, (int) Math.round(res.get(s)*offTheDisc));
            }
            
            return res;
        }
        public static boolean sumSameEven(int num){
            int sum = 0;
            for (int i=0; i<Integer.toString(num).length(); i++){
                sum+=Character.getNumericValue(String.valueOf(num).charAt(i));
            }

            if ((num%2==0 && sum%2==0) || (num%2!=0 && sum%2!=0)){
                return true;
            }else{
                return false;
            }
        }

            public static String rps(String pl1, String pl2){
                String res = "";
                if (pl1 == pl2){
                    res = "Tie";
                }
                else if ((pl1 == "rock" && pl2 =="scissors") || (pl1 == "paper" && pl2 =="rock") || (pl1 == "scissors" && pl2 =="paper")){
                    res = "Player 1 wins";
                } else {
                    res = "Player 2 wins";
                }
                return res;
        } 
        
        public static int multiConst(int num){
            int counter = 0;
            int numnext = num;
            while (numnext >= 10){
                int tnumnext = 1;
                for (int i = 0; i<String.valueOf(numnext).length();i++){
                    tnumnext*= Character.getNumericValue(String.valueOf(numnext).charAt(i));
                }
                numnext = tnumnext;
                counter++;
            }
            return counter;
        }
    public static String higherPrice(List<Object[]> goodList){
        int highest = 0;
        String Hobj = "";
        for (Object[] good : goodList){
            if ((int) good[1] * (int) good[2]>highest){
                highest = (int) good[1] * (int) good[2];
                Hobj = (String) good[0];
            }
        }
        return "Наиб. общ. стоимость у предмета "+Hobj+ " - "+ highest;
    }
    public static String uniqueSub(String str){
            String longest = "";
            String tlong = "";

            for (int i=0; i<str.length();i++){

                if (tlong.indexOf(str.charAt(i))==-1){
                        tlong+=str.charAt(i);
                        
                } else{
                    if (tlong.length()>longest.length()){
                        longest = tlong;
                    } 
                        tlong = tlong.substring(tlong.indexOf(str.charAt(i))+1)+str.charAt(i);
                    }
                }
            if (tlong.length() > longest.length()) {
                longest = tlong;
            }
           return longest; 
    }
        public static boolean isPref(String word, String prefix) {
            if (word.substring(0, prefix.length()-1).equals(prefix.substring(0, prefix.length()-1))){
                return true;
            } else{
                return false;
            }
        }
    
        public static boolean isSuff(String word, String suffix) {
            if (word.substring(word.length()-(suffix.length()-1), word.length()).equals(suffix.substring(1))){
                return true;
            } else{
                return false;
            } 
        } 
        
        public static boolean apprBrick(int a, int b, int c, int w, int h) {
      
            double[] arrB = new double[] {a,b,c};

            Arrays.sort(arrB);

            if (arrB[0]<=w && arrB[1]<=h){
                return true;
            }else{
                return false;
            }
        }

    }

