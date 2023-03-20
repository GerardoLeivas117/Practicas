package ejercicio2;

/**
 *
 * @author Gerardo
 *
 * Escriba un programa que averig�e si dos vectores de N enteros son iguales (la
 * comparaci�n deber� detenerse en cuanto se detecte alguna diferencia entre los
 * elementos).
 *
 */
public class Ejercicio2 {

    final static int TAMANIO = 15;  // Declarar una constante para el tama�o de los vectores

    public static void main(String[] args) {
        int[] vector1 = new int[TAMANIO];  // Crear un arreglo de enteros del tama�o especificado por la constante
        int[] vector2 = new int[TAMANIO];  // Crear otro arreglo de enteros del mismo tama�o
        boolean iguales = true;  // Inicializar una variable booleana para almacenar si los vectores son iguales o no

        for (int i = 0; i < vector1.length; i++) {  // Recorrer ambos vectores y asignarles el mismo valor
            vector1[i] = i;
            vector2[i] = i;
        }

        if (vector1.length == vector2.length) {  // Verificar si los vectores tienen el mismo tama�o
            for (int i = 0; i < vector1.length; i++) {  // Recorrer ambos vectores y comparar cada elemento
                if (vector1[i] != vector2[i]) {  // Si alg�n elemento es diferente, los vectores no son iguales
                    iguales = false;
                    break;
                }
            }
        } else {  // Si los vectores no tienen el mismo tama�o, no pueden ser iguales
            iguales = false;
        }

        if (iguales) {  // Si los vectores son iguales, imprimir un mensaje indic�ndolo
            System.out.println("Los vectores son iguales");
        } else {  // Si los vectores no son iguales, imprimir un mensaje indic�ndolo
            System.out.println("Los vectores son distintos");
        }
    }

}
