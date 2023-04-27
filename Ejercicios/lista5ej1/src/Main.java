/**
 1- incluir 4 heroes, siendo uno de ellos repetido
 2- remover el primer heroe
 3- presentar el total de monedas de oro de time
 **/
 public class Main{
    public static void main(String[] args){
    // 1- incluir 4 herois, sendo um deles repetido
    Heroi homemFerro = new Heroi(1, "Homem-de-Ferro", 16);
        //homemFerro.setId(1);
        // homemFerro.setNome("Homem-de-ferro");
        //homemFerro.setQuantidadeDeMoedaDeOuro(16);
    Heroi capitaoAmerica = new Heroi( 2, "Capitao-America", 10);
    Heroi spiderMan = new Heroi( 3, "Spider-Man", 10);
    Heroi gaviaoArqueiro = new Heroi( 3, "Gaviao-Arqueiro", 10);

    Grupo vingadores = new Grupo();
    vingadores.adicionarHeroi(homemFerro);
    vingadores.adicionarHeroi(capitaoAmerica);
    vingadores.adicionarHeroi(spiderMan);
    vingadores.adicionarHeroi(gaviaoArqueiro);

    //2-remover o primeiro heroi
    vingadores.removerHeroi(homemFerro.getId());

    //3- apresentar o total de moedas de ouro do time
    System.out.println("O total de moedas de ouro " + vingadores.getTotalMoedasDeOuro());

    }
 }