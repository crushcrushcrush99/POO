import java.util.ArrayList;

public class Grupo {
    private ArrayList<Heroe> heroes;

    public Grupo(){
        this.heroes = new ArrayList<>();
    }

    public void agregarHeroe(Heroe heroe){
        this.heroes.add(heroe);
    }
    public void removerHeroe(int idHeroe){
        for (int i = 0; i < this.heroes.size(); i++) {
            if(this.heroes.get(i).getId() == idHeroe){
                this.heroes.remove(i);
            }
        }
    }
    public ArrayList<Heroe> getHeroes(){
        return this.heroes;
    }
}
