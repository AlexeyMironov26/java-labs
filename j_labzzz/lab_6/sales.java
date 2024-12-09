import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sales {
    private List<product> soldProducts; 
    private Map<String, Integer> productSalesCount; 

    public sales() {
        soldProducts = new ArrayList<>();
        productSalesCount = new HashMap<>();
    }

    
    public void sellProduct(product product) {
        soldProducts.add(product);
        productSalesCount.put(product.getName(), productSalesCount.getOrDefault(product.getName(),
         0) + 1);
    }

    
    public void printSoldProducts() {
        System.out.println("List of sold products:");
        for (product product : soldProducts) {
            System.out.println(product.toString());
        }
    }

   
    public double totalSalesAmount() {
        double total = 0;
        for (product product : soldProducts) {
            total += product.getPrice();
        }
        return total;
    }

    
    public String mostPopularProduct() {
        String mostPopular = null;
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : productSalesCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostPopular = entry.getKey();
            }
        }
        return mostPopular;
    }

}
