import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;


public class Tasknum5 {
    public static void main(String[] Args){
        System.out.println("T4 Bit 1");
        System.out.println(SLettPat("ABAB", "CDCD"));  
        System.out.println(SLettPat("ABCBA", "BCDCB")); 
        System.out.println(SLettPat("FFGG", "CDCD"));   
        System.out.println(SLettPat("FFFF", "ABCD")); 

        System.out.println("T4 Bit 2");
        System.out.println(freakySum(26, 39));
        System.out.println(freakySum(122, 81));
        System.out.println(freakySum(1222, 30277));

        System.out.println("T4 Bit 3");
        System.out.println(reCCount(4666));
        System.out.println(reCCount(544));
        System.out.println(reCCount(121317));
        System.out.println(reCCount(0));
        System.out.println(reCCount(12345));
        System.out.println(reCCount(1289396387328L));


        System.out.println("T4 Bit 4");
        System.out.println(totalPoints(new String[]{"cat", "create", "sat"}, "caster")); 
        System.out.println(totalPoints(new String[]{"trance", "recant"}, "recant"));     
        System.out.println(totalPoints(new String[]{"dote", "dotes", "toes", "set", "dot", "dots", "sted"}, "tossed")); 

        System.out.println("T4 Bit 5");
        System.out.println(longestSeq(new int[] {1, 2, 3, 5, 6, 7, 8, 9}));
        System.out.println(longestSeq(new int[] {1, 2, 3, 10, 11, 15}));
        System.out.println(longestSeq(new int[] {5, 4, 2, 1}));
        System.out.println(longestSeq(new int[] {3, 5, 7, 10, 15}));

        System.out.println("T4 Bit 6");
        System.out.println(takeDownAverage(new String[]{"95%", "83%", "90%", "87%", "88%", "93%"}));
        System.out.println(takeDownAverage(new String[]{"10%"})); 
        System.out.println(takeDownAverage(new String[]{"53%", "79%"}));

        System.out.println("T4 Bit 7");
        System.out.println(canMove("Rook", "A8", "H8")); 
        System.out.println(canMove("Bishop", "A7", "G1"));  
        System.out.println(canMove("Queen", "C4", "D6"));

        System.out.println("T4 Bit 8");
        System.out.println(maxPossible(9328, 456)); 
        System.out.println(maxPossible(523, 76)); 
        System.out.println(maxPossible(9132, 5564)); 
        System.out.println(maxPossible(8732, 91255));

        System.out.println("T4 Bit 9");
        System.out.println(timeDifference("Los Angeles", "April 1, 2011 23:23", "Canberra"));
        System.out.println(timeDifference("London", "July 31, 1983 23:01", "Rome"));          
        System.out.println(timeDifference("New York", "December 31, 1970 13:40", "Beijing"));

        System.out.println("T4 Bit 10");
        System.out.println(isNew(3)); 
        System.out.println(isNew(30)); 
        System.out.println(isNew(321)); 
        System.out.println(isNew(123));
    }

    public static boolean SLettPat(String str1, String str2){
        if (str1.length() != str2.length()) {
            return false; 
        }

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

           
            if (!map1.containsKey(char1)) {
                map1.put(char1, char2);
            } else if (map1.get(char1) != char2) {
                return false; 
            }

       
            if (!map2.containsKey(char2)) {
                map2.put(char2, char1);
            } else if (map2.get(char2) != char1) {
                return false;
            }
        }

