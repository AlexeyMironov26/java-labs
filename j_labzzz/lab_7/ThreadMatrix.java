import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class ThreadMatrix {

    static List<Integer> listmax = new ArrayList<>();
    public static void main(String[] args) {
        int[][] mat1 = new int[][]{
        {1,2,18,4,2},
        {1,2,7,4,35},
        {1,21,3,14,7},
        {10,2,10,4,49}
    };
        List<Thread> threadlinks = new ArrayList<>();
        for (int i=0; i<mat1.length;i++){
            Thread thread1 = new ThreadMax(mat1[i]);
            threadlinks.add(thread1);
            thread1.start();
            try{
                thread1.join();
    
            } catch(InterruptedException h){
                h.printStackTrace();
            }
        }
        for (Thread thr_link:threadlinks){
            try{
                thr_link.join();
            } catch(InterruptedException h){
                h.printStackTrace();
            }
        }

           
            System.out.println("Maximal number of matrix: " + Collections.max(listmax));
        }
    

    
        static class ThreadMax extends Thread{
            private int[] arr;
    
            public ThreadMax(int[] myarr){
                arr = myarr;
            }
    
            @Override
            public void run(){
                int maxarr=0;
                for (int i=0;i<arr.length;i++){
                    if (arr[i]>=maxarr){
                        maxarr=arr[i];
                    }
                }
                listmax.add(maxarr);
            }
        }
    }
