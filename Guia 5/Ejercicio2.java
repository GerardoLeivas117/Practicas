package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 *
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
 * y le pida al usuario un número a buscar en el vector. El programa mostrará
 * dónde se encuentra el numero y si se encuentra repetido
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector1;
        int posicion = -1, numBuscado = 0, repetido = 0, dimension = 0;

        // Pedimos al usuario que ingrese un valor para la dimension del vector hasta que sea mayor que cero
        while (dimension <= 0) {
            try {
                System.out.println("Ingrese el tamaño para el vector:");
                dimension = leer.nextInt();
                if (dimension <= 0) {
                    System.out.println("Error: El tamaño debe ser mayor a cero.");
                }
            } catch (Exception e) {
                System.out.println("Error: ha ingresado un valor inválido.");
            }
        }

        // Creamos un vector de enteros de tamaño dimension y lo llenamos con números aleatorios entre 1 y 20
        vector1 = new int[dimension];
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = (int) ((Math.random() * 20) + 1);
        }

        // Ordenamos el vector
        System.out.println("Ordenando el vector...");
        ordenarArreglo(vector1);
        System.out.println("Vector ordenado:");

        // Pedimos al usuario que ingrese un número hasta que esté entre 1 y 20
        while (numBuscado <= 0) {
            try {
                System.out.println("Ingrese el número a buscar:");
                numBuscado = leer.nextInt();
                if (numBuscado > 20 || numBuscado < 1) {
                    System.out.println("Error: El valor debe estar entre 1 y 20");
                }
            } catch (Exception e) {
                System.out.println("Error: ha ingresado un valor inválido.");
            }
        }

        // Buscamos el número ingresado en el vector y contamos cuántas veces aparece
        for (int i = 0; i < vector1.length; i++) {
            if (numBuscado == vector1[i]) {
                if (repetido == 0) {
                    posicion = i;
                }
                repetido++;
            }
        }

        // Mostramos los resultados de la búsqueda y la cantidad de veces que aparece el número buscado en el vector
        if (repetido > 0) {
            System.out.println("El número fue encontrado en la posición: " + posicion);
            System.out.println("La cantidad de veces en que encontrado: " + repetido);
        } else {
            System.out.println("El número no se encuentra en el vector");
        }

        // Imprimimos el vector
        imprimirVector(vector1);
    }

// Este método ordena el vector en orden ascendente utilizando el algoritmo de selección
    public static void ordenarArreglo(int[] vector1) {
        int aux;

        for (int i = 0; i < vector1.length; i++) {

            // Recorremos el vector a partir del siguiente elemento después del i-ésimo elemento
            for (int j = i + 1; j < vector1.length; j++) {

                // Si el elemento j-ésimo es menor o igual al i-ésimo elemento, los intercambiamos
                if (vector1[j] <= vector1[i]) {
                    aux = vector1[i];
                    vector1[i] = vector1[j];
                    vector1[j] = aux;

                }
            }

        }

    }

// Este método imprime el contenido del vector en la consola
    private static void imprimirVector(int[] vector1) {
        System.out.print("Vector:\n{");

        // Iteramos sobre cada elemento del vector e imprimimos su valor
        for (int i = 0; i < vector1.length; i++) {
            System.out.print("[" + vector1[i] + "]");
        }
        System.out.println("}\n");
    }

}
