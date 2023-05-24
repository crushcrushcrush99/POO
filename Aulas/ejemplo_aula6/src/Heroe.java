public class Heroe {
    private int id;
    private String nombre;
    private int cantidadMonedasDeOro;

    public Heroe(){
    }
    public Heroe(int id, String nombre, int cantidadMonedasDeOro){
        this.id = id;
        this.nombre = nombre;
        this.cantidadMonedasDeOro = cantidadMonedasDeOro;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getCantidadMonedasDeOro(){
        return cantidadMonedasDeOro;
    }
    public void setCantidadMonedasDeOro(int cantidadMonedasDeOro){
        this.cantidadMonedasDeOro = cantidadMonedasDeOro;
    }
}
