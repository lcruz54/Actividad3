package co.edu.uniminuto;

import java.util.Scanner;

public class Ejercicio9 {

/** Leer N cantidad de notas (validar rango de notas), imprimir el promedio de
las notas, la nota más alta y la más baja. */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de notas: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("La cantidad de notas debe ser mayor que 0.");
            return;
        }

        double[] notas = new double[n];


        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Ingrese la nota " + (i + 1) + " "
                        + "(entre 0 y 100): ");
                double nota = scanner.nextDouble();

                if (nota >= 0 && nota <= 100) {
                    notas[i] = nota;
                    break;
                } else {
                    System.out.println("Nota inválida. Por favor, ingrese una "
                            + "nota entre 0 y 100.");
                }
            }
        }

        double maxNota = notas[0];
        double minNota = notas[0];
        double sumNotas = 0;

        for (int i = 0; i < n; i++) {
            if (notas[i] > maxNota) {
                maxNota = notas[i];
            }
            if (notas[i] < minNota) {
                minNota = notas[i];
            }
            sumNotas += notas[i];
        }

        double promedio = sumNotas / n;

        System.out.println("El promedio de las notas es: " + promedio);
        System.out.println("La nota más alta es: " + maxNota);
        System.out.println("La nota más baja es: " + minNota);
    }
}

