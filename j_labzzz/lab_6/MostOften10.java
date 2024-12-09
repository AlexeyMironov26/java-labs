import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.List;

public class MostOften10 {
    public static void main(String[] args) {
    String filePath = "ray451.txt";
    File file = new File(filePath);
    Scanner scanner = null;
    String buffer = "";
    try {
    scanner = new Scanner(file);
    } catch (FileNotFoundException e) {
        System.out.println("Can't see the file in the current path");
    e.printStackTrace();
    }


    List<Map.Entry<String, Integer>> mlist1 = new ArrayList<>();

    while (scanner.hasNextLine()) {
        buffer += scanner.nextLine();
    }
    scanner.close();

    buffer = buffer.toLowerCase();
    String[] bufferarr = buffer.split("\\W+");


    for (int i=0; i<bufferarr.length;i++){
        int count = 0;
        for (int j=0; j<bufferarr.length;j++){
            if (bufferarr[i].equals(bufferarr[j])){
                count++;
            }
        }
        boolean exists = false;
        for (Map.Entry<String, Integer> entry : mlist1) {
            if (entry.getKey().equals(bufferarr[i])) {
            exists = true;
            break;
            }
        }
            if (!exists) {
                mlist1.add(new AbstractMap.SimpleEntry<>(bufferarr[i], count));
            
            }
    }

   
    Collections.sort(mlist1, new Comparator<Map.Entry<String, Integer>>() {
    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String,
    Integer> o2) {
        return o1.getValue().compareTo(o2.getValue());
    }
    });

    for (int i=mlist1.size()-1; i>mlist1.size()-10;i--){
        System.out.println(mlist1.get(i));
    }

    }
    

}