        return true; 
    }

    public static int freakySum(int num1, int num2){
        String numb1 = String.valueOf(num1);
        String numb2 = String.valueOf(num2);
        String res = "";
        if (numb1.length() > numb2.length()) {
            numb2 = "0".repeat(numb1.length() - numb2.length()) + numb2;
        } else if (numb2.length() > numb1.length()) {
            numb1 = "0".repeat(numb2.length() - numb1.length()) + numb1;
        }

        for (int i=0; i<numb1.length();i++){
            res+=""+(Character.getNumericValue(numb1.charAt(i))+Character.getNumericValue(numb2.charAt(i)));
        }
        return Integer.valueOf(res);
    }

    public static int reCCount(long num){
        if (num<=9 && num>=0) {
            return 1;
        }
       return 1 + reCCount(num / 10);
    }


    public static int totalPoints(String[] guessedWords, String scrambledWord) {
        int points = 0;

        Map<Character, Integer> scrambledCounter = new HashMap<>();
        for (char c : scrambledWord.toCharArray()) {
            scrambledCounter.put(c, scrambledCounter.getOrDefault(c, 0) + 1);
        }

        for (String word : guessedWords) {
            Map<Character, Integer> wordCounter = new HashMap<>();
            for (char c : word.toCharArray()) {
                wordCounter.put(c, wordCounter.getOrDefault(c, 0) + 1);
            }

            boolean isValid = true;
            for (char c : wordCounter.keySet()) {
                if (wordCounter.get(c) > scrambledCounter.getOrDefault(c, 0)) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                int length = word.length();
                if (length == 3) {
                    points += 1;
                } else if (length == 4) {
                    points += 2;
                } else if (length == 5) {
                    points += 3;
                } else if (length == 6) {
                    points += 4+50; 
                }
            }
        }

        return points;
    }

    public static int longestSeq(int[] intarr){
        int len = 0;
        ArrayList<Integer> tlist = new ArrayList<>();
        tlist.add(intarr[1]);
        
            for (int j=0; j<intarr.length-1;j++){
                
                if(intarr[j]==intarr[j+1]+1||intarr[j]==intarr[j+1]-1){
                    tlist.add(intarr[j+1]);
                } else{
                    if(tlist.size()>len){
                        len = tlist.size();
                    }
                    tlist.clear();
                    tlist.add(intarr[1]);
                }
            }
            if(tlist.size()>len){
                len = tlist.size();
            }
            return len;

    }
    public static String takeDownAverage(String[] grades) {
        double total = 0;
        for (String grade : grades) {
            total += Integer.parseInt(grade.replace("%", ""));
        }
        double average = total / grades.length;
        
        double newAverage = average - 5;

        double requiredScore = (newAverage * (grades.length + 1)) - total;
        
        return Math.round(requiredScore) + "%";
    }

    public static boolean canMove(String piece, String start, String target) {
        int startX = start.charAt(0) - 'A';
        int startY = Character.getNumericValue(start.charAt(1)) - 1;
        int targetX = target.charAt(0) - 'A';
        int targetY = Character.getNumericValue(target.charAt(1)) - 1;

        switch (piece.toLowerCase()) {
            case "pawn":
                return startX == targetX && targetY == startY + 1; 
            case "knight":
                return (Math.abs(startX - targetX) == 2 && Math.abs(startY - targetY) == 1) ||
                       (Math.abs(startX - targetX) == 1 && Math.abs(startY - targetY) == 2);
            case "bishop":
                return Math.abs(startX - targetX) == Math.abs(startY - targetY); 
            case "rook":
                return startX == targetX || startY == targetY; 
            case "queen":
                return Math.abs(startX - targetX) == Math.abs(startY - targetY) || 
                       startX == targetX || startY == targetY; 
            case "king":
                return Math.abs(startX - targetX) <= 1 && Math.abs(startY - targetY) <= 1; 
            default:
                return false;
        }
    }

    public static int maxPossible(int num1, int num2) {
        char[] digits1 = String.valueOf(num1).toCharArray();
        char[] digits2 = String.valueOf(num2).toCharArray();

        
        Arrays.sort(digits2);
        reverseArray(digits2);

        int j = 0; 
        for (int i = 0; i < digits1.length; i++) {
            
            if (j < digits2.length && digits1[i] < digits2[j]) {
                digits1[i] = digits2[j]; 
                j++; 
            }
        }

        return Integer.parseInt(new String(digits1));
    }

    private static void reverseArray(char[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }


    public static String timeDifference(String cityA, String timestamp, String cityB) {
        
        double offsetA = getOffset(cityA);
        double offsetB = getOffset(cityB);

        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy HH:mm",Locale.ENGLISH);
        LocalDateTime localDateTime = LocalDateTime.parse(timestamp, formatter);

        
        int timeDifference = (int)((offsetB - offsetA) * 60); 

        
        LocalDateTime newTime = localDateTime.plusMinutes(timeDifference);

       
        return newTime.getYear() + "-" + newTime.getMonthValue() + "-" + newTime.getDayOfMonth() + " "
                + newTime.getHour() + ":" + String.format("%02d", newTime.getMinute());
    }

    private static double getOffset(String city) {
        switch (city) {
            case "Los Angeles": return -8.0;
            case "New York": return -5.0;
            case "Caracas": return -4.0;
            case "Buenos Aires": return -3.0;
            case "London": return 0.0;
            case "Rome": return 1.0;
            case "Moscow": return 3.0;
            case "Tehran": return 3.5;
            case "New Delhi": return 5.5;
            case "Beijing": return 8.0;
            case "Canberra": return 10.0;
            default: throw new IllegalArgumentException("Unknown city: " + city);
        }
    }


    public static boolean isNew(int number) {
        
        char[] digits = String.valueOf(number).toCharArray();
        Arrays.sort(digits); 
        
        for (int i = 0; i < number; i++) {
            char[] smallerDigits = String.valueOf(i).toCharArray();
            Arrays.sort(smallerDigits);

            
            if (Arrays.equals(digits, smallerDigits)) {
                return false;
            }
        }

        return true; 
    }

}



