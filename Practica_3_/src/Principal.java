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
        int matriz[][] = new int[5][5];
        System.out.println("Primera Matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100) + 1;
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
           
        }
        System.out.println("Matriz Inversa");
        int copia [][]= new int [5][5];
        for (int i = (matriz.length-1);i>=0;i--) {
            for (int j = (matriz[i].length-1),l=0; j >= 0; j--,l++) {
                copia[i][j]=matriz[i][j];
                System.out.print("["+copia[i][j]+"]");
            }
            System.out.println("");
        }
    }
            
}   
