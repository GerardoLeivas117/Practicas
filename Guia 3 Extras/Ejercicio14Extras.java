package ejercicio14extras;

import java.util.Scanner;

/**
 * Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
 * cantidad de hijos. Escriba un programa que pida la cantidad de familias y
 * para cada familia la cantidad de hijos para averiguar la media de edad de los
 * hijos de todas las familias.
 */
public class Ejercicio14Extras {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int cantidadFamilias,cantidadHijos=0, edadHijo, edadTotal = 0;

        // Pedimos la cantidad de familias
        System.out.print("Ingrese la cantidad de familias: ");
        cantidadFamilias = leer.nextInt();

        // Pedimos la cantidad de hijos para cada familia y sumamos la edad de todos los hijos
        for (int i = 1; i <= cantidadFamilias; i++) {
            System.out.print("Ingrese la cantidad de hijos para la familia " + i + ": ");
            cantidadHijos = leer.nextInt();

            for (int j = 1; j <= cantidadHijos; j++) {
                System.out.print("Ingrese la edad del hijo " + j + ": ");
                edadHijo = leer.nextInt();
                edadTotal += edadHijo;
            }
        }

        // Calculamos la media de edad de los hijos de todas las familias, controlando la división por cero
        float mediaEdadHijos = 0.0f;
        if (cantidadFamilias > 0) {
            int totalHijos = cantidadFamilias * cantidadHijos;
            if (totalHijos > 0) {
                mediaEdadHijos = (float) edadTotal / (float) totalHijos;
            }
        }
        //Imprimimos por pantalla la media
        System.out.println("La media de edad de los hijos de todas las familias es: " + mediaEdadHijos);
        
        //Cerramos el scanner
        leer.close();
    }
}
