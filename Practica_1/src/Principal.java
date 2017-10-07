
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

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
    static double var;
    static double num;
    static double prom;
    static int n;

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime Cuantos numeros son los de la poblacion");
        n = sc.nextInt();
        int numeros[] = new int[n];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Dime los numeros: ");
            numeros[i] = sc.nextInt();
        }
        //Caluclo del Promedio
        double suma = 0;
        for (double i : numeros) {
            suma += i;
        }
        prom = suma / n;
        System.out.println("Promedio: " + prom);
        //Calculo de la varianza
        double sumatoria;
        for (int i = 0; i < numeros.length; i++) {
            sumatoria = Math.pow((numeros[i] - prom), 2);
            var += sumatoria;
        }
        var = var / (n - 1);
        System.out.println("Varianza: " + var);
        //Calculo de la moda
        //recorrer e ir insertando en un Map con  el número de veces que aparece un valor en la distribución.
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();

        for (int elemento : numeros) {
            if (m.containsKey(elemento)) {
                m.put(elemento, m.get(elemento) + 1);
            } else {
                m.put(elemento, 1);
            }
        }
        //guardar valores y una variable para saber cuál es el valor de mayor frecuencia.
        int repeticiones = 0;
        List<Integer> moda = new ArrayList<Integer>();
        Iterator<Entry<Integer, Integer>> iter = m.entrySet().iterator();
        while (iter.hasNext()) {
            Entry<Integer, Integer> e = iter.next();

            if (e.getValue() > repeticiones) {
                moda.clear();
                moda.add(e.getKey());
                repeticiones = e.getValue();
            } else if (e.getValue() == repeticiones) {
                moda.add(e.getKey());
            }

        }
        //Si un numero no se repite la moda no existe;
        if (moda.size() == numeros.length) {
            System.out.println("No hay moda");
        } else {
            System.out.println("Moda: " + moda);
        }
    }
}
