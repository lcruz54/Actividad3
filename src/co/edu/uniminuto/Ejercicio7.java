
package co.edu.uniminuto;

import java.util.Scanner;

public class Ejercicio7 {

    /**Realizar un programa en Java que dado n cantidad de números determine 
si es primo o no y si ese número primo es múltiplo de 3, se debe contar. Imprimir
cantidad de primos y cantidad de múltiplos de 3 */
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();

        int primeCount = 0;
        int multipleOf3PrimeCount = 0;


        boolean isPrime(int number){
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }


        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un número: ");
            int num = scanner.nextInt();


            if (isPrime(num)) {
                primeCount++;

                if (num % 3 == 0) {
                    multipleOf3PrimeCount++;
                }
            }
        }

        System.out.println("Cantidad de números primos: " + primeCount);
        System.out.println("Cantidad de números primos múltiplos de 3: " + multipleOf3PrimeCount);
    }
}
    

