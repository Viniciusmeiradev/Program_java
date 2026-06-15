
public class Main {
    public static void main(String[] args){
        System.out.println("----------------------");
        System.out.println("Lanchonete  BurguerX");
        System.out.println("----------------------");

        Item item1 = new Item(45, "Pizza of chicken", 6.50);
        Item item2 = new Item(46, "Hamburguer of meat", 20.99);
        Item item3 = new Item(47, "Soda Fanta", 7.99);
        Item item4 = new Item(49, "Chocolate Pudding ", 4.99);

        ShoppingCart c = new ShoppingCart();

        c.addItem(item3);
        c.addItem(item1);
        c.addItem(item2);
        c.addItem(item4);

        c.removerItem(49);
        c.addItem(item3);

        c.priceCalculation();
    }
}