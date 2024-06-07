
package co.edu.uniminuto;

import java.util.Scanner;

public class Ejercicio15 {

    /** Realizar un programa que genere una matriz 5x6 y se rellene 
dinámicamente con los números impares partiendo desde n (n es dada por el 
usuario) y se imprima.     */
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor inicial (n): ");
        int n = scanner.nextInt();

        int[][] matriz = new int[5][6];

        int numeroImpar = n;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
   
                if (numeroImpar % 2 == 0) {
                    numeroImpar++;
                }

                matriz[i][j] = numeroImpar;

                numeroImpar += 2;
            }
        }

        System.out.println("La matriz generada es:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
