import java.util.ArrayList;
public class Grupo {
    private ArrayList<Heroe> heroes;
    private int totalMonedasDeOro;

    public Grupo(){
        this.heroes = new ArrayList<>();
    }

    public void agregarHeroe(Heroe heroe){
        this.totalMonedasDeOro = this.totalMonedasDeOro + heroe.getCantidadMonedasDeOro();
        this.heroes.add(heroe);
        System.out.println("El heroe " + heroe.getNombre() + " fue agregado al grupo!");
    }
    public void removerHeroe(int idHeroe){
        for(int i = 0; i < this.heroes.size(); i++){
            if(heroes.get(i).getId() == idHeroe){
                this.totalMonedasDeOro = this.totalMonedasDeOro - this.heroes.get(i).getCantidadMonedasDeOro();
                System.out.println("El horeo " + this.heroes.get(i).getNombre() + " fue removido de la lista!");
                heroes.remove(i);
            }
        }
    }

    public ArrayList<Heroe> getHeroes(){
        return heroes;
    }

    public int getTotalMonedasDeOro() {
        return totalMonedasDeOro;
    }
}
