package ejercicio7;

/**
 *
 * @author Gerardo Realizar un programa que complete un vector con los N
 * primeros n�meros de la sucesi�n de Fibonacci. Recordar que la sucesi�n de
 * Fibonacci es la sucesi�n de los siguientes n�meros:
 *
 */
public class Ejercicio7 {

// Tama�o del vector que almacenar� los elementos de la sucesi�n de Fibonacci
    static final int TAMANIO = 25;

// Funci�n principal
    public static void main(String[] args) {
        // Se crea un vector de enteros con tama�o TAMANIO
        int[] vectorFibonacci = new int[TAMANIO];
        // Se cargan los elementos de la sucesi�n de Fibonacci en el vector
        cargarFibonacci(vectorFibonacci);
        // Se imprime el mensaje indicando cu�ntos elementos se han generado
        System.out.println(TAMANIO + " primeros elementos de la Sucesi�n Fibonacci:");
        // Se imprime el vector con los elementos generados
        imprimirVector(vectorFibonacci);
    }

// Funci�n que carga los primeros n elementos de la sucesi�n de Fibonacci en un vector
    public static void cargarFibonacci(int[] fibonacci) {
        // Se recorre el vector
        for (int i = 0; i < fibonacci.length; i++) {
            // Se verifica si es el primer o segundo elemento de la sucesi�n
            if ((i == 0) || (i == 1)) {
                fibonacci[i] = 1;
            } else {
                // Se calcula el elemento actual de la sucesi�n como la suma de los dos elementos anteriores
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }
    }

// Funci�n que imprime un vector de enteros
    public static void imprimirVector(int[] vector) {
        System.out.print("{");
        // Se recorre el vector
        for (int i = 0; i < vector.length; i++) {
            // Se imprime el elemento actual
            System.out.print(vector[i]);
            // Si no es el �ltimo elemento, se imprime una coma y un espacio
            if (i < vector.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

}
