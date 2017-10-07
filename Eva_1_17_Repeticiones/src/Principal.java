
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alan
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamaño del arreglo");
        int tama = sc.nextInt();
        int ar[] = new int[tama];
        for (int i = 0; i < ar.length; i++) {
            System.out.println("Llena el arreglo");
            ar[i] = sc.nextInt();
        }
        System.out.println("Que numero buscas");
        int num = sc.nextInt();
        for (int i = 0; i < ar.length; i++) {
            
                if (ar[i] == num) {
                    System.out.println("El número " + ar[i] + " está repetido");
                   }
        }
    }

}
