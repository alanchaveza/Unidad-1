
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
        // int Edades [][] = new int [4][30];

        // Preguntar cunatos grupos tienes
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos grupos tiene?");
        int gpo = sc.nextInt();
        int[][] Edades = new int[gpo][];
        //Preguntar grupo por grupo
        for (int i = 0; i < Edades.length; i++) {
            System.out.println("Dime Cunatos Alumnos Tiene");
            int alum = sc.nextInt();
            for (int j = 0; j < alum; j++) {
                System.out.println("Pon su edades");
                Edades[gpo][alum]=sc.nextInt();
            }
        }
        int suma = 0;
        for (int[] i : Edades) {
            for (int j : i) {
                suma+=j;
            }
        }
        double prom= suma/Edades.length;
        System.out.println("El primedio es " +prom);
    }
}
