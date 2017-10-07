
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
    public static final int tama =5;
    public static void main(String[] args) {
        // TODO code application logic here
        String asNombres [] = new String[tama];
        //Captura 5 nombres//
        Scanner sCaptu = new Scanner (System.in);
        for (int i = 0; i < asNombres.length; i++) {
            System.out.println("Dime tu nombre");
            asNombres[i] = sCaptu.nextLine();
        }
        for (String asNombre : asNombres) {
            System.out.println("Nombre : "+asNombre);
        }
        //Crear una copia del arreglo
        //no funcional
        /*String asCopiaF []= asNombres;
        asNombres[0]="Hola mundo curel";
        System.out.println(asCopiaF);*/
        String asCopia []= new String[tama];
        for (int i = 0; i < asCopia.length; i++) {
            asCopia[i] = asNombres[i];  
        }
            asNombres [0]= "mundo cruel";
            System.out.println("Nombres[0] =" +asNombres[0]);
            System.out.println("Copia[0] =" +asCopia[0]);
    }
    
}
