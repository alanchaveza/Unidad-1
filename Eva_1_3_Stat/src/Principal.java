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
        System.out.println("Llamando a A");
        A();
        System.out.println("Termanando A");
        
    }
    public static void A(){
    System.out.println("Llamando a B");
        B();
        System.out.println("Terminando B");
    
}public static void B(){
    System.out.println("Llamando a C");
        C();
        System.out.println("Terminando C");
    
}
public static void C(){
    System.out.println("Metodo C");
}
}
