/*El progrma nos ayuda a idenfificar como se debe copiar un elemento
como una variable en otra y como se debe copiar un objeto*/

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
        int iVal=50;
        System.out.println("iVal = "+iVal);
        //Crear una copia
        int iCopiaVal=iVal;
        System.out.println("iCopia "+iCopiaVal);
        //se modifica el valor de la variable 
        iVal++;
        System.out.println("iVal = "+iVal);
        System.out.println("iCopia = "+iCopiaVal);
        Datos dObj = new Datos();
        System.out.println("Obj.iVal = " +dObj.ival);
        //Manera que no funciona
        //objeto copia
        Datos dCopiaFake = dObj;
        System.out.println("Copia Fake = " +dCopiaFake.ival);
        dObj.ival++;
        System.out.println("Obj.iVal = " +dObj.ival);
        System.out.println("Copia Fake = " +dCopiaFake.ival);
        //Codigo que si funciona
        Datos dCopiaReal = new Datos ();
        dCopiaReal.ival=dObj.ival;
        System.out.println("Obj.iVal = " +dObj.ival);
        System.out.println("Copia Real = " +dCopiaReal.ival);
        dObj.ival++;
        System.out.println("Obj.iVal = " +dObj.ival);
        System.out.println("Copia Real = " +dCopiaReal.ival);
        //Imprimir la direccion de los objetos
        System.out.println(dObj);
        System.out.println(dCopiaReal);
        System.out.println(dCopiaFake);
    }
  }
  class Datos{
        public int ival=10;    
  }
