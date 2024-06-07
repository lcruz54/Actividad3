
package co.edu.uniminuto;

import java.util.Random;

public class Ejercicio14 {

    /** Realizar un programa que genere un arreglo de 50 posiciones y se rellene
de con la función ramdom de Java (los números deben ser 1 a 99), luego de 
llenar hacer la impresión de la matriz. */
    public static void main(String[] args) {

        int[] array = new int[50];

        Random random = new Random();


        for (int i = 0; i < 50; i++) {
            array[i] = random.nextInt(99) + 1;
        }

        System.out.println("El arreglo generado es:");
        for (int i = 0; i < 50; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

