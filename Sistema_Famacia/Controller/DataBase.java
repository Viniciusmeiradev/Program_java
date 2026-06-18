package Controller;

import java.util.ArrayList;
import java.io.*;
import Model.Item;

public class DataBase {
    private Item item;
    
    public DataBase(){

    }

    public void register(Item item, boolean option){
        try{
            OutputStream os = new FileOutputStream("medications.txt", option);
            OutputStreamWriter osw = new OutputStreamWriter(os); 
            BufferedWriter bw = new BufferedWriter(osw);

            String line = item.getName()+ ","+item.getAmount()+ "," +item.getType();

            bw.write(line);
            bw.newLine();

            bw.close();
            osw.close();
            os.close();

            System.out.println("The medication "+item.getName()+" was registered with success!");

        } catch(Exception e){
            System.out.println("Medication doesnt register!");
            System.out.println(e);
        }
    }


    public void edit(int id, ArrayList<Item> itens){
        Item item = itens.get(id);
        itens.remove(id);
        item.setName("Multigrip 200ml XPSGA");
        item.setAmount(300);
        item.setType("Frasco 200ml");
        itens.add(id, item);

        for (int i=0; i < itens.size(); i++){
            if (i == 0){
                register(itens.get(i), false);
            }else{
                register(itens.get(i), true);
            }
        }
    }

    public Item research(int id, ArrayList<Item>itens){
        try{
            Item item = itens.get(id);
            return item;
        } catch(Exception e){
            return null;
        }
    }


    public void delete(int id, ArrayList<Item> itens){
        itens.remove(id);

        for(int i=0; i < itens.size(); i++){
            if (i == 0){
                register(itens.get(i), false);
            }else{
                register(itens.get(i), true);
            }
        }
    }


    public ArrayList<Item> read(){
        try{
            InputStream is = new FileInputStream("medications.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String line = br.readLine();
            ArrayList<String> lines = new ArrayList<>();

            while (line != null){
                System.out.println(line);
                lines.add(line);
                line = br.readLine();
            }

            System.out.println("The file medications.txt was readed with success!");

            ArrayList<Item> itens = new ArrayList<>();
            Item item;
            String[] elements = new String[3];
            for (int i = 0; i < lines.size(); i++){
                elements = lines.get(i).split(",");
                int amount = Integer.parseInt(elements[1]);
                item = new Item(elements[0], amount, elements[2]);
                itens.add(item);
            }

            System.out.println("Lines was converted at objects with success.");
            return itens;


        } catch(Exception e){
            System.out.println("Cant read the file!");
            return null;
        }
    }
}