public class AvgVal{
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 15};
        double sum = 0;
        // arr = null;
        try {
            for (int i=0;i<arr.length;i++){
                sum+=arr[i];
            }
        sum = sum/arr.length;
            System.out.println("AVG of array is: "+ sum);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The index, which you address to is out of bondaries of current array");
        } catch(NullPointerException e){
            System.out.println("The array isn't created or equals null, pls initialize the array");
   
        }
        finally{
            System.out.println("it's always here");
        }
    }
}