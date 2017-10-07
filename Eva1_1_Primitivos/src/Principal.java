
import java.util.Scanner;

/*//Practica para describir los tipos de datos primitivos del lenguaje java*/

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
        String nom;
        int eda;
        double sal;
        Scanner captura = new Scanner (System.in);
        System.out.println("Dime tu nombre");
        nom = captura.nextLine();
        System.out.println("Dime tu edad");
        eda = captura.nextInt();
        System.out.println("Dime tu Salario");
        sal = captura.nextDouble();
        hacerAlgo(nom,eda,sal);
    }
    /**
     * metodo para imprimir los valors de un usuario
     * @param nombre nombre del usuario
     * @param edad edad del ususario
     * @param salario salario del ususario
     */
    public static void hacerAlgo(String nombre, int edad, double salario){
        System.out.println(nombre+" "+edad+" " +salario);
    }
    
}
