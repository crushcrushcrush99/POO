public class Pokemon {
    private String codigoIdentificador;
    private String nombre;
    private String tipo;

    public Pokemon(){
    }
    public Pokemon(String codigoIdentificador, String nombre, String tipo){
        this.codigoIdentificador = codigoIdentificador;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void setCodigoIdentificador(String codigoIdentificador){
        this.codigoIdentificador = codigoIdentificador;
    }

    public String getCodigoIdentificador(){
        return codigoIdentificador;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return tipo;
    }
}
