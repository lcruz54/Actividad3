package co.edu.uniminuto;

public class Ejercicio13 {

    /*Realizar un programa que genere una matriz 7x7, inicializarla la diagonal
principal con el número “0”(cero), el resto de las posiciones deben ser -
(guion). Imprimir la matriz. */
    public static void main(String[] args) {
      String[][] matriz = new String[7][7];

        // Inicializar la matriz
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == j) {
                    matriz[i][j] = "0";  // Diagonal principal con 0
                } else {
                    matriz[i][j] = "-";  // Resto con guion
                }
            }
        }

        // Imprimir la matriz
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

