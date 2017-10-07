/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_1_14;

import java.util.Scanner;

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
        System.out.println("Dime que tan largo quieres el arreglo");
        int tama=sc.nextInt();
        int [] inver = new int [tama];
        for (int i = 0; i < inver.length; i++) {
            System.out.println("Dime los numeros que llenaran el arreglo");
            inver[i]=sc.nextInt();
            
        }
        for (int i = 0; i < inver.length; i++) {
        System.out.println("["+inver[i]+"]");
        }
        int arInver[] = new int [inver.length];
        System.out.println("Arreglo invertido");
        for (int i=(inver.length-1),j=0;i>=0;i--,j++) {
            arInver[j]=inver[i];
           System.out.println("["+arInver[j]+"]");
        }
         
    }
}
