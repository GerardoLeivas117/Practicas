package ejercicio3extras;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 *
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
 * trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la
 * función equals() de la clase String.
 */
public class Ejercicio3Extras {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner leer = new Scanner(System.in);
        //Imprimimos en pantalla un mensaje solicitando el ingreso de una letras
        System.out.print("Ingrese una letra: ");
        // Leemos la letra ingresada y la convertimos a minúscula para simplificar la comparación
        String letra = leer.next().toLowerCase();

        if (letra.equals("a") || letra.equals("e") || letra.equals("i")
                || letra.equals("o") || letra.equals("u")) {
            System.out.println("La letra ingresada es una vocal.");
        } else {
            System.out.println("La letra ingresada no es una vocal.");
        }

        leer.close(); // Cerramos el objeto Scanner para liberar recursos
    }

}
