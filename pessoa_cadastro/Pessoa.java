package Pessoa_cadastro;

public class Pessoa {
    //Atributos
    protected String nome, naturalidade, nacionalidade, identificador;
    private int idade;
    private String endereco;

    //Metodos
    public Pessoa(String nome, String identificador, String endereco, String nacionalidade, String naturalidade){
        this.nome = nome;
        this.identificador = identificador;
        this.endereco = endereco;
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
    }
    public String toString(){
        return "Objeto:" + "\n\t- Classe: " + getClass().getName() + "\n\t- Hash: "
                + Integer.toHexString(hashCode()) + "\n\t- Nome: " + nome + "\n\t- Identificador: " + identificador;
    }
}
