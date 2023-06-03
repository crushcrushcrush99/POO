public class Heroe extends Personaje{
    /*private int id;
    private String nombre;*/
    private Arma arma;
    public Heroe(int id, String nombre, Arma arma) {
        super(id, nombre);
        this.arma = arma;
    }

    public Heroe() {
    }

    /*@Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append("heroi: {\n")
                .append("\tid: ")
                .append(this.id)
                .append("\n")
                .append("\tnombre: ")
                .append(this.nombre)
                .append("\n}");
        return stringBuilder.toString();
    }*/

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
}