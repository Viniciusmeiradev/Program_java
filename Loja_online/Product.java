public class Product {
    private String name;
    private String describe;
    private double price;

    public Product(){
        this.name = "";
        this.describe = "";
        this.price = 0;
    }


    public Product(String name, String describe, double price){
        this.name = name;
        this.describe = describe;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getDescribe(){
        return describe;
    }
    public void setDescribe(String describe){
        this.describe = describe;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

}