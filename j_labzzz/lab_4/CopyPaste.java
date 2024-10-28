import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.util.NoSuchElementException;
import java.io.IOException;
import java.io.File;

public class CopyPaste {
    public static void main(String[] args) {
        String CopFilepath = "copyfromhere.txt";
        String InsFilepath = "pastetohere.txt";
        String tempData = "";

        try{
        File Copfile = new File(CopFilepath);
        Scanner readman = new Scanner(Copfile);
        while (readman.hasNextLine()){
            tempData+=readman.nextLine()+"\n";
        }
        readman.close();

        } catch(FileNotFoundException e) {
            System.out.println("No such file in current directory, please correct the name of the path.");
            e.printStackTrace();
        } catch(NoSuchElementException e){
            System.out.println("You try to copy from an empty file");
            e.printStackTrace();
        } catch(Exception e){
            System.out.println("Smth went wrong :(");
            e.printStackTrace();
        } 

        try{
            FileWriter writeman = new FileWriter(InsFilepath);
            writeman.write(tempData);
            writeman.close();
            //writeman.write(tempData);

        }
            catch(FileNotFoundException e){
                System.out.println("No such file with given path or name");
                e.printStackTrace();
            } catch(IOException i) {
                System.out.println("Maybe you are trying to read with readman after closing it?...");
                i.printStackTrace();
            } catch(Exception e){
                System.out.println("We've got the problem(");
                e.printStackTrace();
            } 
    }
    
}
