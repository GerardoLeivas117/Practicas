package ejercicio7;

/**
 *
 * @author Gerardo Realizar un programa que complete un vector con los N
 * primeros números de la sucesión de Fibonacci. Recordar que la sucesión de
 * Fibonacci es la sucesión de los siguientes números:
 *
 */
public class Ejercicio7 {

// Tamaño del vector que almacenará los elementos de la sucesión de Fibonacci
    static final int TAMANIO = 25;

// Función principal
    public static void main(String[] args) {
        // Se crea un vector de enteros con tamaño TAMANIO
        int[] vectorFibonacci = new int[TAMANIO];
        // Se cargan los elementos de la sucesión de Fibonacci en el vector
        cargarFibonacci(vectorFibonacci);
        // Se imprime el mensaje indicando cuántos elementos se han generado
        System.out.println(TAMANIO + " primeros elementos de la Sucesión Fibonacci:");
        // Se imprime el vector con los elementos generados
        imprimirVector(vectorFibonacci);
    }

// Función que carga los primeros n elementos de la sucesión de Fibonacci en un vector
    public static void cargarFibonacci(int[] fibonacci) {
        // Se recorre el vector
        for (int i = 0; i < fibonacci.length; i++) {
            // Se verifica si es el primer o segundo elemento de la sucesión
            if ((i == 0) || (i == 1)) {
                fibonacci[i] = 1;
            } else {
                // Se calcula el elemento actual de la sucesión como la suma de los dos elementos anteriores
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }
    }

// Función que imprime un vector de enteros
    public static void imprimirVector(int[] vector) {
        System.out.print("{");
        // Se recorre el vector
        for (int i = 0; i < vector.length; i++) {
            // Se imprime el elemento actual
            System.out.print(vector[i]);
            // Si no es el último elemento, se imprime una coma y un espacio
            if (i < vector.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

}
