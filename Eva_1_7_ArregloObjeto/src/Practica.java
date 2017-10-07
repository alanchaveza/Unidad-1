/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 15551450
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Arreglo de 10 almunos
        Alumnos aAlumnos [] = new Alumnos [10];
        //Llenar de datos
        for (int i = 0; i < 10; i++) {
            aAlumnos[i]= new Alumnos("Alan", "15551450", 0);
        }
        //impprimir
        for (int i = 0; i < 10; i++) {
            System.out.println("Nombre : " +aAlumnos[i].getNombre());
            System.out.println("Numero de control : " +aAlumnos[i].getNoCtrl());
            System.out.println("Carrera : " +aAlumnos[i].getCarrera());
        }
        //Crear un copia
        Alumnos aCopia []= new Alumnos[10];
         for (int i = 0; i < 10; i++) {
            aCopia[i]= new Alumnos(aAlumnos[i].getNombre(),aAlumnos[i].getNoCtrl(), aAlumnos[i].getCarrera());
            
        }
        //Prueba
         aAlumnos[0].setNombre("x");
         System.out.println(aAlumnos[0].getNombre());
         System.out.println(aCopia[0].getNombre());
        
        
    }
    
}
 class Alumnos{
     private String Nombre;
     private String NoCtrl;
     private int Carrera;//0----> ISC
     //Constructor para la clase
     public Alumnos(String nom, String nCtrl, int Carr){
         Nombre=nom;
         NoCtrl=nCtrl;
         Carrera=Carr;
     }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNoCtrl() {
        return NoCtrl;
    }

    public void setCarrera(int Carrera) {
        this.Carrera = Carrera;
    }

    public int getCarrera() {
        return Carrera;
    }

    public void setNoCtrl(String NoCtrl) {
        this.NoCtrl = NoCtrl;
    }
     
 }