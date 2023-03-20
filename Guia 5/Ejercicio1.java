package ejercicio1;

/**
 *
 * @author Gerardo
 *
 * Realizar un algoritmo que llene un vector con los 100 primeros números
 * enteros y los muestre por pantalla en orden descendente.
 */
public class Ejercicio1 {

    /**
     *
     * Método principal que llena un vector con los primeros 100 números enteros
     * y luego llama
     *
     * al método "imprimirEnDescendente" para mostrar los números en orden
     * descendente.
     *
     * @param args argumentos de línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {
        // Se crea un arreglo de longitud 100 para almacenar los números enteros
        long[] cienNumeros = new long[100];

        // Se llena el arreglo con los primeros 100 números enteros
        for (int i = 0; i < cienNumeros.length; i++) {
            cienNumeros[i] = i + 1;
        }

         // Se llama al método para imprimir los números del arreglo en orden descendente
        imprimirEnDescendente(cienNumeros);
    }

    /**
     *
     * Este método recibe un arreglo de 100 números enteros y los imprime en
     * orden descendente.
     *
     * @param cienNumeros el arreglo de 100 números enteros a imprimir en orden
     * descendente.
     */
    private static void imprimirEnDescendente(long[] cienNumeros) {
        // Imprime la etiqueta para el vector
        System.out.print("Vector cienNumeros\n{");
        // Itera sobre el arreglo de forma descendente
        for (int i = cienNumeros.length - 1; i >= 0; i--) {
            // Imprime el elemento actual
            System.out.print(cienNumeros[i]);
            // Si no es el último elemento, agrega una coma y un espacio en blanco
            if (i != 0) {
                System.out.print(", ");
            }
        }
        // Imprime la llave de cierre para el vector
        System.out.println("}");
    }

}
