import java.util.ArrayList;
import java.util.List;

public class Load{
    static StorageA p_StorageA = new Load().new StorageA(7);
    static StorageB p_StorageB = new Load().new StorageB();
    public static void main(String[] args) {
       Thread loader1 = new Load().new Loader();
       Thread loader2 = new Load().new Loader();
       Thread loader3 = new Load().new Loader();
       while(p_StorageA.getTotal()!=0){
        loader1.start();
        loader2.start();
        loader3.start();
        try {
            loader1.join();
            loader2.join();
            loader3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       }
       System.out.println(p_StorageB.getList());
    }
    
    class Merchandise{
        private int weight;

        public Merchandise(int wei){
            weight=wei;
        }

        public int getWei(){
            return weight;
        }
    }

    class StorageA{
        private List<Merchandise> merchStack = new ArrayList<>();
        private int total = 0;

        public int getTotal(){
            return total;
        }

        public synchronized int particWei(){
            if(!merchStack.isEmpty()){
                return merchStack.get(0).getWei();
            }
            else{
                return 0;
            }
        }

        public StorageA(int amount){
            for(int i=0; i<amount;i++){
                Merchandise tmerch = new Merchandise(11);
                merchStack.add(tmerch);
                total+=tmerch.getWei();
            }
        }

        public synchronized Merchandise takethelast(){
            Merchandise merch = merchStack.get(merchStack.size()-1);
            total-=merch.getWei();
            merchStack.remove(merchStack.size()-1);
            return merch;
        }
    }

    class Loader extends Thread {
        private List<Merchandise> merchload = new ArrayList<>();
        private int Ltotal = 0;
        final private int limit1 = 50;

        @Override
        public void run(){
            while (p_StorageA.merchStack.size()!=0 && Ltotal+p_StorageA.particWei()<=limit1){
                Merchandise tempM = p_StorageA.takethelast();
                merchload.add(tempM);
                Ltotal+=tempM.getWei();
            }
            try{
                Thread.sleep(1500);
            }catch(InterruptedException r){
                r.printStackTrace();
            }

            while(!merchload.isEmpty()){
                Merchandise lastel = merchload.get(merchload.size()-1);
                p_StorageB.putin(lastel);
                Ltotal-=lastel.getWei();
                merchload.remove(merchload.size()-1);
            }
        }
    }

    class StorageB{
        private ArrayList<Merchandise> merchStackB = new ArrayList<>();
        private int total = 0;

        public int getTotal(){
            return total;
        }

        public synchronized void putin(Merchandise merchy){
            merchStackB.add(merchy);
            total+=merchy.getWei();
        }

        public List<Merchandise> getList(){
            return merchStackB;
        }
    }
}