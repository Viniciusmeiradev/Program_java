public class Main {
    public static void main(String[] args){
        System.out.println("Store Xamps");


        Product p1 = new Product("Heart Keychain ", "wood", 15.90);
        Product p2 = new Product("Gold chain", "Gold",39.90 );

        ShoppingCart c = new ShoppingCart();

        //Adicionar ao carrinho
        c.add(p1);
        c.add(p2);

        //Deletar
        c.remove("Gold chain");

        //Valortotal da venda
        Sale v = new Sale(c);
        v.totalPrice();


    }

}