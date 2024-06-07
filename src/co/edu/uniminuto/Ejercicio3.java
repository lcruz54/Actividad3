package co.edu.uniminuto;

import java.util.Scanner;

public class Ejercicio3 {
/**Hacer un programa en Java que, dado un rango, por el usuario, se da número
inicial y uno final (tomar en cuenta que el inicial debe ser menor que el final,
hacer la validación y volver a pedir los dos números si no cumple la condición)
y sume los números pares dentro del rango incluyendo el valor inicial y final. 
     */
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

        int start, end;

        while (true) {
            System.out.print("Ingrese el número inicial: ");
            start = scanner.nextInt();
            System.out.print("Ingrese el número final: ");
            end = scanner.nextInt();

            if (start < end) {
                break; 
            } else {
                System.out.println("El número inicial debe ser menor que el "
                        + "número final. Por favor, inténtelo de nuevo.");
            }
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("La suma de los números pares en el rango de " 
                + start + " a " + end + " es: " + sum);
    }
}