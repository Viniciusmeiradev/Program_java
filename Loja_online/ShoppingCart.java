import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Product> products;

    public ShoppingCart(){
        this.products = new ArrayList<>();
    }

    public void add(Product p){
        products.add(p);
        System.out.println("Product: "+p.getName()+" was added in shoopingcart.");
    }

    public void remove(String name){
        int id = -1;
        for(int i=0; i < products.size(); i++){
            if (products.get(i).getName().equals(name)){
                id = i;
                products.remove(id);
                break;
            } else{
                continue;
            }
        }
        if (id == -1){
            System.out.println("The product was not found.");
        }else{
            System.out.println("The product"+name+"was removed of shoppingcart.");
        }
    }
    
    public ArrayList<Product>getProducts(){
        return products;
    }
}