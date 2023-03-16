
package ejercicio6;

/**
 *
 * @author Gerardo
 *
 * Realizar un programa que pida dos n�meros enteros positivos por teclado y
 * muestre por pantalla el siguiente men�:El usuario deber� elegir una opci�n y
 * el programa deber� mostrar el resultado por pantalla y luego volver al men�.
 * El programa deber� ejecutarse hasta que se elija la opci�n 5. Tener en cuenta
 * que, si el usuario selecciona la opci�n 5, en vez de salir del programa
 * directamente, se debe mostrar el siguiente mensaje de confirmaci�n: �Est�
 * seguro que desea salir del programa (S/N)? Si el usuario selecciona el
 * car�cter �S� se sale del programa, caso contrario se vuelve a mostrar el
 * men�.
 */
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        // Inicializar la variable para la opci�n elegida
        int opcion, num1, num2;
        //Inicializar una variable para el bucle
        boolean continuar = true;
        // Loop principal del programa, muestra el men� y ejecuta la opci�n elegida hasta que se elija salir (opci�n 5)
        do {
            // Pedir los n�meros enteros positivos por teclado
            System.out.println("Ingrese el primer n�mero entero positivo:");
            num1 = leer.nextInt();
            System.out.println("Ingrese el segundo n�mero entero positivo:");
            num2 = leer.nextInt();
            System.out.println("\nMENU\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir");
            System.out.println("Elija una opci�n:");

            opcion = leer.nextInt(); //Leemos por teclado la opcion

            switch (opcion) {
                case 1: // Sumar los dos n�meros
                    int suma = num1 + num2;
                    System.out.println("La suma es: " + suma);
                    break;

                case 2: // Restar el segundo n�mero al primero
                    int resta = num1 - num2;
                    System.out.println("La resta es: " + resta);
                    break;

                case 3: // Multiplicar los dos n�meros
                    int multiplicacion = num1 * num2;
                    System.out.println("La multiplicaci�n es: " + multiplicacion);
                    break;

                case 4: // Dividir el primer n�mero por el segundo
                    if (num2 == 0) {
                        System.out.println("No se puede dividir por cero");
                    } else {
                        int division = num1 / num2;
                        System.out.println("La divisi�n es: " + division);
                    }
                    break;

                case 5: // Salir del programa
                    System.out.println("�Est� seguro que desea salir del programa (S/N)?");
                    String confirmacion = leer.next();

                    if (confirmacion.equalsIgnoreCase("S")) {
                        System.out.println("Saliendo del programa.");
                        continuar = false; // Si el usuario elige "S", cambia la variable booleana a "false" para salir del bucle

                    } else {
                        continue;// Si el usuario elige cualquier otra opci�n, el bucle se reinicia y se muestra el men� de nuevo
                    }
                    break;

                default: // Opci�n inv�lida
                    System.out.println("Opci�n inv�lida");
                    break;

            }
        } while (continuar);// El bucle se repite mientras la variable "continuar" sea "true"

        leer.close(); //Cerramos el scanner
    }

}
