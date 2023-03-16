
package ejercicio5;

import java.util.Scanner;

/**
 *
 * Escriba un programa en el cual se ingrese un valor li�mite positivo, y a
 * continuacio�n solicite nu�meros al usuario hasta que la suma de los nu�meros
 * introducidos supere el li�mite inicial.
 */
public class Ejercicio5 {


    public static void main(String[] args) {
        //Se crea un objeto Scanner para leer los datos ingresador por teclado
        Scanner leer = new Scanner(System.in);

        // Se pide al usuario que ingrese un valor l�mite positivo
        System.out.println("Ingrese un valor l�mite positivo:");
        int limite = leer.nextInt();

        // Se inicializan las variables para la suma y el n�mero ingresado
        int suma = 0;
        int num;

        // Se solicitan n�meros al usuario hasta que la suma de los n�meros ingresados supere el l�mite
        do {
            System.out.println("Ingrese un n�mero:");
            num = leer.nextInt();
            suma += num;
        } while (suma <= limite);

        // Se imprime un mensaje indicando que la suma de los n�meros ingresados super� el l�mite
        System.out.println("La suma de los n�meros ingresados super� el l�mite de " + limite);
        // Se imprime la suma total de los n�meros ingresados
        System.out.println("La suma total es: " + suma);

        // Se cierra el objeto Scanner para liberar recursos
        leer.close();
    }

}



