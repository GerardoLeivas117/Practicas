
package ejercicio6;

/**
 *
 * @author Gerardo
 *
 * Realizar un programa que pida dos números enteros positivos por teclado y
 * muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y
 * el programa deberá mostrar el resultado por pantalla y luego volver al menú.
 * El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta
 * que, si el usuario selecciona la opción 5, en vez de salir del programa
 * directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
 * seguro que desea salir del programa (S/N)? Si el usuario selecciona el
 * carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el
 * menú.
 */
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        // Inicializar la variable para la opción elegida
        int opcion, num1, num2;
        //Inicializar una variable para el bucle
        boolean continuar = true;
        // Loop principal del programa, muestra el menú y ejecuta la opción elegida hasta que se elija salir (opción 5)
        do {
            // Pedir los números enteros positivos por teclado
            System.out.println("Ingrese el primer número entero positivo:");
            num1 = leer.nextInt();
            System.out.println("Ingrese el segundo número entero positivo:");
            num2 = leer.nextInt();
            System.out.println("\nMENU\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir");
            System.out.println("Elija una opción:");

            opcion = leer.nextInt(); //Leemos por teclado la opcion

            switch (opcion) {
                case 1: // Sumar los dos números
                    int suma = num1 + num2;
                    System.out.println("La suma es: " + suma);
                    break;

                case 2: // Restar el segundo número al primero
                    int resta = num1 - num2;
                    System.out.println("La resta es: " + resta);
                    break;

                case 3: // Multiplicar los dos números
                    int multiplicacion = num1 * num2;
                    System.out.println("La multiplicación es: " + multiplicacion);
                    break;

                case 4: // Dividir el primer número por el segundo
                    if (num2 == 0) {
                        System.out.println("No se puede dividir por cero");
                    } else {
                        int division = num1 / num2;
                        System.out.println("La división es: " + division);
                    }
                    break;

                case 5: // Salir del programa
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String confirmacion = leer.next();

                    if (confirmacion.equalsIgnoreCase("S")) {
                        System.out.println("Saliendo del programa.");
                        continuar = false; // Si el usuario elige "S", cambia la variable booleana a "false" para salir del bucle

                    } else {
                        continue;// Si el usuario elige cualquier otra opción, el bucle se reinicia y se muestra el menú de nuevo
                    }
                    break;

                default: // Opción inválida
                    System.out.println("Opción inválida");
                    break;

            }
        } while (continuar);// El bucle se repite mientras la variable "continuar" sea "true"

        leer.close(); //Cerramos el scanner
    }

}
