package ejercicio5;

/**
 *
 * @author Gerardo
 *
 * Realizar un programa que llene una matriz de tamaño NxM con valores
 * aleatorios y muestre la suma de sus elementos.
 *
 */
public class Ejercicio5 {

    static final int FILAS = 5;
    static final int COLUMNAS = 6;

    public static void main(String[] args) {
        // Crear una matriz de FILAS x COLUMNAS
        int[][] matriz1 = new int[FILAS][COLUMNAS];

        // Cargar la matriz con valores aleatorios
        cargarMatriz(matriz1);

        // Imprimir la suma de todos los elementos de la matriz
        System.out.println("La suma de todos los elementos de la matriz es de: " + sumaDeElementos(matriz1));

        // Imprimir la matriz en pantalla
        imprimirMatriz(matriz1);
    }

// Cargar la matriz con valores aleatorios
    public static void cargarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 9) + 1;
            }
        }
    }

// Sumar todos los elementos de la matriz y devolver el total
    public static long sumaDeElementos(int[][] matriz) {
        long total = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                total += matriz[i][j];
            }
        }
        return total;
    }

// Imprimir la matriz en pantalla
    public static void imprimirMatriz(int[][] matriz) {
        // Imprimir los números de columna
        for (int i = 0; i < matriz[0].length; i++) {
            System.out.print(String.format("%4d", i));
        }
        System.out.println("");

        // Imprimir los números de fila y los valores de la matriz
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(i);
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("[" + String.format("%2d", matriz[i][j]) + "]");
            }
            System.out.println("");
        }
    }

}
