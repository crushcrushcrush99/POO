import java.util.ArrayList;

    public class Grupo{

        private ArrayList<Heroi> herois;

        private int totalMoedasDeOuro;

        public void adicionarHeroi(Heroi heroi){
            //verificar se heroi já existe
            //boolean existe = false;
            for(int i = 0; i < this.herois.size(); i++){
                Heroi item = this.herois.get(i);
                if(item.getId() == heroi.getId()){
                    System.out.println("O heroi já está no grupo");
                    //existe = true;
                    return;
                }
            }

            //for (Heroi item : this.herois){sirve como el de arriba
            //	if(item.getId) == heroi.getId()){
            //	System.out.println("o heroi ja esta no grupo");
            //	return;
            //	}
            // }


            //if(existe == false){
            this.herois.add(heroi); //adiciona o heroi na lista
            this.totalMoedasDeOuro = this.totalMoedasDeOuro + heroi.getQuantidadeDeMoedaDeOuro();
            //actualiza o total de moedas
            System.out.println("O heroi " + heroi.getNome() + " foi adicionado ao grupo!");
            //}
        }
        public void removerHeroi(int idHeroi){
            for(int i = 0; i < this.herois.size(); i++){
                Heroi item = this.herois.get(i);
                if(item.getId() == idHeroi){
                    this.herois.remove(i);
                    this.totalMoedasDeOuro = this.totalMoedasDeOuro - item.getQuantidadeDeMoedaDeOuro();
                    System.out.println("O heroi " + item.getNome() + " foi removido do grupo!");
                    return;
                }
            }
        }

        public Grupo(){
            this.herois = new ArrayList<>();
        }

        public ArrayList<Heroi> getHerois() {
            return herois;
        }
        public void setHerois(ArrayList<Heroi> herois) {
            this.herois = herois;
        }
        public int getTotalMoedasDeOuro() {
            return totalMoedasDeOuro;
        }
        public void setTotalMoedasDeOuro(int totalMoedasDeOuro) {
            this.totalMoedasDeOuro = totalMoedasDeOuro;
        }
    }


