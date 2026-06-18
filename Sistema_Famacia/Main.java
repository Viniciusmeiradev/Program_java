import Controller.DataBase;
import Model.Item;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        System.out.println("Pharmacy System");

        //Register
        /*Item dipirona = new Item("Dipirona 500mg", 100, "Caixa");
        Item vitaminaC = new Item("Vitamina C", 20, "Caixa"); 
        DataBase base = new DataBase();
        base.register(dipirona);
        base.register(vitaminaC);*/

        //Read
        /*DataBase base = new DataBase();
        ArrayList<Item> itens = base.read();
        for (int i = 0; i < itens.size(); i++){
            System.out.println("Index: "+i+ " - Name: "+itens.get(i).getName()+", Amount: "+itens.get(i).getAmount()+" - Type: "+itens.get(i).getType());
        }*/

        //Research
        /*DataBase base = new DataBase();
        ArrayList<Item> itens = base.read();
        Item item = base.research(4, itens);
        if (item != null){ 
            System.out.println("Product finded: "+item.getName());
        } else{
            System.out.println("Dont have madication registered with this code!");
        }*/

        //Delete
        /*DataBase base = new DataBase();
        ArrayList<Item> itens = base.read();
        base.delete(1, itens);*/

        //Edit
        DataBase base = new DataBase();
        ArrayList<Item> itens = base.read();
        base.edit(0,itens);
    }
}