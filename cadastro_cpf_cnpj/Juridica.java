import java.util.Calendar;

public class Juridica extends Pessoa {
    //Atributos
    String cidade_sede;

    //Métodos
    public Juridica ( String razao_social , Calendar data_criacao , String CNPJ , String cidade_sede ) {
        super ( razao_social , data_criacao , "" );
        atualizarID ( CNPJ );
        this.cidade_sede = cidade_sede;
    }
    public String recuperarSede ( ) {
        return cidade_sede;
    }
    @Override
    public boolean atualizarID ( String CNPJ ) {
        if ( validarID ( CNPJ ) ) {
            this.identificador = CNPJ;
            return true;
        }
        else {
            System.out.println ( "CNPJ invalido!" );
            return false;
        }
    }
    @Override
    public String recuperarNome ( ) {
        return "<RAZAO SOCIAL> " + this.nome;
    }
    @Override
    protected String recuperarID ( ) {
        return String.format ( "%s.%s.%s/%s-%s" , identificador.substring ( 0 , 2 ) , identificador.substring ( 2 , 5 ) , identificador.substring ( 5 , 8 ) , identificador.substring ( 8 , 12 ) , identificador.substring ( 12 ) );
    }
    @Override
    public String toString (){
        return "Objeto:" + "\n\t- Classe: " + getClass().getName() + "\n\t- Hash: " + Integer.toHexString(hashCode()) + "\n\t- Nome: " + nome + "\n\t- Identificador: " + identificador;
    }
    private boolean validarID ( String CNPJ ) {
        //verifica sequência de dígitos iguais e tamanho (11 dígitos)
        if ( ! ( CNPJ.chars ( ).allMatch ( Character::isDigit ) ) ) {
            System.out.println ( "CNPJ possui caracteres não numéricos!" );
            return false;
        }
        else if ( ( CNPJ.length() != 14 ) || CNPJ.matches( "[0]{14}|[1]{14}|[2]{14}|[3]{14}|[4]{14}|[5]{14}|[6]{14}|[7]{14}|[8]{14}|[9]{14}" ) )
            return false;
        return true;
    }
}