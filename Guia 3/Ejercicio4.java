package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 *
 * Escriba un programa que pida una frase o palabra y valide si la primera letra
 * de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberaì de
 * imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se
 * deberaì imprimir “INCORRECTO”. Nota: investigar la funcioìn Substring y
 * equals() de Java.
 *
 */
public class Ejercicio4 {

    // Letra clave que se busca al principio de la frase o palabra
    final static String LETRA_CLAVE = "A";

    public static void main(String[] args) {

        // Crear objeto Scanner para leer entrada del usuario
        Scanner leer = new Scanner(System.in);

        // Pedir al usuario que ingrese una palabra o frase
        System.out.println("Ingrese una palabra o frase:");
        String frase = leer.nextLine();

        // Cerrar el objeto Scanner para liberar recursos
        leer.close();

        // Si la primera letra de la frase es igual a la letra clave, imprimir "CORRECTO", sino, imprimir "INCORRECTO"
        if (frase.substring(0, 1).equalsIgnoreCase(LETRA_CLAVE)) {
            System.out.println("CORRECTO");
            
        } else {
            System.out.println("INCORRECTO");
        }
    }

}
