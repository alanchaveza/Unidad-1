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
        int a3D[][][] = new int [3][3][3];
        //Llenar con valores aleatoreos
         for (int i = 0; i < 3; i++) {//Filas
             for (int j = 0; j < 3; j++) {//Columnas
                 for (int k = 0; k < 3; k++) {//niiveles
                     a3D[i][j][k]= (int)(Math.random()*100+1);
                 }
             }
        }
     for (int i = 0; i < 3; i++) {//Filas
             for (int j = 0; j < 3; j++) {//Columnas
                 for (int k = 0; k < 3; k++) {//niiveles
                     System.out.println("["+a3D[i][j][k]+"]");
                 }
             }
        }
    }
    
    
}
