import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item>itens;

    public ShoppingCart(){
        itens = new ArrayList<>();
    }

    public void addItem(Item item){
        itens.add(item);
        System.out.println("-" +item.getName()+ " was added in shopping cart.");
        System.out.println("R$" +item.getPrice());
        System.out.println("");
    }

    public void removerItem(int id){
        for (int i=0;i<itens.size(); i++){
            if (itens.get(i).getId() == id){
                System.out.println("* "+itens.get(i).getName()+"This product was removed of shopping cart. ");
                itens.remove(i);
            }
        }
    }

    public void priceCalculation(){
        double allvalue = 0;
        for (int i=0; i < itens.size(); i++){
            allvalue += itens.get(i).getPrice();
        }
        System.out.println("-------------------");
        System.out.println("All is: R$" +allvalue);
        System.out.println("-------------------");
    }
}