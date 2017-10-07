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
        double[][] mat1 = new double[5][5];
        double[][] mat2 = new double[5][5];
        double[][] matR = new double[5][5];
        System.out.println("Matriz 1");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                mat1[i][j] = (double) (Math.random() * 10) + 1;
                System.out.println(mat1[i][j]);
            }
        }
        System.out.println("Matriz 2");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                mat2[i][j] = (double) (Math.random() * 10) + 1;
                System.out.println(mat2[i][j]);
            }
        }
        System.out.println("Matriz resultado");
        for (int i = 0; i < matR.length; i++) {
            for (int j = 0; j < matR[i].length; j++) {
                matR[i][j] = mat1[i][j] * mat2[i][j];
            System.out.println(matR[i][j]);
            }
        }
    }

}
