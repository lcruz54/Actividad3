package co.edu.uniminuto;

import java.util.Scanner;

public class Ejercicio2 {

/**Hacer un programa en Java que cuente y sume los múltiplos de 5 y 3 (para ser
sumado debe verificarse que sea múltiplo de 5 y 3 a la vez) comprendidos entre 
1 y n (n es determinado por el usuario). Imprimir la cantidad de múltiplos de 
5 y 3.  */
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese un numero: ");
        int n = scanner.nextInt();


        int count = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
                sum += i;
            }
        }

        System.out.println("Cantidad de múltiplos de 3 y 5: " + count);
        System.out.println("Suma de los múltiplos de 3 y 5: " + sum);
    }
}        
