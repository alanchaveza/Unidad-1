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
        int Array2D[][] = new int [3][3];
        // Llenar con numerso aleratores
        for (int i = 0; i < 3; i++) { //Filas
            for (int j = 0; j < 3; j++) {//Columnas
                Array2D[i][j] = (int)(Math.random()*10+1);
            }
        }
        for (int i = 0; i < 3; i++) { //Filas
            for (int j = 0; j < 3; j++) {//Columnas
                System.out.print("[" +Array2D[i][j]+"]");
            }
            System.out.println("");
        }
    }
   
}
