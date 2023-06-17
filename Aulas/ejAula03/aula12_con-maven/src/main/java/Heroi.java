public class Heroi {
    private int id;
    private String nome;
    private int quantidadeMoedasOuro;

    public Heroi(){}
    public Heroi(int id, String nome, int quantidadeMoedasOuro) {
        this.id = id;
        this.nome = nome;
        this.quantidadeMoedasOuro = quantidadeMoedasOuro;
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

    public int getQuantidadeMoedasOuro() {
        return quantidadeMoedasOuro;
    }

    public void setQuantidadeMoedasOuro(int quantidadeMoedasOuro) {
        this.quantidadeMoedasOuro = quantidadeMoedasOuro;
    }
}
