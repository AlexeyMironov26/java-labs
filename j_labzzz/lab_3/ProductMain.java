import java.util.Hashtable;

public class ProductMain {
    public static void main(String[] args) {
       Hashtable<Integer, Product> merchHT = new Hashtable<Integer, Product>();
       merchHT.put(11, new Product("watch", "shows time", 150, 5));
       merchHT.put(14, new Product("umbrella", "protect from rain", 200, 7));
       merchHT.put(20, new Product("cap", "just fancy thing", 300, 3));
       merchHT.remove(11);

       System.out.println(merchHT.get(14).convToStr());
       System.out.println(merchHT.get(20).convToStr());
    }
    
}
