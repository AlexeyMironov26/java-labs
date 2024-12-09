public class mainSales {
    public static void main(String[] args) {
        product hat = new product("hat", 10);
        product cat = new product("cat", 20);
        product watch = new product("watch", 30);
        product jacket = new product("jacket", 35);
        product pants = new product("pants", 25);
        sales newsales = new sales();
        newsales.sellProduct(hat);
        newsales.sellProduct(hat);
        newsales.sellProduct(cat);
        newsales.sellProduct(cat);
        newsales.sellProduct(cat);
        newsales.sellProduct(watch);
        newsales.sellProduct(jacket);
        newsales.sellProduct(pants);
        newsales.printSoldProducts();
        System.out.println(newsales.totalSalesAmount());
        System.out.println(newsales.mostPopularProduct());

    }
    
}
