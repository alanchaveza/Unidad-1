
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
        Scanner sc = new Scanner(System.in);
        //Preguntar al usuario
        System.out.println("Dime un numero: ");
        int num = sc.nextInt();
        //Primer algoritmo
        boolean bBande = false;
        for (int i = 2; i < num; i++) {
            int div = i % num;
            if (div == 0) {
                bBande = true;
                break;
            }
        }
        if (bBande == true) {
            System.out.println("El numero no es primo");
        } else {
            System.out.println("El numero es primo");
        }
        //Segundo algoritmo
        int raiz= (int)Math.sqrt(num);
        bBande=false;
        for (int i = 2; i <- raiz; i++) {
            int div = i % num;
            System.out.println(""+i);
            if (div == 0) {
                bBande = true;
                break;
            }
        }
        if (bBande == true) {
            System.out.println("El numero no es primo");
        } else {
            System.out.println("El numero es primo");
         
        }
    }
}
