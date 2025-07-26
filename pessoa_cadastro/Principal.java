package Pessoa_cadastro;

public class Principal {
    private static Pessoa grupo[];
    public static void main (String args[]){
        grupo = new Pessoa[2];
        grupo[0] = new Fisica("Marco Antonio", "365.586.875-45", null, "Brasil", "Rio de Janeiro");
        grupo[1] = new Pessoa("Escola Novo Mundo Ltda", "43.186.666/0001-25", null, "EUA", "Florida");
        for (int i = 0; i <= 1; i++)
            System.out.println("grupo["+ i +"]"+ grupo[i].toString());
    }
}
