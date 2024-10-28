import java.io.FileWriter;
import java.io.IOException;
//import CustomEmptyStackException;

public class MainStackEx {
    public static void main(String[] args) {
        String Logging_path = "LogOfErr.txt";
        CustomStack OurStack = new CustomStack();
        OurStack.SetEl(0, "mysterious thing");
        OurStack.SetEl(1, "spooky journal");
        OurStack.SetEl(2, "grappling hook");
        OurStack.SetEl(3, "beavers<3");
        OurStack.SetEl(4, "Gooblewonker");
        OurStack.SetEl(5, "cursed wax figure");
        OurStack.SetEl(6, "magic flashlight");

        try {
            System.out.println(OurStack.GetEl(0));
            System.out.println(OurStack.GetEl(2));
            System.out.println(OurStack.GetEl(4));
            System.out.println(OurStack.GetEl(6));
            System.out.println(OurStack.GetEl(7));; //cause CustomEmptyStackException

        } catch(CustomEmptyStackException e){
            System.out.println("This stack do not consist anything, even a mystery :O");
            e.printStackTrace();
            try{
                FileWriter writeman = new FileWriter(Logging_path, true);
            writeman.write(e.toString()+"\n");
            writeman.close();
            //writeman.write(e.toString()); //cause IOException
            } catch(IOException i){
                System.out.println("Apparently here are more mysteries, than you capable to comprehend");
                i.printStackTrace();
            }
        }

    }
}
