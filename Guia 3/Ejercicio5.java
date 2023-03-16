
package ejercicio5;

import java.util.Scanner;

/**
 *
 * Escriba un programa en el cual se ingrese un valor liìmite positivo, y a
 * continuacioìn solicite nuìmeros al usuario hasta que la suma de los nuìmeros
 * introducidos supere el liìmite inicial.
 */
public class Ejercicio5 {


    public static void main(String[] args) {
        //Se crea un objeto Scanner para leer los datos ingresador por teclado
        Scanner leer = new Scanner(System.in);

        // Se pide al usuario que ingrese un valor límite positivo
        System.out.println("Ingrese un valor límite positivo:");
        int limite = leer.nextInt();

        // Se inicializan las variables para la suma y el número ingresado
        int suma = 0;
        int num;

        // Se solicitan números al usuario hasta que la suma de los números ingresados supere el límite
        do {
            System.out.println("Ingrese un número:");
            num = leer.nextInt();
            suma += num;
        } while (suma <= limite);

        // Se imprime un mensaje indicando que la suma de los números ingresados superó el límite
        System.out.println("La suma de los números ingresados superó el límite de " + limite);
        // Se imprime la suma total de los números ingresados
        System.out.println("La suma total es: " + suma);

        // Se cierra el objeto Scanner para liberar recursos
        leer.close();
    }

}



