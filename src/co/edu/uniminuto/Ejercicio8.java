package co.edu.uniminuto;

import java.util.Scanner;

public class Ejercicio8 {

 /**Dado N cantidad de precios de gaseosas en un supermercado el gerente de 
ventas desea que se genere un programa que le permita saber cuál de las 
gaseosas tiene el mayor precio, cuál tiene menor precio y cuál es el precio 
promedio. Hacer las impresiones según lo requerido */
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese la cantidad de precios de gaseosas: ");
        int n = scanner.nextInt();


        if (n <= 0) {
            System.out.println("La cantidad de precios debe ser mayor que 0.");
            return;
        }

        double[] prices = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el precio de la gaseosa " + 
                    (i + 1) + ": ");
            prices[i] = scanner.nextDouble();
        }

        double maxPrice = prices[0];
        double minPrice = prices[0];
        double sumPrices = 0;


        for (int i = 0; i < n; i++) {
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
            }
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            sumPrices += prices[i];
        }

        double averagePrice = sumPrices / n;

        System.out.println("El mayor precio de las gaseosas es: " + maxPrice);
        System.out.println("El menor precio de las gaseosas es: " + minPrice);
        System.out.println("El precio promedio de las gaseosas es: "
                + averagePrice);
    }
}
