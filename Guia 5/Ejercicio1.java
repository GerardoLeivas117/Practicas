package ejercicio1;

/**
 *
 * @author Gerardo
 *
 * Realizar un algoritmo que llene un vector con los 100 primeros n�meros
 * enteros y los muestre por pantalla en orden descendente.
 */
public class Ejercicio1 {

    /**
     *
     * M�todo principal que llena un vector con los primeros 100 n�meros enteros
     * y luego llama
     *
     * al m�todo "imprimirEnDescendente" para mostrar los n�meros en orden
     * descendente.
     *
     * @param args argumentos de l�nea de comandos (no se utilizan)
     */
    public static void main(String[] args) {
        // Se crea un arreglo de longitud 100 para almacenar los n�meros enteros
        long[] cienNumeros = new long[100];

        // Se llena el arreglo con los primeros 100 n�meros enteros
        for (int i = 0; i < cienNumeros.length; i++) {
            cienNumeros[i] = i + 1;
        }

         // Se llama al m�todo para imprimir los n�meros del arreglo en orden descendente
        imprimirEnDescendente(cienNumeros);
    }

    /**
     *
     * Este m�todo recibe un arreglo de 100 n�meros enteros y los imprime en
     * orden descendente.
     *
     * @param cienNumeros el arreglo de 100 n�meros enteros a imprimir en orden
     * descendente.
     */
    private static void imprimirEnDescendente(long[] cienNumeros) {
        // Imprime la etiqueta para el vector
        System.out.print("Vector cienNumeros\n{");
        // Itera sobre el arreglo de forma descendente
        for (int i = cienNumeros.length - 1; i >= 0; i--) {
            // Imprime el elemento actual
            System.out.print(cienNumeros[i]);
            // Si no es el �ltimo elemento, agrega una coma y un espacio en blanco
            if (i != 0) {
                System.out.print(", ");
            }
        }
        // Imprime la llave de cierre para el vector
        System.out.println("}");
    }

}
