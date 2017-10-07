
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
        Scanner teclado=new Scanner(System.in);
        boolean elNumeroEsta = false;
        System.out.println("Tamaño del arreglo");
        int tama = teclado.nextInt();
        int num[]=new int[tama];
        int x;
        for(x=0;x<num.length;x++){
            System.out.print("ingrese un numero: ");
            num[x]=teclado.nextInt();
        }
        for(x=0;x<num.length;x++){
            System.out.println(num[x]);
        }

        System.out.print("buscar numero: ");
        int numero;
        numero=teclado.nextInt();

        for(x=0;x<num.length;x++){
            if (numero == num[x]) {
                System.out.println("El numero esta en la posicion "+(x+1));
                elNumeroEsta = true;
            }
        }

        if(elNumeroEsta ==false) {
            System.out.println("El numero no esta en el arreglo");
        }
    }
}

    



