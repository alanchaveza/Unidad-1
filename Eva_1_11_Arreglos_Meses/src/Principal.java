
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
        String  meses [] ={"Enero", "Febrero","Marzo","Abril","Mayo","Junio",
            "Julio","Agosto","Septiembre","Octubre","Noviembre","Dicembre"};
        int Dias[]= {31,28,31,30,31,30
                    ,31,30,31,30,31,30};
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero entre 1-12");
        int mes = sc.nextInt();
        System.out.println("El Mes correspondiente es "+meses[mes -1] +" y Tiene "+Dias[mes -1]+" Dias");
    }
    
}
