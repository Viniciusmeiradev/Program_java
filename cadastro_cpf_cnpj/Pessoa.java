import java.util.Calendar;

public abstract class Pessoa{
    protected String nome;
    protected Calendar data_inicio_existencia;
    protected String identificador;

    public Pessoa(String nome, Calendar data_inicio_existencia, String identificador){
        this.nome = nome;
        this.data_inicio_existencia = data_inicio_existencia;
        this.identificador = identificador;
    }
    public String recuperarNome(){
        return this.nome;
    }
    protected abstract boolean atualizarID (String identificador);
    protected abstract String recuperarID ();
}