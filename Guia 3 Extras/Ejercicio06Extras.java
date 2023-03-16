package ejercicio6extras;

import java.util.Scanner;

/**
 * @author Gerardo
 *
 * Leer la altura de N personas y determinar el promedio de estaturas que se
 * encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
public class Ejercicio6Extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // Creamos un objeto Scanner para leer datos desde teclado
        int cantidadPersonas; // Variable para almacenar la cantidad de personas a ingresar
        float altura, sumaAlturas = 0, promedioTotal, promedioBajo160 = 0; // Variables para almacenar alturas, sumas y promedios
        int contadorBajo160 = 0; // Contador para personas con altura menor a 1.60 mts.

        // Pedimos al usuario que ingrese la cantidad de personas
        System.out.print("Ingrese la cantidad de personas: ");
        cantidadPersonas = leer.nextInt();

        // Iteramos n veces para pedir las alturas de cada persona
        for (int i = 1; i <= cantidadPersonas; i++) {
            System.out.print("Ingrese la altura de la persona " + i + ": ");

            try {
                altura = Float.parseFloat(leer.next().replace(",", ".")); // Leemos la altura y la convertimos a float
            } catch (NumberFormatException e) {
                System.out.println("Error al ingresar la altura. Intente nuevamente.");
                i--; // Decrementamos el contador para que vuelva a pedir la altura de la misma persona
                continue; // Salteamos esta iteración y volvemos a pedir la altura
            }

            sumaAlturas += altura; // Sumamos la altura ingresada a la suma total

            if (altura < 1.60) { // Si la altura es menor a 1.60 mts.
                contadorBajo160++; // Incrementamos el contador de personas con altura menor a 1.60 mts.
                promedioBajo160 += altura; // Sumamos la altura a la suma de alturas por debajo de 1.60 mts.
            }
        }

        // Calculamos el promedio de alturas en general y el promedio de alturas por debajo de 1.60 mts.
        promedioTotal = sumaAlturas / cantidadPersonas;
        if (contadorBajo160 > 0) {
            promedioBajo160 /= contadorBajo160;
        }

        // Mostramos los resultados por pantalla
        System.out.println("Promedio de estaturas en general: " + String.format("%.3f", promedioTotal));
        System.out.println("Promedio de estaturas por debajo de 1.60 mts.: " + String.format("%.3f", promedioBajo160));

        //Cerramos el scanner
        leer.close();
    }
}
