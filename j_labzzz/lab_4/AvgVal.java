public class AvgVal{
    public static void main(String[] args) {
        Object[] arr = {2, 2, 3, 4, 15};
        //Object[] arr = {2, 2, 3, 4, "hi"}; //cause ClassCastException
        double sum = 0;
        // arr = null; //cause NullPointerException
        try {
            for (int i=0;i<arr.length;i++){
                sum+= (int) arr[i];
                //sum+=arr[i+1]; //cause ArrayIndexOutOfBoundsException
            }
        sum = sum/arr.length;
            System.out.println("AVG of array is: "+ sum);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The index, which you address to is out of bondaries of current array");
        } catch(ClassCastException c){
            System.out.println("wrong data obtained, the element of array must be a number");
        }catch(NullPointerException e){
            System.out.println("The array isn't created or equals null, pls initialize the array");
   
        }
        finally{
            System.out.println("it's always here");
        }
    }
}