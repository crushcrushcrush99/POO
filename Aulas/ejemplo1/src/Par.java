public class Par<A, B> {
    private A primeiroPar;
    private B segundoPar;

    public void criar(A p1, B p2) {
        this.primeiroPar = p1;
        this.segundoPar = p2;
    }

    public A getPrimeiroPar(){
        return this.primeiroPar;
    }
}