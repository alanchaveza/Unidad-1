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
    public static final int TAMA=10; 
    public static void main(String[] args) {
        // TODO code application logic here
        int[] iArreglo,siesarreglo,estetambien;
        int iArreglo2[],estenoes,nieste;
        
        int iArre[] = new int [TAMA];
        //Llenar con numerso aleatorios del 1 al 10
        for (int i = 0; i < iArre.length; i++) {
            iArre[i]= (int)(Math.random()*10)+1;
        }
        /*For each es una estructura para imprimir los valores de 
        los elementos que tiene un arreglo
        */
        for (int j : iArre) {
            System.out.println(" Valor = " +j);
        }
        
    }
    
}
