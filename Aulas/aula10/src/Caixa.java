public class Caixa <T extends Alimento> {
    private T elemento;

    public void imprimePeso(){
        System.out.println("o peso em gramas do(a) " +
                elemento.getClass() + " é: " + elemento.retornaPesoEmGramas());
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
}
