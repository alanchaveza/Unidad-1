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
        int a3D [][][] = new int[5][3][8];
        for (int i = 0; i < a3D.length; i++) {
            for (int j = 0; j < a3D[i].length; j++) {
                for (int k = 0; k < a3D[i][j].length; k++) {
                    a3D[i][j][k] = (int)(Math.random()*100+1);
                }
            }
        }/*
        for (int i = 0; i < a3D.length; i++) {
            for (int j = 0; j < a3D[i].length; j++) {
                for (int k = 0; k < a3D[i][j].length; k++) {
                    System.out.println("["+a3D[i][j][k]+"]");
                }
            }
 
        }*/
        //for each
        for (int[][] ises : a3D) {
            for (int[] is : ises) {
                for (int i : is) {
                    System.out.println("["+i+"]");
                }
            }
        }
            
        }
    }
    

