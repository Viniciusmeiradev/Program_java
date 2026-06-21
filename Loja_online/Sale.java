import java.util.ArrayList;

public class Sale {
    ShoppingCart cart;

    public Sale(ShoppingCart cart){
        this.cart = cart;
    }

    public void totalPrice(){
        ArrayList<Product> p = cart.getProducts();
        double total = 0;

        for(int i=0; i<p.size(); i++){
            total += p.get(i).getPrice();
        }
        System.out.println("Total Price: "+total);
    }
}
