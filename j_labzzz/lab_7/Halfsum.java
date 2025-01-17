public class Halfsum{
    public static void main(String[] args) {
    int[] arr1 = new int[]{1,2,3,4,5,6,7,8};
        Thread thread1 = new FirstThread(arr1);
        Thread thread2 = new SecondThread(arr1);
        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();

        } catch(InterruptedException i){
            i.printStackTrace();
        }
        System.out.println("Sum of 2 threads is: " + (FirstThread.sum+SecondThread.sum));
    }

    static class FirstThread extends Thread{
        private int[] halfarr;
        private static int sum;

        public FirstThread(int[] myarr){
            halfarr = myarr;
        }

        @Override
        public void run(){
            for (int i=0;i<halfarr.length/2;i++){
                sum+=halfarr[i];
            }
        }
    }

    static class SecondThread extends Thread{
        private int[] halfarr;
        private static int sum;

        public SecondThread(int[] myarr){
            halfarr = myarr;
        }

        @Override
        public void run(){
            for (int i=halfarr.length-1;i>=halfarr.length/2;i--){
                sum+=halfarr[i];
            }
        }
    }
}
