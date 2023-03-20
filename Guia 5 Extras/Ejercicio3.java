package ejercicio3;

/**
 *
 * @author Gerardo
 *
 * Crear una funci�n rellene un vector con n�meros aleatorios, pas�ndole un
 * arreglo por par�metro. Despu�s haremos otra funci�n o procedimiento que
 * imprima el vector.
 */
public class Ejercicio3 {

    final static int TAMANIO = 15;

    public static void main(String[] args) {
        int[] vector1 = new int[TAMANIO];

        // Llamada al m�todo para cargar el vector
        cargarVector(vector1);

        // Llamada al m�todo para imprimir el vector
        imprimirVector(vector1);
    }

// M�todo para cargar el vector con n�meros aleatorios
    public static void cargarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 9) + 1;
        }
    }

// M�todo para imprimir el vector en pantalla
    public static void imprimirVector(int[] vector) {
        // Imprime los �ndices del vector
        for (int i = 0; i < vector.length; i++) {
            System.out.print(String.format("%6d", i));
        }
        System.out.println("");

        // Imprime los valores del vector
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + String.format("%4d", vector[i]) + "]");
        }
    }

}
