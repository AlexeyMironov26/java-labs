public class CustomStack {
    String[] elems;

    public CustomStack(int stackSize){
        elems = new String[stackSize];
    }

    public CustomStack(){
        this(10);
    }

    public void SetEl(int index, String val){
       elems[index] = val; 
    }

    public String GetEl(int index) throws CustomEmptyStackException{
        if (elems[index]==null){
            throw new CustomEmptyStackException("You try to fetch the element from an empty stack");
        }
        return elems[index];
    }
}
