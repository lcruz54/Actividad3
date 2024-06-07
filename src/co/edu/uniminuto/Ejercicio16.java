
package co.edu.uniminuto;

public class Ejercicio16 {

/**Realizar una matriz 5x5, inicializarla totalmente en 1 y luego en la diagonal
trasversa colocar el número cero (0). Imprimir la matriz*/
    public static void main(String[] args) {

   int[][] matriz = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = 1;
            }
        }


        for (int i = 0; i < 5; i++) {
            matriz[i][4 - i] = 0; 
        }

        System.out.println("La matriz generada es:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
