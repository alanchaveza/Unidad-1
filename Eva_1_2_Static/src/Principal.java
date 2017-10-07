

/**
 *
 * @author 15551450
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PruebaNo pneObj= new PruebaNo();
        pneObj.imprimir();
        System.out.println(pneObj.nom);
        PruebaEstatica.imprimir();
        System.out.println(PruebaEstatica.nom);
    }
    
}
/*clase que si necesita ser instanciada y que pertenece a la memoria dinamica*/
class PruebaNo {
    public String nom= "Alan";
    public void imprimir(){
        System.out.println("hola");
    }
}
/*clase que no necesita ser instanciada */
class PruebaEstatica {
    public static String nom= "Cervando";
    public static void imprimir(){
        System.out.println("hola tu");
    }
}