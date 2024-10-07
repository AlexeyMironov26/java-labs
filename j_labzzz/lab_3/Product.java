public class Product {
    public String name;
    public String description;
    public int price;
    public int stock;

    public Product(String n_, String desc, int p_, int s_){
        name = n_;
        description = desc;
        price = p_;
        stock = s_;
    }

    public Product(){
        this("name","description",10,1);

    }

    public String convToStr(){
        String output = "";
        output+=name+" "+description+" "+String.valueOf(price)+" "+String.valueOf(stock);
        return output;
    }

    
}
