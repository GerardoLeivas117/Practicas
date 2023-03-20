package ejercicio6;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Gerardo
 *
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
 * donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
 * Crear un programa que permita introducir un cuadrado por teclado y determine
 * si este cuadrado es mágico o no. El programa deberá comprobar que los números
 * introducidos son correctos, es decir, están entre el 1 y el 9.
 */
public class Ejercicio6 {

    static final int TAMANIO = 3;

    public static void main(String[] args) {
        int[][] matriz1 = new int[TAMANIO][TAMANIO];

        if (tipoDeSolucion()) {
            matriz1 = crearMatrizMagica(TAMANIO);
        } else {
            matriz1 = cargarMatrizRandom(TAMANIO);
        }

        if (esMagica(matriz1)) {
            System.out.println("La matriz es mágica");
        } else {
            System.out.println("La matriz no es mágica)");
        }
        imprimirMatriz(matriz1);
    }

    private static boolean esMagica(int[][] matriz) {

        // Verificar si la matriz es cuadrada
        if(matriz.length == matriz[0].length){

            // Inicializar variables
            boolean magica = true;
            int diag1 = 0;
            int diag2 = 0;
            int[] totalFilas = new int[matriz.length];
            int[] totalcolumnas = new int[matriz.length];

            // Recorrer la matriz y sumar las filas, columnas y diagonales
            for (int i = 0; i < matriz.length; i++) {

                for (int j = 0; j < matriz.length; j++) {

                    totalFilas[i] += matriz[i][j];
                    totalcolumnas[j] += matriz[j][i];

                    // Sumar los elementos de la diagonal principal
                    if (i == j) {
                        diag1 += matriz[i][j];
                    }

                    // Sumar los elementos de la diagonal secundaria
                    if ((i + j) == (matriz.length - 1)) {
                        diag2 += matriz[i][j];
                    }
                }
            }

            // Verificar si las diagonales suman lo mismo
            if (diag1 == diag2) {

                // Verificar si las filas, columnas y diagonales suman lo mismo
                for (int i = 0; i < matriz.length; i++) {
                    if (!((totalFilas[i] == totalcolumnas[i]) && (totalFilas[i] == diag1))) {
                        return false;
                    }
                }
            }

            // Retornar si la matriz es mágica o no
            return magica && (diag1 == diag2);

        } else {
            // Si la matriz no es cuadrada, no es mágica
            return false;
        }
    }

    /**
     *
     * Imprime una matriz en forma de celda, con los índices de coordenadas para
     * cada celda. También calcula la suma de la diagonal principal e imprime un
     * mensaje si la matriz es mágica.
     *
     * @param matriz la matriz a imprimir
     */
    public static void imprimirMatriz(int[][] matriz) {
        int suma = 0; // inicializar la variable para almacenar la suma de la diagonal principal
        System.out.print(""); // Imprime una cadena vacía para dar formato a la salida
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(String.format("%5d", i)); // Imprime el índice de la columna
        }
        System.out.println(""); // Imprime una nueva línea después de los índices de las columnas
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(i + " "); // Imprime el índice de la fila
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("["); // Imprime un corchete izquierdo para abrir la celda
                System.out.print(String.format("%3d", matriz[i][j])); // Imprime el valor de la celda con formato
                System.out.print("]"); // Imprime un corchete derecho para cerrar la celda
            }
            System.out.println(""); // Imprime una nueva línea después de cada fila
            suma += matriz[i][i]; // Suma el elemento de la diagonal principal actual a la variable "suma"
        }
        if (esMagica(matriz)) { // Verifica si la matriz es mágica
            System.out.println("La suma de todos sus lados es de: " + suma); // Imprime la suma de la diagonal principal
        }
        System.out.println("\n\n"); // Imprime dos nuevas líneas para separar la salida de la próxima matriz
    }
    
    
   /**
    * Crea y carga una matriz cuadrada de tamaño "tamanio" con un número entre
    * 1 y 9, y lo guarda en cada uno de sus elementos
    * @param tamanio tamaño de la matriz a cuadrada a crear
    * @return la matriz cuadrada de tamaño "tamanio" cargada
    */
    public static int[][] crearMatrizMagica(int tamanio) {
        int[][] matriz = new int[tamanio][tamanio];

        // Se genera un número aleatorio entre 1 y 9 para llenar la matriz mágica
        int valor = (int) (Math.random() * 9) + 1;

        // Se recorre la matriz y se llena con el valor generado aleatoriamente
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = valor;
            }
        }

        // Se retorna la matriz mágica
        return matriz;
    }

    /**
     * Crea y carga una matriz cuadrada de tamaño "tamanio" con números
     * aleatorios entre 1 y 10, ambos inclusive.
     *
     * @param tamanio tamaño de la matriz cuadrada a crear
     * @return la matriz cuadrada de tamaño "tamanio" cargada con números
     * aleatorios entre 1 y 10, ambos inclusive.
     */
    private static int[][] cargarMatrizRandom(int tamanio) {
        int[][] matriz = new int[tamanio][tamanio];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10) + 1;
            }
        }
        return matriz;
    }

    /**
     * Despliega una ventana que condiciona el flujo el programa para evaluar su
     * funcionamiento.
     *
     * @return devuelve verdadero si el usuario eligio el boton del Si o falso
     * si eligio boton del No.
     */
    public static boolean tipoDeSolucion() {
        String[] opciones = {"Sí", "No"};
        int respuesta = JOptionPane.showOptionDialog(null, "¿Quiere ver el resultado con la condición verdadera?", "Consulta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        boolean opcion;
        if (respuesta == JOptionPane.YES_OPTION) {
            opcion = true;
        } else {
            opcion = false;
        }

        return opcion;
    }

}
