import java.util.Calendar;

public class Principal {
    //Atributos
    private static Pessoa[] vetor;
    private static Calendar data_inicial = Calendar.getInstance();
    public static void main (String[] args){
        vetor = new Pessoa[6];
        data_inicial.set(1980, 10,21);
        vetor[0] = new Fisica ("Joao", data_inicial, "12398745687", "Canadense");
        data_inicial.set(1981,7,11);
        vetor[1] = new Fisica ("Rosangela", data_inicial, "24158962534", "Italiana");
        data_inicial.set(2000,1,11);
        vetor[2] = new Juridica("Java DevOps", data_inicial, "25967538000120", "Rio de Janeiro");
        data_inicial.set (2005,3,15);
        vetor[3] = new Juridica("Web Cursos", data_inicial, "12595436000123", "Joinville");
        data_inicial.set(1964,4,31);
        vetor[4] = new Fisica ("Vitoria", data_inicial, "75398669356", "Brasileiro");
        data_inicial.set (2015,8,2);
        vetor[5] = new Juridica("Bug Sistemas", data_inicial, "35975618000120", "Palmas");
        for (int i = 0; i<vetor.length; i++){
            System.out.println (String.format("DENOMINACAO: %s - ID: %s" , vetor[i].recuperarNome(), vetor[i].recuperarID()));
        }
    }
}