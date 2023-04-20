public class Enemigo {

   private int ataque;
   private int defensa;
   private int puntos;

   public Enemigo(){

   }
   public Enemigo(int ataque, int defensa, int puntos){
       this.ataque = ataque;
       this.defensa = defensa;
       this.puntos = puntos;
   }

    public int getAtaque(){
        return  this.ataque;
    }
    public void setAtaque(int ataque)
    {
        this.ataque = ataque;
    }
    public int getDefensa()
    {
        return  this.defensa;
    }
    public void setDefensa(int defensa)
    {
        this.defensa = defensa;
    }
    public int getPuntos()
    {
        return  this.puntos;
    }
    public void setPuntos(int puntos)
    {
        this.puntos = puntos;
    }

}

