
package co.edu.uniminuto;

import java.util.Random;

public class Ejercicio17 {

/**Generar un arreglo unidimensional de 50 posiciones que se llene con valores
aleatorios y contar la cantidad de positivos, negativos y ceros del arreglo. */
    public static void main(String[] args) {
 int[] arreglo = new int[50];

        Random random = new Random();

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        for (int i = 0; i < 50; i++) {
            arreglo[i] = random.nextInt(21) - 10; 
        }

        for (int i = 0; i < 50; i++) {
            if (arreglo[i] > 0) {
                positivos++;
            } else if (arreglo[i] < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }


        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);
    }
}