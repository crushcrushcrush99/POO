/**
 privado inteiro id
 privado cadeia nome
 privado intei
 **/

public class Heroi{

    private int id;
    private String nome;
    private int quantidadeDeMoedaDeOuro;

    public Heroi(){
    }

    public Heroi(int id, String nome, int quantidadeDeMoedaDeOuro){
        this.id = id;
        this.nome = nome;
        this.quantidadeDeMoedaDeOuro = quantidadeDeMoedaDeOuro;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantidadeDeMoedaDeOuro() {
        return quantidadeDeMoedaDeOuro;
    }
    public void setQuantidadeDeMoedaDeOuro(int quantidadeDeMoedaDeOuro) {
        this.quantidadeDeMoedaDeOuro = quantidadeDeMoedaDeOuro;
    }
}