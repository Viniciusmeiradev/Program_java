import java.util.Calendar;

//Classe
public class Fisica extends Pessoa{
    //Atributos
    String nacionalidade;

    //Metodos
    public Fisica (String nome, Calendar data_nascimento, String CPF, String nacionalidade){
        super(nome, data_nascimento,"");
        atualizarID (CPF);
        this.nacionalidade = nacionalidade;
    }
    public String recuperarNacionalidade(){
        return nacionalidade;
    }
    @Override
    public boolean atualizarID(String CPF){
        if (validarID (CPF)){
            this.identificador = CPF;
            return true;
        }
        else{
            System.out.println("CPF invalido!");
            return false;
        }
    }
    @Override
    public String recuperarNome(){
        return "<NOME>" + this.nome;
    }
    @Override
    protected String recuperarID (){
        return String.format ("%s.%s.%s - %s", identificador.substring(0, 3), identificador.substring(3,6) , identificador.substring(6,9), identificador.substring(9));
    }
    @Override
    public String toString(){
        return "Objeto:" + "\n\t- Classe: " + getClass().getName() + "\n\t- Hash:" + Integer.toHexString(hashCode()) + "\n\t- Nome: " + nome + "\n\t- Identificador: " + identificador;
    }
    private boolean validarID (String CPF){
        //verificar sequencia de digitos iguais e tamanho(11 digitos)
        if (!(CPF.chars ().allMatch(Character::isDigit))){
            System.out.println ("CPF possui caracteres não númericos");
            return false;
        }
        else if ((CPF.length() !=11 ) || CPF.matches("[0]{11}|[1]{11}|[2]{11}|[3]{11}|[4]{11}|[5]{11}|[6]{11}|[7]{11}|[8]{11}|[9]{11}"))
            return false;
        return true;
    }
}
