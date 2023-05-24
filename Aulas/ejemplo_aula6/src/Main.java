public class Main {
    public static void main(String[] args) {
        //Heroe heroe = new Heroe(1, "Lyn",10); //CON CONSTRUCTOR
        //heroe.setId(1);                       |
        //heroe.setNombre("Lyn");               |   SIN CONSTRUCTOR
        //heroe.setCantidadMonedasDeOro(10);    |

        Grupo grupo = new Grupo();
        grupo.agregarHeroe(new Heroe(1, "Lyn",10));
        grupo.agregarHeroe(new Heroe(2, "Ellywood",1000));
        grupo.agregarHeroe(new Heroe(3, "Marcus",10));

        grupo.removerHeroe(1);

        System.out.println(grupo.getTotalMonedasDeOro());


    }

}