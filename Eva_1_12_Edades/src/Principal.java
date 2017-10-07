
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        //Preguntar cuantos alumnos tiene el grupo
        Scanner sc = new Scanner (System.in);
        System.out.println("Cunatos alumnos tienes? :");
        int numAlum = sc.nextInt();
        int []Edades = new int [numAlum];
        //Llenarlo
        for (int i = 0; i < Edades.length; i++) {
            System.out.println("Dime las edades");
            Edades[i]=sc.nextInt();
        }
        int suma = 0;
        for (int i : Edades) {
            suma+=i;
        }
        double prom= suma/Edades.length;
        System.out.println("El primedio es " +prom);
    }
    
}
